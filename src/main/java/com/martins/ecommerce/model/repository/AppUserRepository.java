package com.martins.ecommerce.model.repository;

import com.martins.ecommerce.model.data.AppUser;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AppUserRepository extends MongoRepository<AppUser, String> {
}
