package com.n1tjrgns.reserve.restaurant.interfaces;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.CoreMatchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

//컨트롤러 테스트하기
@RunWith(SpringRunner.class)
@WebMvcTest(RestaurantController.class) //테스트 할 클래스 명시
public class RestaurantControllerTest {

    @Autowired
    private MockMvc mvc;

    @Test
    public void list() throws Exception {
        mvc.perform(get("/restaurants"))
                .andExpect(status().isOk()) //getMapping의 상태값 확인
                .andExpect(content().string(containsString("Bob"))); //콘텐츠 안의 값이 Bob이 포함되어있는지
    }

    @Test
    public void list2() throws Exception {
        mvc.perform(get("/restaurants"))
                .andExpect(status().isOk()) //getMapping의 상태값 확인
                .andExpect(content().string(containsString("\"name\":\"Bob\""))); //json 형태로
    }
}