package com.myproject.flight.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.myproject.flight.model.RoleModel;

public interface RoleRepository extends JpaRepository<RoleModel, Integer>{

}
