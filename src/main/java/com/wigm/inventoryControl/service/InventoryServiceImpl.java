package com.wigm.inventoryControl.service;

import com.wigm.inventoryControl.repository.ProductRepository;
import com.wigm.inventoryControl.entities.MessageDTO;
import com.wigm.inventoryControl.repository.entities.Inventory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

@Service
public class InventoryServiceImpl implements InventoryService{
    @Autowired
    private ProductRepository productRepository;

    @Override
    public MessageDTO createProduct(Inventory inventory) {
        try{
            productRepository.insert(inventory);
            return new MessageDTO("Aggregate product", HttpStatus.CREATED.value());
        } catch (Exception e){
            return new MessageDTO("Error: " + e.getMessage(), e.hashCode());
        }
    }

    @Override
    public Object getProduct(String id) {
        try{
            if (id == null || id.isEmpty() || id.isBlank()){
                return productRepository.findAll();
            }
            return productRepository.findById(id);
        } catch (Exception e){
            return new MessageDTO("Error: " + e.getMessage(), e.hashCode());
        }
    }

    @Override
    public MessageDTO updateProduct(Inventory inventory) {
        try{
            productRepository.save(inventory);
            return new MessageDTO("Update Product", HttpStatus.CREATED.value());
        } catch (Exception e){
            return new MessageDTO("Error: " + e.getMessage(), e.hashCode());
        }
    }

    @Override
    public MessageDTO deleteProduct(String id) {
        try{
            productRepository.deleteById(id);
            return new MessageDTO("Delete Product", HttpStatus.OK.value());
        } catch (Exception e){
            return new MessageDTO("Error: " + e.getMessage(), e.hashCode());
        }
    }
}
