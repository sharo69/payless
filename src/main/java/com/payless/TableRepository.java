package com.payless;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
@Qualifier(value = "tableRepository")
public interface TableRepository extends CrudRepository<Table, Long> {
}