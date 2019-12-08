package com.n1tjrgns.reserve.restaurant.interfaces;

import com.n1tjrgns.reserve.restaurant.application.RestaurantService;
import com.n1tjrgns.reserve.restaurant.domain.MenuItemRepository;
import com.n1tjrgns.reserve.restaurant.domain.MenuItemRepositoryImpl;
import com.n1tjrgns.reserve.restaurant.domain.RestaurantRepositoryImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.SpyBean;
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

    // 컨트롤러에 원하는 객체를 주입 가능
    @SpyBean(RestaurantRepositoryImpl.class)
    private RestaurantRepositoryImpl restaurantRepository;

    @SpyBean(MenuItemRepositoryImpl.class)
    private MenuItemRepository menuItemRepository;

    @SpyBean(RestaurantService.class)
    private RestaurantService restaurantService;

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

    @Test
    public void detail() throws Exception {
        mvc.perform(get("restaurants/1"))
                .andExpect(status().isOk())
        .andExpect(content().string(containsString("\"id\":\"2020\""))) //json 형태로
        .andExpect(content().string(containsString("\"name\":\"Food\""))) //json 형태로
        .andExpect(content().string(containsString("Kimchi")));
    }
}