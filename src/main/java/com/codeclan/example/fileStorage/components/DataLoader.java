package com.codeclan.example.fileStorage.components;

import com.codeclan.example.fileStorage.models.File;
import com.codeclan.example.fileStorage.models.Folder;
import com.codeclan.example.fileStorage.models.User;
import com.codeclan.example.fileStorage.repositories.FileRepository;
import com.codeclan.example.fileStorage.repositories.FolderRepository;
import com.codeclan.example.fileStorage.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    FileRepository fileRepository;

    @Autowired
    FolderRepository folderRepository;

    @Autowired
    UserRepository userRepository;

    public DataLoader(){

    }

    public void run(ApplicationArguments args){
        User user = new User("alex");
        userRepository.save(user);

        User user1 = new User("Jon");
        userRepository.save(user1);

        Folder folder = new Folder("SpaceFiles", user);
        folderRepository.save(folder);

        File file = new File("SpaceStuff", "ext", 3, folder);
        fileRepository.save(file);
    }
}
