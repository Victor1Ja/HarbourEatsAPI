package org.example.controllers;

import kotlin.Unit;
import org.example.accessingdatajpa.CourierQuestProgressRepository;
import org.jetbrains.annotations.NotNull;
import org.openapitools.api.SystemApiController;
import org.openapitools.model.CourierProgressUpdateInput;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

@Component
public class SystemController extends SystemApiController {

    CourierQuestProgressRepository courierQuestProgressRepository;

    public SystemController(
        CourierQuestProgressRepository courierQuestProgressRepository
    ) {
        this.courierQuestProgressRepository = courierQuestProgressRepository;
    }

    @NotNull
    @Override
    public ResponseEntity<Unit> systemOrdersPost(@NotNull CourierProgressUpdateInput courierProgressUpdateInput) {
        var currentQuest = this.findActiveQuestForCourier(courierProgressUpdateInput.getCourierId());
        var courierQuestProgressModel = this.courierQuestProgressRepository.findByCourierIdAndQuestId(courierProgressUpdateInput.getCourierId(), currentQuest);
        if(courierQuestProgressModel != null) {
            courierQuestProgressModel.setOrdersDelivered(courierProgressUpdateInput.getOrdersDelivered());
            this.courierQuestProgressRepository.save(courierQuestProgressModel);
        }
        return ResponseEntity.ok().build();
    }
    protected Integer findActiveQuestForCourier(Integer courierId) {
        return 0;
    }
}
