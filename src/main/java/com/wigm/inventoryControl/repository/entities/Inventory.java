package com.wigm.inventoryControl.repository.entities;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document("inventory")
public class Inventory {
    @Id
    private String item;
    private int qty;
    private Size size;
    private String status;
}
