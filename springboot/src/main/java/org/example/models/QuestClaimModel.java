package org.example.models;

import jakarta.persistence.*;
import lombok.ToString;

@Entity
@ToString
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

//    @ManyToOne
//    @JoinColumn(name = "courier_id", referencedColumnName = "id")
//    private CourierModel courier;
//
//    @ManyToOne
//    @JoinColumn(name = "quest_id", referencedColumnName = "id")
//    private QuestModel quest;
//
//    @ManyToOne
//    @JoinColumn(name = "tier_id", referencedColumnName = "id")
//    private QuestTierModel tier;

    public QuestClaimModel() {
    }

    public QuestClaimModel( int CourierId, int QuestId, int TierId) {
        this.courierId = CourierId;
        this.questId = QuestId;
        this.tierId = TierId;
    }

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

}
