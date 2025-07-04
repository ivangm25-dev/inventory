package com.wigm.inventoryControl.service;

import com.wigm.inventoryControl.entities.MessageDTO;
import com.wigm.inventoryControl.repository.entities.Inventory;

public interface InventoryService {
    /**
     *
     * @param productDTO
     * @return
     */
    MessageDTO createProduct(Inventory productDTO);

    /**
     *
     * @param id
     * @return
     */
    Object getProduct(String id);

    /**
     *
     * @param productDTO
     * @return
     */
    MessageDTO updateProduct(Inventory productDTO);

    /**
     *
     * @param id
     * @return
     */
    MessageDTO deleteProduct(String id);
}
