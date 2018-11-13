package pkgHelper;

import java.util.HashMap;

import pkgEnum.WCALC;;

public class WHelperSemanticTable {
	private static HashMap<String, WCALC> table = new HashMap<>();
	
	public static void fillTable() {
		table.put("ADDV", WCALC.ADDCVEC);
		table.put("SUBVEC", WCALC.SUBVEC);
		table.put("INVVEC", WCALC.INVVEC);
	}
}
