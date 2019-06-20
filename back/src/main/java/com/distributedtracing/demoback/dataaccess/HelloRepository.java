package com.distributedtracing.demoback.dataaccess;

import org.springframework.data.repository.CrudRepository;

public interface HelloRepository extends CrudRepository<HelloEntity, String> {

}
