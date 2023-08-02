package com.in28minutes.SpringBootWithJunitAndMockito.buisness;

import com.in28minutes.SpringBootWithJunitAndMockito.model.Item;
import com.in28minutes.SpringBootWithJunitAndMockito.repositories.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ItemBuisnessService {

    @Autowired
    private ItemRepository itemRepository;

    public Item getHardCodedItem() {
        return new Item(2,"Second Item", 12,4);
    }

    public List<Item> getAllItems(){
        List<Item> items = itemRepository.findAll();
        for(Item item:items){
            item.setValue(item.getPrice()*item.getQuantity());
        }
        return items;
    }
}
