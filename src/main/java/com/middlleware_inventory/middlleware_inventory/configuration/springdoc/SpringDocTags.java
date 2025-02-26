package com.middlleware_inventory.middlleware_inventory.configuration.springdoc;

import io.swagger.v3.oas.models.tags.Tag;

import java.util.List;

public class SpringDocTags {
    public static final String INVENTORY = "API for Inventory";
    public static final String INVENTORY_DESCRIPTION = "API to manage orders";

    public static List<Tag> tags() {
        return List.of(
                new Tag().name(INVENTORY).description(INVENTORY_DESCRIPTION)
        );
    }
}
