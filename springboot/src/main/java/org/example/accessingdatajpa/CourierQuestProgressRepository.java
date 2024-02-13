package org.example.accessingdatajpa;

import org.example.models.CourierQuestProgressModel;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CourierQuestProgressRepository extends  CrudRepository<CourierQuestProgressModel, Integer>{

    List<CourierQuestProgressModel> findByCourierId(Integer courier_id);

    List<CourierQuestProgressModel> findByQuestId(Integer quest_id);

    CourierQuestProgressModel findByCourierIdAndQuestId(Integer courier_id, Integer quest_id);


}
