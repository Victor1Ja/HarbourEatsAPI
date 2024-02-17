package org.example.accessingdatajpa;

import org.example.models.QuestModel;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface QuestRepository extends CrudRepository<QuestModel, Integer> {
    List<QuestModel> findByName(String name);
}
