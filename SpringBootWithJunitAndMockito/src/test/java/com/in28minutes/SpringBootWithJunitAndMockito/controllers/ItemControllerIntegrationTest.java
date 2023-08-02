package com.in28minutes.SpringBootWithJunitAndMockito.controllers;

import com.in28minutes.SpringBootWithJunitAndMockito.model.Item;
import org.hibernate.cfg.Environment;
import org.json.JSONException;
import org.junit.jupiter.api.Test;
import org.skyscreamer.jsonassert.JSONAssert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class ItemControllerIntegrationTest {

    @Autowired
    private TestRestTemplate testRestTemplate;

    @Test
    public void itemController_contextLoad() throws JSONException {
       String response =  this.testRestTemplate.getForObject("/all-items-from-database",String.class);

        JSONAssert.assertEquals("[{id:10001},{id:10002},{id:10003}]",response,false);
    }

}
