package travel;
import java.util.*;

public class VehicleMain {
public static void main(String args[])
{
Scanner scan=new Scanner(System.in);
System.out.println("press 2 for car");
System.out.println("press 1 for bus");
System.out.println("press 3 for bike");
int choice=scan.nextInt();

if(choice==1)
{
	System.out.println("Bus");
	System.out.println("enter the registration number");
	String registrationNumber=scan.next();
	System.out.println("enter the bus color");
	String color=scan.next();
	System.out.println("enter the brand");
	String brand=scan.next();
	System.out.println("enter number of seats in bus");
	int numberOfSeats=scan.nextInt();
	System.out.println("enter seat type you want");
	String seatType=scan.next();
	System.out.println("enter number of seats you want");
	int availableSeats=scan.nextInt();
	Bus myBus=new Bus(registrationNumber,color,brand,numberOfSeats,seatType,availableSeats);
	myBus.display();
	System.out.println("press 1 to cancel seats");
	System.out.println("press 0 to exit");
	int option=scan.nextInt();
	if(option==1)
	{
		if(availableSeats>0)
		{
			System.out.println("seat cancelled");
			availableSeats=availableSeats--;
			int remainingSeats=numberOfSeats-availableSeats;
			System.out.println("availableSeats "+remainingSeats);
		}
	}
	else
	{
		System.out.println("thank you for visiting us");
	}
}
else if(choice==2)
{
	System.out.println("car");
	System.out.println("enter car registration number ");
	String registrationNumber=scan.next();
	System.out.println("enter car colour");
	String color=scan.next();
	System.out.println("enter car brand");
	String brand=scan.next();
	System.out.println("enter car type");
	String carType=scan.next();
	System.out.println("enter number of seats");
	int seats=scan.nextInt();
	Car myCar=new Car(registrationNumber,color,brand,carType,seats);
	myCar.display();
}
else if(choice==3)
{
	System.out.println("bike");
	System.out.println("enter bike registration number");
	String registrationNumber=scan.next();
	System.out.println("enter bike color");
	String color=scan.next();
	System.out.println("enter bike brand ");
	String brand=scan.next();
	System.out.println("enter fuel capacity");
	int fuelCapacity=scan.nextInt();
	Bike myBike=new Bike(registrationNumber,color,brand,fuelCapacity);
	myBike.display();
	System.out.println("enter drive");
	int n=scan.nextInt();
	myBike.drive(n);
	myBike.fuelStatus();
	myBike.display();
	
}
else
{
	System.out.println("please choose other choice");
}
}
}
