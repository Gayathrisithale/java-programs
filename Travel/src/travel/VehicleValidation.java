package travel;

import java.util.ArrayList;

public class VehicleValidation {
	
public static boolean checkRegistrationNumber(String registrationNumber)
{

	if(registrationNumber.length()==10 && state(registrationNumber)&&digit(registrationNumber)
			&& alphabet(registrationNumber)&&numeric(registrationNumber))
	{
		return true;
	}
	return false;
}

private static boolean state(String registrationNumber)
{
	ArrayList a1=new ArrayList();
	a1.add("TG");
	a1.add("AP");
	a1.add("TN");
	a1.add("KA");
	String firstTwo=registrationNumber.substring(0,2);
	return a1.contains(firstTwo)?true:false;
	
}
private static boolean digit(String registrationNumber)
{
	String secondTwo=registrationNumber.substring(2,4);
	return secondTwo.matches("\\d{2}");
}
private static boolean alphabet(String registrationNumber)
{
	String thirdTwo=registrationNumber.substring(4,6);
	return thirdTwo.matches("[A-Z]{2}");
}
private static boolean numeric(String registrationNumber)
{
	String fourthFour=registrationNumber.substring(6,10);
	return fourthFour.matches("\\d{4}");
}

//color validation

public static boolean checkColor(String color)
{
	ArrayList a1=new ArrayList();
	a1.add("RED");
	a1.add("BLACK");
	a1.add("WHITE");
	a1.add("blue");
	return a1.contains(color);
}
}

