import java.util.ArrayList;

public class program {
	

	public void parse(String values, String delimiter, int numIndex)
	{
		
		if(values.substring(0, 1).equals(delimiter))
		{
			if(values.substring(values.length()-1).equals(delimiter))
			{
				//DO NOTHING
			}
			else
			{
				values = values + delimiter;
			}
		}
		else 
		{
			values = delimiter + values;
			if(values.substring(values.length()-1).equals(delimiter))
			{
				//DO NOTHING
			}
			else
			{
				values = values + delimiter;
			}
		
		}
		
		ArrayList<String> words = new ArrayList<String>(0);

		
		String temp = values;
		
	
		temp = temp.substring(1);
		
		
		while(temp.indexOf(delimiter) != -1)
		{
			
			words.add(temp.substring(0, temp.indexOf(delimiter)));
			temp = temp.substring(temp.indexOf(delimiter) + 1);
		}
		
		
		System.out.println(words.get(numIndex-1));
		
		
		
	}

	public static void main(String[] args) {
		
		program object = new program();

		object.parse("one;rohith;aditya", ";", 2);

	}

}
