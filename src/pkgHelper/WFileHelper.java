package pkgHelper;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.io.File;


public class WFileHelper {
	public static ArrayList<String> getFileContent(String filename) throws IOException{
		ArrayList<String> ret = new ArrayList<>();
		
		File file = new File(filename);
		BufferedReader bf = new BufferedReader(new FileReader(file));
		
		String str;
		while((str= bf.readLine()) != null)
			ret.add(str);
		
		return ret;
	}
}
