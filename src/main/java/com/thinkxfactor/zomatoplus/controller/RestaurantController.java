package com.thinkxfactor.zomatoplus.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.thinkxfactor.zomatoplus.models.Items;
import com.thinkxfactor.zomatoplus.models.Restaurant;
import com.thinkxfactor.zomatoplus.repository.ItemsRepository;
import com.thinkxfactor.zomatoplus.repository.RestaurantRepository;

@RestController
@RequestMapping("/restaurant")
public class RestaurantController {

	@Autowired
	private RestaurantRepository restaurantRepository;
	
	@PostMapping("/add")
	public Restaurant addRestaurant(@RequestBody Restaurant restaurant) {
		Restaurant persistedRestaurant = restaurantRepository.save(restaurant);
		return persistedRestaurant;
	}
	
	@PostMapping("/getAll")
	public List<Restaurant> getAll() {
		List<Restaurant> listOfRestaurants = restaurantRepository.findAll();
		return listOfRestaurants;
	}
	
	@Autowired
	private ItemsRepository itemsRepository;
	
	@PostMapping("/addItems")
	public Items addItems(@RequestBody Items item)
	{
		return itemsRepository.save(item);
	}
	
}