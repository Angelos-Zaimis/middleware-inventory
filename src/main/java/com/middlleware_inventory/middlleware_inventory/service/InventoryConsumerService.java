package com.middlleware_inventory.middlleware_inventory.service;

import com.middlleware_inventory.middlleware_inventory.dto.product.UpdateInventoryDTO;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class InventoryConsumerService {


    public void handleUpdateInventory(UpdateInventoryDTO updateInventoryDTO) {

    }
}
