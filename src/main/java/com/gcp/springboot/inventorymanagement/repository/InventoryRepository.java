package com.gcp.springboot.inventorymanagement.repository;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.gcp.springboot.inventorymanagement.model.Inventory;

@RepositoryRestResource(collectionResourceRel = "inventory", path = "inventory")
public interface InventoryRepository extends PagingAndSortingRepository<Inventory, Long> {

    List<Inventory> findAllByItemName(@Param("itemName") String itemName);

}
