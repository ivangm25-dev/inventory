package com.wigm.inventoryControl.controller;

import static com.wigm.inventoryControl.utils.Constants.PATH;

import com.wigm.inventoryControl.entities.MessageDTO;
import com.wigm.inventoryControl.repository.entities.Inventory;
import com.wigm.inventoryControl.service.InventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController()
@RequestMapping(PATH)
public class InventoryController {

    @Autowired
    private InventoryService inventoryService;

    @PostMapping()
    public MessageDTO createProduct(@RequestBody Inventory inventory){
        return inventoryService.createProduct(inventory);
    }

    @GetMapping()
    public ResponseEntity<?> getProduct(@RequestParam(required = false) String id) {
        return new ResponseEntity<>(inventoryService.getProduct(id), HttpStatus.OK);
    }

    @PutMapping()
    public MessageDTO updateProduct(@RequestBody Inventory inventory) {
        return inventoryService.updateProduct(inventory);
    }

    @DeleteMapping()
    public Object deleteProduct(@RequestParam String id) {
        return inventoryService.deleteProduct(id);
    }
}
