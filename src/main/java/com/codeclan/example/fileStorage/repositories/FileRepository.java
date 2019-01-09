package com.codeclan.example.fileStorage.repositories;

import com.codeclan.example.fileStorage.models.File;
import com.codeclan.example.fileStorage.projections.EmbedForFiles;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(excerptProjection = EmbedForFiles.class)
public interface FileRepository extends JpaRepository<File, Long> {
}
