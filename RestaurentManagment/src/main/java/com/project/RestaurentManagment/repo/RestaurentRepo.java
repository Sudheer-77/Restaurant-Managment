package com.project.RestaurentManagment.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.RestaurentManagment.model.Restaurent;

@Repository
public interface RestaurentRepo extends JpaRepository<Restaurent,Integer>{

}
