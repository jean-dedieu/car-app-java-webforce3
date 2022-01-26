package com.webforce3.poo;

import java.util.Scanner;

public class Car {

	// object attibutes
	private String brand;
	private double initialPrice;
	private int manufacturingYear;
	private String registrationNumber;
	User user;
	Parking parking;


	// constructor to initialize instace attributes
	public Car(String brand, double initialPrice, int manufacturingYear, String registrationNumber, User user, Parking parking) {
		this.manufacturingYear = manufacturingYear;
		this.brand = brand;
		this.initialPrice = initialPrice;
		this.registrationNumber = registrationNumber;
		this.user = user;
		this.parking = parking;

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
		return initialPrice;
	}

	public void setPrice(double price) {
		this.initialPrice = price;
	}
	

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	public Parking getParking() {
		return parking;
	}

	public void setParking(Parking parking) {
		this.parking = parking;
	}

	public static String displayeCarData(Car voiture) {
		return "The car data :" + voiture.brand + " " + voiture.manufacturingYear + " " + voiture.initialPrice;
	}
	
	

	/*
	 * Get UserCar Data Will get user Data by using Scanner prompt
	 */
	public void messagePrice() {
		if (this.initialPrice < 12) {
			System.out.println("Votre voiture n\'est pas cher");
		} else {
			System.out.println("Votre voiture est trop chère");
		}
	}

	public double calculateEstimatedPrice() {

		if (manufacturingYear >= 2010 && brand.equals("Mercedes")) {
			return (initialPrice) / 2;
		} else if (manufacturingYear <= 1980) {

			return (initialPrice) / 6;
		} else {
			return (initialPrice) / 4;
		}
	}

	public double insuranceAmount(double initialPrice) {
		double insuranceAmount = (this.initialPrice * 2) / 100;
		return insuranceAmount;
	}

}
