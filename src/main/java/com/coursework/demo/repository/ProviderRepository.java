package com.coursework.demo.repository;

import com.coursework.demo.entity.Provider;
import org.springframework.data.repository.CrudRepository;

public interface ProviderRepository extends CrudRepository<Provider, Long> {
}