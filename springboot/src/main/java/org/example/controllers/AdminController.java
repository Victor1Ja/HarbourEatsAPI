package org.example.controllers;

import kotlin.Unit;
import org.example.accessingdatajpa.QuestRepository;
import org.example.accessingdatajpa.QuestTierRepository;
import org.example.models.QuestModel;
import org.example.models.QuestTierModel;
import org.jetbrains.annotations.NotNull;
import org.openapitools.api.AdminApiController;
import org.openapitools.model.Quest;
import org.openapitools.model.QuestInput;
import org.openapitools.model.QuestTier;
import org.openapitools.model.TierInput;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Component
public class AdminController  extends AdminApiController{

    QuestRepository questRepository;
    QuestTierRepository questTierRepository;

    public AdminController(
        @Autowired QuestRepository questRepository,
        @Autowired QuestTierRepository questTierRepository
    ) {
        this.questRepository = questRepository;
        this.questTierRepository = questTierRepository;
    }
    @Override
    @NotNull
    public ResponseEntity<List<Quest>> adminQuestsGet() {
        var quests = this.questRepository.findAll();
        var response = new ArrayList<Quest>();
        for (var quest : quests) {
            var questOut = new Quest(quest.getId(), quest.getName(), quest.getDuration());
            response.add(questOut);
        }
        return ResponseEntity.ok().body(response);
    }

    @NotNull
    @Override
    public ResponseEntity<Unit> adminQuestsIdDelete(@PathVariable int id) {
        this.questRepository.deleteById(id);
        return ResponseEntity.ok().build();
    }

    @NotNull
    @Override
    public ResponseEntity<Quest> adminQuestsIdGet(@PathVariable int id) {
        var questModel = this.questRepository.findById(id);
        return questModel.map(questModel1 -> {
            var quest = new Quest(questModel1.getId(), questModel1.getName(), questModel1.getDuration());
            return ResponseEntity.ok().body(quest);
        }).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @NotNull
    @Override
    public ResponseEntity<Quest> adminQuestsIdPut(@PathVariable int id,@RequestParam @NotNull QuestInput questInput) {
        var questModel = this.questRepository.findById(id);
        questModel.ifPresent(questModel1 -> {
            questModel1.setName(questInput.getName());
            questModel1.setDuration(questInput.getDuration());
            this.questRepository.save(questModel1);
        });
    var quest = new Quest(id, questInput.getName(), questInput.getDuration());
        return ResponseEntity.ok().body(quest);

    }

    @NotNull
    @Override
    public ResponseEntity<Quest> adminQuestsPost(@RequestParam @NotNull QuestInput questInput) {
        QuestModel QuestModel = new QuestModel();
        QuestModel.setName(questInput.getName());
        QuestModel.setDuration(questInput.getDuration());
        this.questRepository.save(QuestModel);
        var quest = new Quest(QuestModel.getId(), QuestModel.getName(), QuestModel.getDuration());
        return ResponseEntity.ok().body(quest);
    }

    @NotNull
    @Override
    public ResponseEntity<List<QuestTier>> adminQuestsQuestIdTiersGet(@PathVariable int questId) {
        var tiers = this.questTierRepository.findByQuestId( questId);
        var response = new ArrayList<QuestTier>();
        for (var tier : tiers) {
            var tierOut = new QuestTier(tier.getId(), tier.getQuestId(), tier.getTierNumber(), tier.getOrderGoal(), tier.getReward());
            response.add(tierOut);
        }
        return ResponseEntity.ok().body(response);


    }

    @NotNull
    @Override
    public ResponseEntity<QuestTier> adminQuestsQuestIdTiersPost(int questId, @NotNull TierInput tierInput) {
        QuestTierModel questTierModel = new QuestTierModel();
        questTierModel.setQuestId(questId);
        questTierModel.setTierNumber(tierInput.getTierNumber());
        questTierModel.setReward(tierInput.getReward());
        this.questTierRepository.save(questTierModel);
        var tier = new QuestTier(questTierModel.getId(), questTierModel.getQuestId(), questTierModel.getTierNumber(), questTierModel.getOrderGoal(), questTierModel.getReward());
        return ResponseEntity.ok().body(tier);
    }

    @NotNull
    
    public ResponseEntity<Unit> adminQuestsQuestIdTiersTierIdDelete(int questId, int tierId) {
        this.questTierRepository.deleteById(tierId);
        return ResponseEntity.ok().build();
    }

    @NotNull
    @Override
    public ResponseEntity<QuestTier> adminQuestsQuestIdTiersTierIdGet(int questId, int tierId) {
        var questTierModel = this.questTierRepository.findById(tierId);
        return questTierModel.map(questTierModel1 -> {
            var tier = new QuestTier(questTierModel1.getId(), questTierModel1.getQuestId(), questTierModel1.getTierNumber(), questTierModel1.getOrderGoal(), questTierModel1.getReward());
            return ResponseEntity.ok().body(tier);
        }).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @NotNull
    @Override
    public ResponseEntity<QuestTier> adminQuestsQuestIdTiersTierIdPut(int questId, int tierId, @NotNull TierInput tierInput) {
        var questTierModel = this.questTierRepository.findById(tierId);
        questTierModel.ifPresent(questTierModel1 -> {
            questTierModel1.setOrderGoal(tierInput.getOrderGoal());
            questTierModel1.setReward(tierInput.getReward());
            this.questTierRepository.save(questTierModel1);
        });
        var tier = new QuestTier(tierId, questId, tierInput.getTierNumber(), tierInput.getOrderGoal(), tierInput.getReward());
        return ResponseEntity.ok().body(tier);
    }
}
