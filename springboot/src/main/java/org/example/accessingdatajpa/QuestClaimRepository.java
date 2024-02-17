package org.example.accessingdatajpa;

import org.example.models.QuestClaimModel;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface QuestClaimRepository extends CrudRepository<QuestClaimModel, Integer> {
    List<QuestClaimModel> findByCourierId(Integer courier_id);
    List<QuestClaimModel> findByQuestId(Integer quest_id);
    QuestClaimModel findByCourierIdAndQuestId(Integer courier_id, Integer quest_id);
    Boolean existsByCourierIdAndQuestIdAndTierId(Integer courier_id, Integer quest_id, Integer tier_id);

}
