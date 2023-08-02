package com.in28minutes.SpringBootWithJunitAndMockito.repositories;

import com.in28minutes.SpringBootWithJunitAndMockito.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item,Integer> {
}
