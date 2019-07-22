
public class StringFinder {
	
	
	public boolean StringFinderMethod(String str, String toBeFound)
	{
		if(str.indexOf(toBeFound) == -1)
		{
			return false;
		}
		else
		{
			return true;
		}
	}

	public static void main(String[] args) {
		
		StringFinder object = new StringFinder();
		
		System.out.println(object.StringFinderMethod("AdityaSivakumarRohith", "Sivakumar"));

	}

}
