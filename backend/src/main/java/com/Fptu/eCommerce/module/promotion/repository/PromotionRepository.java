package com.Fptu.eCommerce.module.promotion.repository;

import com.Fptu.eCommerce.module.promotion.entity.PromotionEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PromotionRepository extends JpaRepository<PromotionEntity, Long> {
}
