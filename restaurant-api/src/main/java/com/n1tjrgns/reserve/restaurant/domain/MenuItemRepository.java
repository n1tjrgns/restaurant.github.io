package com.n1tjrgns.reserve.restaurant.domain;

import java.util.List;

public interface MenuItemRepository {
    List<MenuItem> findAllByRestaurnatId(Long restaurantId);
}
