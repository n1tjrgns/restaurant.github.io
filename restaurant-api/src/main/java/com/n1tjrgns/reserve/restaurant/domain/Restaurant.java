package com.n1tjrgns.reserve.restaurant.domain;

public class Restaurant {

    // 레드케이스
    // 1 . 실패 케이스 작성
    /*public Object getName() {
        return "";
    }*/

    //그린케이스
    //2. 성공 케이스
    public Object getName() {
        return "Bob";
    }

    private final String name;
    private final String info;

    //creation2
    /*public Restaurant(String name) {
        this.name = name;
    }*/

    //information
    public Restaurant(String name, String info) {
        this.name = name;
        this.info = info;
    }

    public String getInformation(){
        return name + " in " +info;
        //레드 : return "";
        //그린

    }

}
