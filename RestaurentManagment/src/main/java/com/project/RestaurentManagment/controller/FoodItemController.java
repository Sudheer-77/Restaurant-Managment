package com.project.RestaurentManagment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.RestaurentManagment.model.FoodItems;
import com.project.RestaurentManagment.repo.FoodItemsRepo;

@RestController
@RequestMapping
public class FoodItemController {
	@Autowired
	FoodItemsRepo foodItemRepo;

	@PostMapping
	FoodItems createFood(@RequestBody FoodItems foodItem) {
		return foodItemRepo.save(foodItem);

	}

	@GetMapping("getaAllFoodItems")
	List<FoodItems> getFoodItems() {
		return foodItemRepo.findAll();

	}

	@GetMapping("getFoodItems/{id}")
	 List<FoodItems> getFoodItemsByRestaurentId(@PathVariable Integer id){
		 return foodItemRepo.findByrestaurentId(id);
	}

	@PutMapping("/updateFoodItems/{id}")
	FoodItems UpdateFoodItems(@RequestBody FoodItems fooditems,@PathVariable Integer id){
		FoodItems foodItemsFromDb=foodItemRepo.findById(id).get();
		foodItemsFromDb.setName(fooditems.getName());
		foodItemsFromDb.setPrice(fooditems.getPrice());
		foodItemsFromDb.setRestaurent(fooditems.getRestaurent());
		
		return foodItemRepo.save(foodItemsFromDb);
	}
	
	@DeleteMapping("/deleteFoodItems/{id}")
	String deleeFoodItems(@PathVariable Integer id) {
		return "Successfully deleted food items by foodItem id: " + id;
	}
}
