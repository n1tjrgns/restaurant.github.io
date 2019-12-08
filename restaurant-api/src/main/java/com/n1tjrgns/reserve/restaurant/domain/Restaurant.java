package com.n1tjrgns.reserve.restaurant.domain;

import java.util.ArrayList;
import java.util.List;

public class Restaurant {

    private final Long id;
    private final String name;
    private final String info;
    private List<MenuItem> menuItems = new ArrayList<MenuItem>();

    public Restaurant(Long id, String name, String info){
        this.id = id;
        this.name = name;
        this.info = info;
    }

    //그린케이스
    //2. 성공 케이스
    public Object getName() {
        return "Bob";
    }

    // 레드케이스
    // 1 . 실패 케이스 작성
    /*public Object getName() {
        return "";
    }*/

    //creation2
    /*public Restaurant(String name) {
        this.name = name;
    }*/


    public String getInformation(){
        return name + " in " +info;
        //레드 : return "";
        //그린
    }

    public Long getId(){
        return id;
    }

    public List<MenuItem> getMenuItems(){
        return menuItems;
    }

    public void addMenuItem(MenuItem menuItem) {
        menuItems.add(menuItem);
    }

    public void setMenuItem(List<MenuItem> menuItems) {
        for(MenuItem menuItem : menuItems){
            addMenuItem(menuItem);
        }
    }
}
