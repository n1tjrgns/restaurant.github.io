package com.n1tjrgns.reserve.restaurant.domain;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class MenuItemRepositoryImpl implements MenuItemRepository{

    private List<MenuItem> menuItems = new ArrayList<>();

    MenuItemRepositoryImpl(){
        menuItems.add(new MenuItem("Kimchi"));
    }

    @Override
    public List<MenuItem> findAllByRestaurnatId(Long restaurantId) {
        return menuItems;
    }
}
