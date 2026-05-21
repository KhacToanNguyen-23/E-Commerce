package com.Fptu.eCommerce.module.shipping.repository;

import com.Fptu.eCommerce.module.shipping.entity.ShippingEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShippingRepository extends JpaRepository<ShippingEntity, Long> {
}
