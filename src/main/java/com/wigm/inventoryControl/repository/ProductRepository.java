package com.wigm.inventoryControl.repository;

import com.wigm.inventoryControl.repository.entities.Inventory;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Inventory, String> {

}
