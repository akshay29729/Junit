package com.in28minutes.SpringBootWithJunitAndMockito.data;

import com.in28minutes.SpringBootWithJunitAndMockito.buisness.ItemBuisnessService;
import com.in28minutes.SpringBootWithJunitAndMockito.buisness.SimpleBuisnessImpl;
import com.in28minutes.SpringBootWithJunitAndMockito.model.Item;
import com.in28minutes.SpringBootWithJunitAndMockito.repositories.ItemRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class ItemBuisnessServiceMOCK {

    @Mock
    private ItemRepository itemRepository;

    @InjectMocks
    private ItemBuisnessService itemBuisnessService;

    @Test
    public void getAllItemsTest_basic_BUISNESS_LAYER(){
        when(itemRepository.findAll()).thenReturn(Arrays.asList(new Item(2,"Second Item",12,4),
                new Item(3,"Third Item",10,2) ));

        List<Item> items = itemBuisnessService.getAllItems();
        assertEquals(48,items.get(0).getValue());
        assertEquals(20,items.get(1).getValue());
    }
}
