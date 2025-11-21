package travel;

public class Bus extends Vehicle{
	
	private int numberOfSeats;
	private String seatType;
	private String brand;
	private int availableSeats;
	
	public Bus(String registrationNumber, String color, String brand, int numberOfSeats, String seatType,int availableSeats) {
		super(registrationNumber, color);
		boolean numberOfSeatsStatus=BusValidation.checkNumberOfSeats(numberOfSeats);
		boolean seatTypeStatus=BusValidation.checkSeatType(seatType);
		boolean brandStatus=BrandValidation.checkBrand(brand);
		this.availableSeats=availableSeats;
	
		if(numberOfSeatsStatus)
		{
			this.numberOfSeats=numberOfSeats;
		}
		else
		{
			System.err.println("wrong number of seats in bus");
		}
		if(seatTypeStatus)
		{
			this.seatType=seatType;
		}
		else
		{
			System.err.println("invalid bus seat type");
		}
		if(brandStatus)
		{
			this.brand=brand;
		}
		else
		{
			System.out.println("invalid brand");
		}
	}

	public int getNumberOfSeats() {
		return numberOfSeats;
	}

	public void setNumberOfSeats(int numberOfSeats) {
		this.numberOfSeats = numberOfSeats;
	}

	public String getSeatType() {
		return seatType;
	}

	public void setSeatType(String seatType) {
		this.seatType = seatType;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public void bookSeat()
	{
		if(availableSeats>0)
		{
			availableSeats--;
			System.out.println("seat booked successfully remaining seats: "+availableSeats);
		}
		else
		{
			System.out.println("no seats available");
		}
	}
	public void cancelSeat()
	{
		if(availableSeats<numberOfSeats)
		{
			availableSeats++;
			System.out.println("seat cancelled successfully remaining seats: "+availableSeats);
		}
		else
		{
			System.out.println("no booking found to cancel");
		}
		
		
	}
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("bus details");
		System.out.println("registration number "+registrationNumber);
		System.out.println("color "+color);
		System.out.println("brand "+brand);
		System.out.println("number of seats "+numberOfSeats);
		System.out.println("seat type "+seatType);
		System.out.println("available seats "+availableSeats);
		
	}
	
	
	
	

}
