package travel;

abstract public class Vehicle {
	
	protected String registrationNumber;
	protected String color;
	
	public Vehicle(String registrationNumber, String color) {
		super();
	boolean registrationNumberStatus=VehicleValidation.checkRegistrationNumber(registrationNumber);
	boolean colorStatus=VehicleValidation.checkColor(color);
		
	if(registrationNumberStatus)
	{
		this.registrationNumber=registrationNumber;
	}
	else
	{
		System.err.println("invalid registration number");
	}
	if(colorStatus)
	{
		this.color=color;
	}
	else
	{
		System.err.println("color is not present");
	}
	}
	abstract public void display();
	
	

}
