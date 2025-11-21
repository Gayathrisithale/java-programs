package travel;

public class Bike extends Vehicle{
	private int fuelCapacity;
	private String brand;

	public Bike(String registrationNumber, String color, String brand, int fuelCapacity) {
		super(registrationNumber, color);
		boolean brandStatus=BikeValidation.checkBrand(brand);
		boolean fuelCapacityStatus=BikeValidation.checkFuelCapacity(fuelCapacity);
		if(brandStatus)
		{
			this.brand=brand;
		}
		else
		{
			System.err.println("invalid brand bike");
		}
		if(fuelCapacityStatus)
		{
			this.fuelCapacity=fuelCapacity*1000;
		}
		else
		{
			System.err.println("invalid fuel capacity");
		}
	
	}

	public int getFuelCapacity() {
		return fuelCapacity;
	}

	public void setFuelCapacity(int fuelCapacity) {
		this.fuelCapacity = fuelCapacity;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}
	public void drive(int n) {
		while(n>0) {
			fuelCapacity-=75;
			n--;
		}
		if(fuelCapacity<=100) {
			System.err.println("Low Fuel!!!!!");
		}
	}
	
	public void fuelStatus(){
		System.out.println(fuelCapacity+"ml");
	}
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("cardetails");
		System.out.println("registration number "+registrationNumber);
		System.out.println("color "+color);
		System.out.println("brand "+brand);
		System.out.println("fuel capacity "+fuelCapacity);
		
	}
	
	
	
	
	
	
	

}
