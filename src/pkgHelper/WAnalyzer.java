package pkgHelper;

import java.util.ArrayList;

public class WAnalyzer {
	public static ArrayList<String> split(ArrayList<String> file_lines) throws Exception{
		ArrayList<String> ret = new ArrayList<>();
		
		if(file_lines==null || file_lines.size() == 0)
			throw new Exception("Empty file!");
		
		for(String it : file_lines) {
			String itarr[] = it.split(" ");
			for(String itarrit: itarr) {
				ret.add(itarrit);
			}
		}
		
		return ret;
	}
}
