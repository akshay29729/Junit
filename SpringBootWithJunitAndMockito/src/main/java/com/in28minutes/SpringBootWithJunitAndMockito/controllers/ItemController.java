package com.in28minutes.SpringBootWithJunitAndMockito.controllers;

import com.in28minutes.SpringBootWithJunitAndMockito.buisness.ItemBuisnessService;
import com.in28minutes.SpringBootWithJunitAndMockito.model.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ItemController {

    @Autowired
    private ItemBuisnessService itemBuisnessService;

    @GetMapping("/dummy-item")
    public Item getDummyItem(){
        return new Item(1,"First Item", 10,5);
    }

    @GetMapping("/item-from-buisnessService")
    public Item getItemFromBuisnessService(){
        return itemBuisnessService.getHardCodedItem();
    }

    @GetMapping("/all-items-from-database")
    public List<Item> getAllItemFromDatabase(){
        return itemBuisnessService.getAllItems();
    }
}
