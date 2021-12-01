package com.rentalapp.model;

public class RentalProperty {
	
	private String name;
	private String category;//all,family,boys,girls
	private Integer propertyId;
	private String type;//apartment,independent house
	private String bedrooms;//2BHK,3BHK
	private String area;//5678sqft
	private double rentExpected;
	private String location;
	private String city;
	private double securityDeposit;
	
	public RentalProperty() {
		super();
		// TODO Auto-generated constructor stub
	}

	public RentalProperty(String name, String category, Integer propertyId, String type, String bedrooms, String area,
			double rentExpected, String location, String city, double securityDeposit) {
		super();
		this.name = name;
		this.category = category;
		this.propertyId = propertyId;
		this.type = type;
		this.bedrooms = bedrooms;
		this.area = area;
		this.rentExpected = rentExpected;
		this.location = location;
		this.city = city;
		this.securityDeposit = securityDeposit;
	}
	
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public Integer getPropertyId() {
		return propertyId;
	}

	public void setPropertyId(Integer propertyId) {
		this.propertyId = propertyId;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getBedrooms() {
		return bedrooms;
	}

	public void setBedrooms(String bedrooms) {
		this.bedrooms = bedrooms;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public double getRentExpected() {
		return rentExpected;
	}

	public void setRentExpected(double rentExpected) {
		this.rentExpected = rentExpected;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public double getSecurityDeposit() {
		return securityDeposit;
	}

	public void setSecurityDeposit(double securityDeposit) {
		this.securityDeposit = securityDeposit;
	}

	@Override
	public String toString() {
		return "RentalProperty [name=" + name + ", category=" + category + ", propertyId=" + propertyId + ", type="
				+ type + ", bedrooms=" + bedrooms + ", area=" + area + ", rentExpected=" + rentExpected + ", location="
				+ location + ", city=" + city + ", securityDeposit=" + securityDeposit + "]";
	}
	
	
}
