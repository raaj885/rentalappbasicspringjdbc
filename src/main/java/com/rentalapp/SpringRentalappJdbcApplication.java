package com.rentalapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.rentalapp.model.RentalProperty;
import com.rentalapp.service.IRentalPropertyService;

@SpringBootApplication
public class SpringRentalappJdbcApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringRentalappJdbcApplication.class, args);
	}
	
	private IRentalPropertyService rentalPropertyService;
	
	@Autowired
	public void setRentalPropertyService(IRentalPropertyService rentalPropertyService) {
		this.rentalPropertyService = rentalPropertyService;
	}
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		RentalProperty property = new RentalProperty("2BHK room","girls" ,104,"apartment", "2BHK", "1500 sqft", 8000, "benzcircle", "vijayawada", 20000);
		
		//rentalPropertyService.addRentalProperty(property);
		System.out.println("Property added");
		
		//rentalPropertyService.updateRentalProperty(102, 59000);
		System.out.println("rent updated");
		
		//rentalPropertyService.deleteRentalProperty(105);
		System.out.println("property deleted");
		
		rentalPropertyService.getAll().forEach(System.out::println);
		System.out.println("All properties");
		
		rentalPropertyService.getByCategory("boys").forEach(System.out::println);
		System.out.println("All properties by category");
		
		rentalPropertyService.getByCity("hyderabad").forEach(System.out::println);
		System.out.println("All properties in the city");
		
		System.out.println(rentalPropertyService.getById(101));
		System.out.println("Property by id");
		
		rentalPropertyService.getByLesserDeposit(30000).forEach(System.out::println);
		System.out.println("All properties below the security deposit");
		
		rentalPropertyService.getByLocation("madhapur").forEach(System.out::println);
		System.out.println("All properties in the location");
		
		rentalPropertyService.getByType("apartment").forEach(System.out::println);
		System.out.println("All apartments");
		
		rentalPropertyService.getByRentRange(5000,40000).forEach(System.out::println);
		System.out.println("All properties within the range");
	}

}
