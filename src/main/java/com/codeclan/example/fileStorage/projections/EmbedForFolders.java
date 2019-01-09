package com.codeclan.example.fileStorage.projections;

import com.codeclan.example.fileStorage.models.File;
import com.codeclan.example.fileStorage.models.Folder;
import com.codeclan.example.fileStorage.models.User;
import org.springframework.data.rest.core.config.Projection;

import java.util.List;

@Projection(name="embedForFolders", types= Folder.class)
public interface EmbedForFolders {
    String getTitle();
    List<File> getFiles();
    User getUser();
}
