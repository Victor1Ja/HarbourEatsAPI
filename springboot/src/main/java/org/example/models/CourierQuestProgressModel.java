package org.example.models;

import jakarta.persistence.*;
import lombok.ToString;

@Entity
@ToString
public class CourierQuestProgressModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    
    @Column(name = "courier_id")
    private Integer courierId;

//    @ManyToOne
//    @JoinColumn(name = "courier_id", referencedColumnName = "id")
//    private CourierModel courier;
//
//    @ManyToOne
//    @JoinColumn(name = "quest_id", referencedColumnName = "id")
//    private QuestModel quest;

    @Column(name = "quest_id")
    private Integer questId;
    
    @Column(name = "current_tier")
    private int currentTier;

    
    @Column(name = "orders_delivered")
    private int ordersDelivered;
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

    public int getCurrentTier() {
        return currentTier;
    }

    public void setCurrentTier(int currentTier) {
        this.currentTier = currentTier;
    }

    public int getOrdersDelivered() {
        return ordersDelivered;
    }

    public void setOrdersDelivered(int ordersDelivered) {
        this.ordersDelivered = ordersDelivered;
    }

    public CourierQuestProgressModel() {
    }

}
