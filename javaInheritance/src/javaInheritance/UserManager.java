package javaInheritance;

public class UserManager {
	
	public void addUser(User user) {
		System.out.println(user.firstName + " " +user.lastName +" kullan�c�s� kaydedildi");
	}
	
	public void deleteUser(User user) {
		System.out.println(user.firstName + " " +user.lastName +" kullan�c�s� silindi");
	}
	
	public void updateUser(User user) {
		System.out.println(user.firstName + " " +user.lastName +" kullan�c�s� g�ncellendi");
	}
	
}
