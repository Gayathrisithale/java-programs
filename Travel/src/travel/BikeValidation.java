package travel;

import java.util.ArrayList;

public class BikeValidation {
	public static boolean checkBrand(String brand)
	{
		ArrayList a1=new ArrayList();
		a1.add("HERO");
		a1.add("DUKE");
		a1.add("ROYALENFIELD");
		return a1.contains(brand);
	}
	public static boolean checkFuelCapacity(int fuelCapacity)
	{
		if(fuelCapacity>=20 && fuelCapacity<=35)
		{
			return true;
		}
		return false;
	}

}
