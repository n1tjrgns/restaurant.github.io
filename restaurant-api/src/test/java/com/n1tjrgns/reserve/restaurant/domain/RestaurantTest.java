package com.n1tjrgns.reserve.restaurant.domain;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class RestaurantTest {

    /*@Test
    public void creation1(){
        Restaurant restaurant = new Restaurant();
        assertThat(restaurant.getName(), is("Bob"));
    }*/


    @Test
    public void creation2(){
        Restaurant restaurant = new Restaurant("Bob", "Seoul");
        assertThat(restaurant.getName(), is("Bob"));
    }

    @Test
    public void creation3(){
        Restaurant restaurant = new Restaurant("Bob", "Seoul");
        assertThat(restaurant.getName(), is("Bob"));
    }

    @Test
    public void information(){
        Restaurant restaurant = new Restaurant("Bob","Seoul");

        assertThat(restaurant.getInformation(), is("Bob in Seoul"));
    }
}