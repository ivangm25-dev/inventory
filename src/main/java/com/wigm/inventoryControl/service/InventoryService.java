package com.wigm.inventoryControl.service;

import com.wigm.inventoryControl.entities.MessageDTO;
import com.wigm.inventoryControl.repository.entities.Inventory;

public interface InventoryService {
    /**
     * Create New product.
     * @param productDTO
     * @return
     */
    MessageDTO createProduct(Inventory productDTO);

    /**
     * Get products.
     * @param id
     * @return
     */
    Object getProduct(String id);

    /**
     * Update Product By Id.
     * @param productDTO
     * @return
     */
    MessageDTO updateProduct(Inventory productDTO);

    /**
     * Delete product by Id.
     * @param id
     * @return
     */
    MessageDTO deleteProduct(String id);
}
