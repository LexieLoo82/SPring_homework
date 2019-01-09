package com.codeclan.example.fileStorage.projections;

import com.codeclan.example.fileStorage.models.Folder;
import com.codeclan.example.fileStorage.models.User;
import org.springframework.data.rest.core.config.Projection;

import java.util.List;

@Projection(name="embedForUsers", types= User.class)
public interface EmbedForUsers {
    String getName();
    List<Folder> getFolders();
}
