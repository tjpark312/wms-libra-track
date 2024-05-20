package com.sh.inventory.model.dao;

import com.sh.inventory.model.dto.InventoryDto;

import java.util.List;

public interface InventoryMapper {
    List<InventoryDto> findAllInventory();
    InventoryDto findInventoryByInventoryId(int inventoryId);
    List<InventoryDto> findInventoryByLocation(String location);
    List<InventoryDto> findInventoryByCapacity(int capacity);
    int insertInventory(InventoryDto inventoryDto);
    int updateInventory(InventoryDto inventoryDto);
    int deleteInventory(int inventoryId);
}
