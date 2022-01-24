package poo1;

import java.util.Scanner;

public class Application {
	
	
	
	
	public static void main(String[] args) {

		System.out.println("Welcome to OOP");

		// car algorithm

		Car myCar = new Car(2000, "mazda", 20000.789);
		// System.out.println(myCar.getBrand());

		Car newUserCar = new Car(myCar.getManufacturingYear(), myCar.getBrand(), myCar.getPrice());
		System.out.println(newUserCar.getBrand());
		
		
		
		// user1 object
		User user1 = new User("Eric Dupond", "dupond.em@gmail.com", "monpassword");
		System.out.println(user1.getName() + "" + user1.getMailAdress() + "" + user1.getPassword());
		// user2 object
		User user2 = new User("William Makeba", "makeba@gmail.com", "monpasswordmakeba");
		System.out.println(user2.getName() + "" + user2.getMailAdress() + "" + user2.getPassword());
		// user3 object
		User user3 = new User("Marie Curie", "m.curie@gmail.com", "monpasswordcurie");
		System.out.println(user3.getName() + "" + user3.getMailAdress() + "" + user3.getPassword());
		// user4 object
		User user4 = new User("Albert Einsteirn", "einstein@gmail.com", "monpasswordei");
		System.out.println(user4.getName() + "" + user4.getMailAdress() + "" + user4.getPassword());
		// user5 object
		User user5 = new User("Abraham Lincoln", "blincoln@gmail.com", "monpasswordlinc");
		System.out.println(user4.getName() + "" + user4.getMailAdress() + "" + user4.getPassword());
		
		double myCarNewPrice = myCar.calculateNewPrice(myCar.getPrice());
		System.out.println(myCarNewPrice);

	}

}
