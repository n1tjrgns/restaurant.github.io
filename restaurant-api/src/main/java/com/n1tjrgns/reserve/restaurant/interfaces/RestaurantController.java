package com.n1tjrgns.reserve.restaurant.interfaces;

import com.n1tjrgns.reserve.restaurant.domain.Restaurant;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class RestaurantController {

    @GetMapping("/restaurants")
    public List<Restaurant> list(){
        List<Restaurant> restaurants = new ArrayList<>();

        Restaurant restaurant = new Restaurant("Bob","Seoul");

        restaurants.add(restaurant);

        return restaurants;
    }
}
