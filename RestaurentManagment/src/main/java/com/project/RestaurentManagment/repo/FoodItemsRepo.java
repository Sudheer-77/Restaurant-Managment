package com.project.RestaurentManagment.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.RestaurentManagment.model.FoodItems;

@Repository
public interface FoodItemsRepo extends JpaRepository<FoodItems,Integer>{

	List<FoodItems> findByrestaurentId(Integer id);

}
