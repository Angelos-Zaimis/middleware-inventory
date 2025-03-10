package com.middlleware_inventory.middlleware_inventory.service.kafka;

import com.middlleware_inventory.middlleware_inventory.configuration.kafka.KafkaGroup;
import com.middlleware_inventory.middlleware_inventory.configuration.kafka.KafkaTopics;
import com.middlleware_inventory.middlleware_inventory.dto.product.UpdateInventoryDTO;
import com.middlleware_inventory.middlleware_inventory.service.InventoryConsumerService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.retry.annotation.Backoff;
import org.springframework.retry.annotation.Retryable;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class UpdateInventoryConsumer {

    private final InventoryConsumerService inventoryConsumerService;


    @KafkaListener(topics = KafkaTopics.UPDATE_INVENTORY, groupId = KafkaGroup.UPDATE_INVENTORY_GROUP,
        containerFactory = "updateInventoryContainerFactory")
    @Retryable(retryFor = Exception.class, maxAttempts = 5, backoff = @Backoff(delay = 5000, multiplier = 2))
    private void processUpdateInventory(UpdateInventoryDTO updateInventoryDTO) {
        log.info("Processing update inventory: {}", updateInventoryDTO);

        inventoryConsumerService.handleUpdateInventory(updateInventoryDTO);
    }
}
