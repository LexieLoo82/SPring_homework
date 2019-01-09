package com.codeclan.example.fileStorage;

import com.codeclan.example.fileStorage.models.File;
import com.codeclan.example.fileStorage.models.Folder;
import com.codeclan.example.fileStorage.models.User;
import com.codeclan.example.fileStorage.repositories.FileRepository;
import com.codeclan.example.fileStorage.repositories.FolderRepository;
import com.codeclan.example.fileStorage.repositories.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FileStorageApplicationTests {


	@Autowired
	FileRepository fileRepository;

	@Autowired
	FolderRepository folderRepository;

	@Autowired
	UserRepository userRepository;

	@Test
	public void contextLoads() {
	}


	@Test
	public void createUser(){
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

