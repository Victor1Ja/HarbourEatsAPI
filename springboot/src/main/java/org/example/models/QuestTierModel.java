package org.example.models;

import jakarta.persistence.*;
import lombok.ToString;

@Entity
@ToString
public class QuestTierModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private Integer questId;

    @Column(name = "tier_number")
    private int tierNumber;

    @Column(name = "order_goal")
    private int orderGoal;

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

    public int getTierNumber() {
        return tierNumber;
    }

    public void setTierNumber(int tierNumber) {
        this.tierNumber = tierNumber;
    }

    public int getOrderGoal() {
        return orderGoal;
    }

    public void setOrderGoal(int order_goal) {
        this.orderGoal = order_goal;
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
