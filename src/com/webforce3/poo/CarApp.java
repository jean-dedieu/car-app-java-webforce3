package com.webforce3.poo;

public class CarApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Car myCar1 = new Car("Renault",40000.32,1950,"1233DC69",new User("Marc","07845884844","dupond@gmail.com","motpasse"),new Parking("Caserne de bone","2 avenue du Java","0788454555"));
       System.out.println(myCar1.getUser().getName()+" "+ "Votre " + myCar1.getBrand()+ " Sortie en : " +  myCar1.getManufacturingYear() + " " + "Garée dans le parking à : " + myCar1.getParking().getAdress() + " Étage: "+ myCar1.getParking().getFloor()[0]+ " son prix initial est de: " + myCar1.getPrice());
       System.out.println("Après notre calcul son prix de revent est estimé à : " + myCar1.calculateEstimatedPrice());
       System.out.println("Le coup d\'assurance de ton  " + myCar1.getBrand()+ " " + "est " + myCar1.insuranceAmount(myCar1.getPrice()));
       /*
       Car myCar2 = new Car("Mercedes",40000.32,2014,"1233DC69");
       System.out.println(myCar2.getManufacturingYear() + " " + myCar2.getBrand()+ " " + myCar2.getPrice());
       System.out.println("Your car estimated price amount: " + myCar2.calculateEstimatedPrice());
       System.out.println("Insurance amount for your car " + myCar2.getBrand()+ " " + "is " + myCar2.insuranceAmount(myCar2.getPrice()));
       
       Car myCar3 = new Car("Mercedes",40000.32,2001,"1233DC69");
       System.out.println(myCar3.getManufacturingYear() + " " + myCar3.getBrand()+ " " + myCar3.getPrice());
       System.out.println("Your car estimated price amount: " + myCar3.calculateEstimatedPrice());
       
       System.out.println("Insurance amount for your car " + myCar3.getBrand()+ " " + "is " + myCar3.insuranceAmount(myCar3.getPrice()));*/
       
       
       
	}


}
