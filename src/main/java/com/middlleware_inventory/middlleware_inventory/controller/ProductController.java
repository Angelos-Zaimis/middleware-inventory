package com.middlleware_inventory.middlleware_inventory.controller;

import com.middlleware_inventory.middlleware_inventory.configuration.springdoc.SpringDocTags;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@Tag(name = SpringDocTags.INVENTORY)
@RequiredArgsConstructor
public class ProductController {


}
