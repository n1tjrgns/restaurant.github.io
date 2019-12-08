package com.n1tjrgns.reserve.restaurant.interfaces;

import com.n1tjrgns.reserve.restaurant.domain.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RestaurantController {

    @Autowired
    //private RestaurantRepository restaurantRepository = new RestaurantRepository();
    private RestaurantRepository restaurantRepository;

    @Autowired
    private MenuItemRepository menuItemRepository;

    @GetMapping("/restaurants")
    public List<Restaurant> list(){
        /*List<Restaurant> restaurants = new ArrayList<>();

        restaurants.add(new Restaurant(1004L,  "Bob","Seoul"));
        restaurants.add(new Restaurant(2004L, "Food","Seoul"));*/

        //위의 3줄을 Repository를 사용해서 1줄로 대체
        List<Restaurant> restaurants = restaurantRepository.findAll();

        return restaurants;
    }

    @GetMapping("/restaurants/{id}")
    public Restaurant detail(@PathVariable Long id){
        /*List<Restaurant> restaurants = new ArrayList<>();

        restaurants.add(new Restaurant(1004L,  "Bob","Seoul"));
        restaurants.add(new Restaurant(2004L, "Food","Seoul"));*/

        //위의 3줄을 Repository를 사용해서 1줄로 대체
        Restaurant restaurants = restaurantRepository.findById(id);

        List<MenuItem> menuItems = menuItemRepository.findAllByRestaurnatId(id);
        restaurants.setMenuItem(menuItems);
       /* Restaurant restaurant = restaurants.stream()
                .filter(rest -> rest.getId().equals(id))
                .findFirst()
                .orElse(null); */ // 서비스 로직 분리하기 - >  RestaurantRepository
        return restaurants;
    }
}
