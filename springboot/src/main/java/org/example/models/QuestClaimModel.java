package org.example.models;

import jakarta.persistence.*;

@Entity
public class QuestClaimModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column(name = "courier_id")
    private Integer courierId;
    @Column(name = "quest_id")
    private Integer questId;
    @Column(name = "tier_id")
    private Integer tierId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCourierId() {
        return courierId;
    }

    public void setCourierId(Integer courierId) {
        this.courierId = courierId;
    }

    public Integer getQuestId() {
        return questId;
    }

    public void setQuestId(Integer questId) {
        this.questId = questId;
    }

    public Integer getTierId() {
        return tierId;
    }

    public void setTierId(Integer tierId) {
        this.tierId = tierId;
    }

    public QuestClaimModel() {
    }

    public QuestClaimModel(Integer courierId, Integer questId, Integer tierId) {
        this.courierId = courierId;
        this.questId = questId;
        this.tierId = tierId;
    }



}
