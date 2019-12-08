package com.n1tjrgns.reserve.restaurant.domain;

import org.springframework.stereotype.Component;
import java.util.ArrayList;
import java.util.List;

@Component
public class RestaurantRepositoryImpl implements RestaurantRepository {

    private List<Restaurant> restaurants = new ArrayList<>();

    public RestaurantRepositoryImpl(){
        restaurants.add(new Restaurant(1004L,  "Bob","Seoul"));
        restaurants.add(new Restaurant(2004L, "Food","Seoul"));
    }

    @Override
    public List<Restaurant> findAll() {
        return restaurants;
    }

    @Override
    public Restaurant findById(Long id) {
        return restaurants.stream()
                .filter(rest -> rest.getId().equals(id))
                .findFirst()
                .orElse(null);
    }
}
