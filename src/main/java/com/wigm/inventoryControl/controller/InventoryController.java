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
    public ResponseEntity<MessageDTO> createProduct(@RequestBody Inventory inventory){
        return new ResponseEntity<>(inventoryService.createProduct(inventory), HttpStatus.CREATED);
    }

    @GetMapping()
    public ResponseEntity<?> getProduct(@RequestParam(required = false) String id) {
        return new ResponseEntity<>(inventoryService.getProduct(id), HttpStatus.OK);
    }

    @PutMapping()
    public ResponseEntity<MessageDTO> updateProduct(@RequestBody Inventory inventory) {
        return new ResponseEntity<>(inventoryService.updateProduct(inventory), HttpStatus.OK);
    }

    @DeleteMapping()
    public ResponseEntity<?> deleteProduct(@RequestParam String id) {
        return new ResponseEntity<>(inventoryService.deleteProduct(id), HttpStatus.OK);
    }
}
