package com.codeclan.example.fileStorage.repositories;

import com.codeclan.example.fileStorage.models.User;
import com.codeclan.example.fileStorage.projections.EmbedForFolders;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(excerptProjection = EmbedForFolders.class)
public interface UserRepository extends JpaRepository<User, Long> {
}
