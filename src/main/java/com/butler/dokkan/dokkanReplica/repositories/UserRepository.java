package com.butler.dokkan.dokkanReplica.repositories;

import com.butler.dokkan.dokkanReplica.models.UserModel;
import org.hibernate.metamodel.model.convert.spi.JpaAttributeConverter;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserModel, Long> {
}
