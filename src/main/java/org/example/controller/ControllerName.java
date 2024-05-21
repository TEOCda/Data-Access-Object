package org.example.controller;

import lombok.AllArgsConstructor;
import org.example.service.ServiceName;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class ControllerName {

    private ServiceName serviceName;

    @GetMapping("/products/fetch-product")
    public List<String> getProductName(@RequestParam (value = "name", required = false) String name) {
        return serviceName.getProductName(name);
    }
}
