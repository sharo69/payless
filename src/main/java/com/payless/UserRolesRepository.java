package com.payless;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
@Qualifier(value = "userRoleRepository")
public interface UserRolesRepository extends CrudRepository<UserRole, Long> {


}