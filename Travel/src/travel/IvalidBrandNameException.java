package travel;

public class IvalidBrandNameException extends RuntimeException{
	@Override
	public String getMessage()
	{
		return "invalid brand";
	}

}
