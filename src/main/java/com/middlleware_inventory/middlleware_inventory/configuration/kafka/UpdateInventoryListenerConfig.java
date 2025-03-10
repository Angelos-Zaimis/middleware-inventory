package com.middlleware_inventory.middlleware_inventory.configuration.kafka;

import com.middlleware_inventory.middlleware_inventory.dto.product.UpdateInventoryDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.ConcurrentKafkaListenerContainerFactory;

@Configuration
public class UpdateInventoryListenerConfig extends AbstractKafkaConsumerConfig<UpdateInventoryDTO>{

    @Autowired
    public UpdateInventoryListenerConfig(@Value("${spring.kafka.bootstrap-servers}") String bootstrapAddress) {
        super(bootstrapAddress);
    }

    @Override
    public String getKafkaGroup() {
        return KafkaGroup.UPDATE_INVENTORY_GROUP;
    }

    @Override
    public Class<UpdateInventoryDTO> getValueDeserializerClassConfig() {
        return UpdateInventoryDTO.class;
    }

    @Bean
    public ConcurrentKafkaListenerContainerFactory<String, UpdateInventoryDTO> updateInventoryContainerFactory() {
        return kafkaListenerContainerFactory();
    }
}
