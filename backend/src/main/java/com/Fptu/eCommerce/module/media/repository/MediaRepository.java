package com.Fptu.eCommerce.module.media.repository;

import com.Fptu.eCommerce.module.media.entity.MediaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MediaRepository extends JpaRepository<MediaEntity, Long> {
}
