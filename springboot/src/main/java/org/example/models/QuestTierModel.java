package org.example.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class QuestTierModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private Integer questId;

    private int tier_number;

    private int order_goal;

    private int reward;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getQuestId() {
        return questId;
    }

    public void setQuestId(Integer questId) {
        this.questId = questId;
    }

    public int getTier_number() {
        return tier_number;
    }

    public void setTier_number(int tier_number) {
        this.tier_number = tier_number;
    }

    public int getOrder_goal() {
        return order_goal;
    }

    public void setOrder_goal(int order_goal) {
        this.order_goal = order_goal;
    }

    public int getReward() {
        return reward;
    }

    public void setReward(int reward) {
        this.reward = reward;
    }

    public QuestTierModel() {
    }

}
