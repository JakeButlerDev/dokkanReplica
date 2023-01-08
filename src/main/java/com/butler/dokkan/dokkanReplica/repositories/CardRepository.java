package com.butler.dokkan.dokkanReplica.repositories;

import com.butler.dokkan.dokkanReplica.models.CardModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CardRepository extends JpaRepository<CardModel, Long> {
}
