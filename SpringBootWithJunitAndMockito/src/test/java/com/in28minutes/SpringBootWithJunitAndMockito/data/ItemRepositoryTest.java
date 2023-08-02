package com.in28minutes.SpringBootWithJunitAndMockito.data;

import com.in28minutes.SpringBootWithJunitAndMockito.model.Item;
import com.in28minutes.SpringBootWithJunitAndMockito.repositories.ItemRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DataJpaTest
public class ItemRepositoryTest {

    @Autowired
    private ItemRepository itemRepository;
    @Test
    public void itemRepositoryTest_findAll(){
        List<Item> items = itemRepository.findAll();
        assertEquals(3,items.size());
    }
}
