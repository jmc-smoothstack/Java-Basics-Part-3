
import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files


public class charCounter{

	public static void main (String args[]) throws FileNotFoundException
	 {
	 	System.out.println("starting program....");

		char compare = args[0].charAt(0);

		int char_counter = 0;

		String path = "/Users/JasirDonte/Desktop/practice.txt"; 

		File file = new File(path);

		Scanner reader = new Scanner(file);

		while(reader.hasNextLine())
		{

			String line = reader.nextLine(); 

			char[] chars = line.toCharArray();

			for(char c : chars)
			{

				if(c == compare)
				{
					char_counter += 1;
				}
			}

		}

		System.out.println("Character appears "+char_counter+" times");

	}
}
