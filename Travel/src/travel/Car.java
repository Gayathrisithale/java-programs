package travel;

public class Car extends Vehicle {
	private String carType;
	private int seats;
	private String brand;

	public Car(String registrationNumber, String color, String brand, String carType,int seats) {
		super(registrationNumber, color);
	boolean carTypeStatus=CarValidation.checkcarType(carType);
	boolean brandStatus=BrandValidation.checkBrand(brand);
	boolean seatsStatus=CarValidation.checkCarSeats(seats);
    
	if(carTypeStatus)
	{
		this.carType=carType;
	}
	else
	{
		System.err.println("invalid car type.....");
	}
	if(brandStatus)
	{
		this.brand=brand;
	}
	else
	{
		System.err.println("brand not avilable...");
	}
	if(seatsStatus)
	{
		this.seats=seats;
	}
	else
	{
		System.err.println("seats are invalid");
	}
	}

	public String getCarType() {
		return carType;
	}

	public void setCarType(String carType) {
		this.carType = carType;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getSeats() {
		return seats;
	}

	public void setSeats(int seats) {
		this.seats = seats;
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("car details");
		System.out.println("car registration number "+registrationNumber);
		System.out.println("car color "+color);
		System.out.println("brand "+brand);
		System.out.println("number of seats "+seats);
		System.out.println("car type "+carType);
		
		
		
	}
	
}
