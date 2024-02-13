package org.example.accessingdatajpa;

import org.example.models.QuestTierModel;
import org.jetbrains.annotations.NotNull;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface QuestTierRepository extends CrudRepository<QuestTierModel, Integer> {
    List<QuestTierModel> findByQuestId(Integer quest_id);

    }
