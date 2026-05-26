package com.Fptu.eCommerce.module.inventory.repository;

import com.Fptu.eCommerce.module.inventory.entity.InventoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InventoryRepository extends JpaRepository<InventoryEntity, Long> {
}
