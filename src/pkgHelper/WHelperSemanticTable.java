package pkgHelper;

import java.util.ArrayList;
import java.util.HashMap;

import pkgData.DataLoader;
import pkgEnum.WCALC;;

public class WHelperSemanticTable {
	private static HashMap<String, WCALC> table = new HashMap<>();
	
	public static void fillTable() {
		table.put("ADDVEC", WCALC.ADDCVEC);
		table.put("SUBVEC", WCALC.SUBVEC);
		table.put("INVVEC", WCALC.INVVEC);
	}
	
	public static WCALC getCommand(String command) throws Exception {
		WCALC ret;
		if((ret = table.get(command))  != null)
			return ret;
		else
			throw new Exception(command + " is not a command");
	}
	
	public static Object distributeCommand(ArrayList<String> command) throws Exception {
		Object o;
		
		if(command.get(0).compareTo(WCALC.VEC.toString()) == 0) {
			o = DataLoader.getWector(command);
		}
		
		else {
			throw new Exception("Error while distributing command");
		}
		return o;
	}
}
