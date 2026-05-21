package com.Fptu.eCommerce.module.wishlist.repository;

import com.Fptu.eCommerce.module.wishlist.entity.WishlistEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WishlistRepository extends JpaRepository<WishlistEntity, Long> {
}
