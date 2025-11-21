package travel;

import java.util.ArrayList;

public class CarValidation {
	
	public static boolean checkcarType(String carType)
	{
		ArrayList a1=new ArrayList();
		a1.add("PETROL");
		a1.add("DIESEL");
		a1.add("CNG");
		a1.add("EV");
		return a1.contains(carType);
	}
	public static boolean checkCarSeats(int seats)
	{
		if(seats>=2 && seats<=8)
		{
			return true;
		}
		return false;
	}

}
