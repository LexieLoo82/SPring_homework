package com.codeclan.example.fileStorage.projections;

import com.codeclan.example.fileStorage.models.File;
import com.codeclan.example.fileStorage.models.Folder;
import org.springframework.data.rest.core.config.Projection;

@Projection(name="embedForFiles", types=File.class)
public interface EmbedForFiles {
    String getName();
    String getExtension();
    int getSize();
    Folder getFolder();

}
