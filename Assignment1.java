import java.io.File;  // Import the File class

public class showFiles{
	public static void main(String args[]){

		String[] file_names;

		String dir_name = args[0];

		File dir = new File(dir_name); 

		file_names = dir.list();

		for(String contents : file_names){
			System.out.println(contents);
		}

	}
	
}
