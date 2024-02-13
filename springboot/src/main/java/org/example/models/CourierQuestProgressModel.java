package org.example.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class CourierQuestProgressModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private Integer courier_id;
    private Integer quest_id;
    private int current_tier;
    private int orders_delivered;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCourierId() {
        return courier_id;
    }

    public void setCourierId(Integer courier_id) {
        this.courier_id = courier_id;
    }

    public Integer getQuestId() {
        return quest_id;
    }

    public void setQuestId(Integer quest_id) {
        this.quest_id = quest_id;
    }

    public int getCurrentTier() {
        return current_tier;
    }

    public void setCurrentTier(int current_tier) {
        this.current_tier = current_tier;
    }

    public int getOrdersDelivered() {
        return orders_delivered;
    }

    public void setOrdersDelivered(int orders_delivered) {
        this.orders_delivered = orders_delivered;
    }

    public CourierQuestProgressModel() {
    }




}
