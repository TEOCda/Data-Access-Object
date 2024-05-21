package org.example.service;

import lombok.AllArgsConstructor;
import org.example.repository.RepositoryName;

import java.util.List;

@org.springframework.stereotype.Service
@AllArgsConstructor
public class ServiceName {
    private RepositoryName repositoryName;

    public List<String> getProductName(String name) {
        return repositoryName.getProductName(name);
    }
}
