package com.rentalapp.service;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rentalapp.exception.PropertyNotFoundException;
import com.rentalapp.model.RentalProperty;
import com.rentalapp.repository.IRentalPropertyRepository;


@Service
public class RentalPropertyServiceImpl implements IRentalPropertyService{
	
	private IRentalPropertyRepository rentalPropertyRepo;
	
	
	
	@Autowired
	public void setRentalPropertyRepo(IRentalPropertyRepository rentalPropertyRepo) {
		this.rentalPropertyRepo = rentalPropertyRepo;
	}

	@Override
	public void addRentalProperty(RentalProperty rentalProperty) {
		rentalPropertyRepo.addRentalProperty(rentalProperty);
		
	}

	@Override
	public void updateRentalProperty(int propertyId, double expectedRent) {
		rentalPropertyRepo.updateRentalProperty(propertyId, expectedRent);
		
	}

	@Override
	public void deleteRentalProperty(int propertyId) {
		rentalPropertyRepo.deleteRentalProperty(propertyId);
		
	}

	@Override
	public RentalProperty getById(int propertyId) throws PropertyNotFoundException {
	   RentalProperty rentalProperty= rentalPropertyRepo.findById(propertyId);
		return rentalProperty;
	}

	@Override
	public List<RentalProperty> getByCategory(String category) throws PropertyNotFoundException {
		List<RentalProperty>rentalProperList=
				rentalPropertyRepo.findByCategory(category).stream().sorted(Comparator.comparing(RentalProperty::getBedrooms))
				.collect(Collectors.toList());
		return rentalProperList;
	}

	@Override
	public List<RentalProperty> getByType(String type) throws PropertyNotFoundException {
		List<RentalProperty>rentalProperList=
				rentalPropertyRepo.findByType(type).stream().sorted(Comparator.comparing(RentalProperty::getBedrooms))
				.collect(Collectors.toList());
		return rentalProperList;
	}

	@Override
	public List<RentalProperty> getByRentRange(double start, double end) throws PropertyNotFoundException {
		List<RentalProperty>rentalProperList=
				rentalPropertyRepo.findByRentRange(start,end).stream().sorted(Comparator.comparing(RentalProperty::getBedrooms))
				.collect(Collectors.toList());
		return rentalProperList;
	}

	@Override
	public List<RentalProperty> getByLesserDeposit(double deposit) throws PropertyNotFoundException {
		List<RentalProperty>rentalProperList=
				rentalPropertyRepo.findByLesserDeposit(deposit).stream().sorted(Comparator.comparing(RentalProperty::getSecurityDeposit))
				.collect(Collectors.toList());
		return rentalProperList;	}

	@Override
	public List<RentalProperty> getByLocation(String location) throws PropertyNotFoundException {
		List<RentalProperty>rentalProperList=
				rentalPropertyRepo.findByLocation(location).stream().sorted(Comparator.comparing(RentalProperty::getBedrooms))
				.collect(Collectors.toList());
		return rentalProperList;
	}

	@Override
	public List<RentalProperty> getByCity(String city) throws PropertyNotFoundException {
		List<RentalProperty>rentalProperList=
				rentalPropertyRepo.findByCity(city).stream().sorted(Comparator.comparing(RentalProperty::getBedrooms))
				.collect(Collectors.toList());
		return rentalProperList;
	}

	@Override
	public List<RentalProperty> getAll() {
		List<RentalProperty>rentalProperList=
				rentalPropertyRepo.findAll().stream().sorted(Comparator.comparing(RentalProperty::getBedrooms))
				.collect(Collectors.toList());
		return rentalProperList;
	}

}
