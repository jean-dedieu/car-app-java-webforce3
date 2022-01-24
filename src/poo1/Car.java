package poo1;

import java.util.Scanner;

public class Car {
	
	// object attibutes
	private String brand;
	private double price;
	private int manufacturingYear;
	
	// constructor to initialize instace attributes
		public Car(int anneeDeFacbrication, String marque, double prix) {
			this.manufacturingYear = anneeDeFacbrication;

			this.brand = marque;
			this.price = prix;
		}
	
	public int getManufacturingYear() {
		return manufacturingYear;
	}

	public void setManufacturingYear(int manufacturingYear) {
		this.manufacturingYear = manufacturingYear;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}



	

	public double calculateNewPrice(double price) {
		return this.price * 2;
	}

	public static String displayeCarData(Car voiture) {
		return "The car data :" + voiture.brand + " " + voiture.manufacturingYear + " " + voiture.price;
	}

	

	/*Get UserCar Data
	 * Will get user Data by using Scanner prompt
	 * */
	public void  getUserCarData(Car car) {
		Scanner keyboardGetUserData = new Scanner(System.in);
		System.out.println("Enter your Car Brand");
		brand = keyboardGetUserData.nextLine();
       
		System.out.println("Enter your car manufacturing Year");
		manufacturingYear = keyboardGetUserData.nextInt();

		System.out.println("Enter your car price");
		price = keyboardGetUserData.nextDouble();
		
		
	}
	

	public  double sum(double a, double b) {
		return a + b;
	}
	public double sum(Car car) {
		return car.price;
	}
	 

	
}