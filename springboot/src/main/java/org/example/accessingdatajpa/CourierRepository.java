package org.example.accessingdatajpa;

import org.example.models.CourierModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource(collectionResourceRel = "courier", path = "courier")
public interface CourierRepository extends CrudRepository<CourierModel, Integer>, PagingAndSortingRepository<CourierModel, Integer> {
    CourierModel findByEmail(String email);
    CourierModel findByPhone(String phone);
    CourierModel findByName(String name);
}
