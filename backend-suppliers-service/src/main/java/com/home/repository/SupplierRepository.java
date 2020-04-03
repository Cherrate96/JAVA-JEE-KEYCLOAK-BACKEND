package com.home.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.home.domain.Supplier;

@RepositoryRestResource
public interface SupplierRepository extends JpaRepository<Supplier, Long>{

}
