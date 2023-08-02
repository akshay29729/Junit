package com.in28minutes.SpringBootWithJunitAndMockito.controllers;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;


@WebMvcTest(HelloWorldController.class)
public class HelloWorldControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void helloWorldControllerTest() throws Exception {
        // Creating Request
        RequestBuilder request = MockMvcRequestBuilders
                .get("/hello-world")
                .accept(MediaType.APPLICATION_JSON);

        // Getting response of request
        MvcResult result = mockMvc.perform(request).andReturn();

        // Verify response
        assertEquals("Hello World...",result.getResponse().getContentAsString());

        // As response is simple, we can also do(for lines 28-32)
//        MvcResult result1 = mockMvc.perform(request)
//                .andExpect(status().isOk())
//                .andExpect(content().string("Hello World..."))
//                .andReturn();
    }
}