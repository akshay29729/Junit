package com.in28minutes.SpringBootWithJunitAndMockito.controllers;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import static org.junit.jupiter.api.Assertions.assertEquals;


@WebMvcTest(ItemController.class)
public class ItemControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void ItemControllerTest() throws Exception {
        // Creating Request
        RequestBuilder request = MockMvcRequestBuilders
                .get("/dummy-item")
                .accept(MediaType.APPLICATION_JSON);

        // Getting response of request
        MvcResult result = mockMvc.perform(request).andReturn();

        // Verify response
        assertEquals("{\"id\":1,\"name\":\"First Item\",\"price\":10,\"quantity\":5}",result.getResponse().getContentAsString());

        // As response is simple, we can also do(for lines 28-32)
//        MvcResult result1 = mockMvc.perform(request)
//                .andExpect(status().isOk())
//                .andExpect(content().string("{\"id\":1,\"name\":\"First Item\",\"price\":10,\"quantity\":5}"))
//                .andExpect(content().json("{\"id\":1,\"name\":\"First Item\",\"price\":10,\"quantity\":5}"))
//                .andExpect(content().json("{\"name\":\"First Item\",\"price\":10}"))
//                .andReturn();
    }
}