package pkgHelper;

import java.util.ArrayList;

import pkgEnum.WCALC;

public class WAnalyzer {
	public static ArrayList<ArrayList<String>> split(ArrayList<String> file_lines) throws Exception{
		ArrayList<ArrayList<String>> ret = new ArrayList<>();
		
		if(file_lines==null || file_lines.size() == 0)
			throw new Exception("Empty file!");
		
		for(String it : file_lines) {
			String itarr[] = it.split(";");
			for(String itarrit: itarr) {
				String itarrsecond[] = itarrit.split(" ");
				ArrayList<String> command = new ArrayList<>();
				for(String itarritsecond: itarrsecond) {
					command.add(itarritsecond);
				}
				ret.add(command);
			}
		}
		
		return ret;
	}
}
