package com.restapi;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class UserDao {
	
	public List<User> getAllUsers(){
		List<User> lstUsers = new ArrayList<>();
		FileInputStream fileInputStream = null;
		ObjectInputStream objectInputStream = null;
		try {
			File userFile = new File("Users.dat");
			System.out.println("path : " + userFile.getAbsolutePath());
			if(!userFile.exists()){
				lstUsers.add(new User(1, "Maddy", "Student"));
				saveUserList(lstUsers);
			}else{
				fileInputStream = new FileInputStream(userFile);
				objectInputStream = new ObjectInputStream(fileInputStream);
				lstUsers = (List<User>) objectInputStream.readObject();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{
			try {
				if(fileInputStream!=null){
					fileInputStream.close();
				}
				if(objectInputStream!=null){
					objectInputStream.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return lstUsers;
	}
	
	private void saveUserList(List<User> lstUsers){
		File file = new File("Users.dat");
		FileOutputStream fileOutputStream = null;
		ObjectOutputStream objectOutputStream = null;
		try {
			fileOutputStream = new FileOutputStream(file);
			objectOutputStream = new ObjectOutputStream(fileOutputStream);
			objectOutputStream.writeObject(lstUsers);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{
			try {
				if(fileOutputStream!=null){
						fileOutputStream.close();
				}
				if(objectOutputStream!=null){
					objectOutputStream.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
