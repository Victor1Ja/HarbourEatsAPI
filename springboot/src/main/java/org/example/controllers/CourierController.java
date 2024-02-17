package org.example.controllers;

import kotlin.Unit;
import org.example.accessingdatajpa.CourierQuestProgressRepository;
import org.example.accessingdatajpa.QuestClaimRepository;
import org.example.accessingdatajpa.QuestRepository;
import org.example.models.QuestClaimModel;
import org.jetbrains.annotations.NotNull;
import org.openapitools.api.CourierApiController;
import org.openapitools.model.CourierQuestProgress;
import org.openapitools.model.Quest;
import org.openapitools.model.RewardClaimInput;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CourierController extends CourierApiController {
    CourierQuestProgressRepository courierQuestProgressRepository;
    QuestRepository questRepository;
    QuestClaimRepository questClaimRepository;


    public CourierController(
        CourierQuestProgressRepository courierQuestProgressRepository,
        QuestRepository questRepository,
        QuestClaimRepository questClaimRepository
    ) {
        this.courierQuestProgressRepository = courierQuestProgressRepository;
        this.questRepository = questRepository;
        this.questClaimRepository = questClaimRepository;
    }

    @NotNull
    @Override
    public ResponseEntity<List<Quest>> courierCourierIdQuestsGet(int courierId) {
        var quests = this.courierQuestProgressRepository.findByCourierId(courierId);
        var response = new java.util.ArrayList<Quest>();
        for (var quest : quests) {
            var questModel = this.questRepository.findById(quest.getQuestId());
            // is present and quest
            if (questModel.isPresent()){
                var questOut = new Quest(questModel.get().getId(), questModel.get().getName(), questModel.get().getDuration());
                response.add(questOut);
            }
        }
        return ResponseEntity.ok().body(response);
    }

    @NotNull
    @Override
    public ResponseEntity<CourierQuestProgress> courierCourierIdQuestsQuestIdProgressGet(int questId, int courierId) {
        var courierQuestProgressModel = this.courierQuestProgressRepository.findByCourierIdAndQuestId(courierId, questId);
        if (courierQuestProgressModel != null) {
            var response = new CourierQuestProgress(courierQuestProgressModel.getCourierId(), courierQuestProgressModel.getQuestId(),courierQuestProgressModel.getCurrentTier() ,courierQuestProgressModel.getOrdersDelivered());
            return ResponseEntity.ok().body(response);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
    @NotNull
    @Override
    public ResponseEntity<Unit> courierRewardsPost(@NotNull RewardClaimInput rewardClaimInput) {
        if (this.questClaimRepository.existsByCourierIdAndQuestIdAndTierId(rewardClaimInput.getCourierId(), rewardClaimInput.getQuestId(), rewardClaimInput.getTierNumber())) {
            return ResponseEntity.badRequest().build();
        }
        this.questClaimRepository.save( new QuestClaimModel(rewardClaimInput.getCourierId(), rewardClaimInput.getQuestId(), rewardClaimInput.getTierNumber()));
        return ResponseEntity.ok().build();
    }

}
