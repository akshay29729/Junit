package com.in28minutes.SpringBootWithJunitAndMockito.controllers;

import com.in28minutes.SpringBootWithJunitAndMockito.buisness.ItemBuisnessService;
import com.in28minutes.SpringBootWithJunitAndMockito.model.Item;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;


@WebMvcTest(ItemController.class)
public class ItemFromBuisnessServiceControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private ItemBuisnessService mockItemBuisnessService;

    @Test
    public void ItemFromBuisnessServiceControllerTest() throws Exception {

        when(mockItemBuisnessService.getHardCodedItem()).thenReturn(new Item(2,"Second Item",12,4));

        // Creating Request
        RequestBuilder request = MockMvcRequestBuilders
                .get("/item-from-buisnessService")
                .accept(MediaType.APPLICATION_JSON);

        // Getting response of request
        MvcResult result = mockMvc.perform(request).andReturn();

        // Verify response
        assertEquals("{\"id\":2,\"name\":\"Second Item\",\"price\":12,\"quantity\":4}",result.getResponse().getContentAsString());

    }
    @Test
    public void getAllItemFromDatabaseTest() throws Exception {

        when(mockItemBuisnessService.getAllItems())
                .thenReturn(Arrays.asList(new Item(2,"Second Item",12,4),
                                          new Item(3,"Third Item",10,2) ));

        // Creating Request
        RequestBuilder request = MockMvcRequestBuilders
                .get("/all-items-from-database")
                .accept(MediaType.APPLICATION_JSON);

        // Getting response of request
        MvcResult result = mockMvc.perform(request).andReturn();

        // Verify response
        assertEquals("[{\"id\":2,\"name\":\"Second Item\",\"price\":12,\"quantity\":4,\"value\":0},{\"id\":3,\"name\":\"Third Item\",\"price\":10,\"quantity\":2,\"value\":0}]",result.getResponse().getContentAsString());

    }
}