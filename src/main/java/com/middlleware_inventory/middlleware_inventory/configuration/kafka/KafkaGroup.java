package com.middlleware_inventory.middlleware_inventory.configuration.kafka;

public class KafkaGroup {
    private KafkaGroup() { throw new IllegalStateException("Utility class"); }

    public static final String UPDATE_INVENTORY_GROUP = "updateInventoryGroup";
}
