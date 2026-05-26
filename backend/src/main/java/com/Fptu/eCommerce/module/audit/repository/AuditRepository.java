package com.Fptu.eCommerce.module.audit.repository;

import com.Fptu.eCommerce.module.audit.entity.AuditEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuditRepository extends JpaRepository<AuditEntity, Long> {
}
