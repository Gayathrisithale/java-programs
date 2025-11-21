package travel;

import java.util.ArrayList;

public class BusValidation {
	public static boolean checkNumberOfSeats(int numberOfSeats)
	{
		if(numberOfSeats>=30 && numberOfSeats<=50)
		{
			return true;
		}
		return false;
	}
	public static boolean checkSeatType(String seatType)
	{
		ArrayList a1=new ArrayList();
		a1.add("SEATER");
		a1.add("SEMI-SLEEPER");
		a1.add("SLEEPER");
		return a1.contains(seatType);
	}
	public static String checkBrand(String brandName)
	{
	if(!(brandName.equals("tata")||brandName.equals))

}
