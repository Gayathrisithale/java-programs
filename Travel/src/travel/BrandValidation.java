package travel;

import java.util.ArrayList;

public class BrandValidation {
	public static boolean checkBrand(String brand)
	{
		ArrayList a1=new ArrayList();
		a1.add("BENZ");
		a1.add("BMW");
		a1.add("TATA");
		return a1.contains(brand);
	}

}
