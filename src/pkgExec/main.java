package pkgExec;

import java.io.IOException;
import java.util.ArrayList;

import pkgData.WTuple;
import pkgData.WVector;
import pkgEnum.WCALC;
import pkgHelper.WAnalyzer;
import pkgHelper.WFileHelper;
import pkgHelper.WHelperSemanticTable;

public class main {

	public static void main(String[] args) {
		WHelperSemanticTable.fillTable();
		
		try {
			ArrayList<String> str = WFileHelper.getFileContent("/home/wuttic/Dokumente/Rep/Java/WCalc/samplefile.cpw");
			ArrayList<ArrayList<String>> str2 = WAnalyzer.split(str);
			for(ArrayList<String> s : str2) {
				/*System.out.println("START COMMAND");
				for(String strt: s) {
					System.out.println(" " + strt + " ");
				}
				System.out.println("END COMMAND ");
				*/
				System.out.println(s);
				//System.out.println(WCALC.VEC.toString());
			
				System.out.println(s.get(0));
				
				WVector v = (WVector) WHelperSemanticTable.distributeCommand(s);
			
			
				System.out.println(v);
			}
			
			//System.out.println(WHelperSemanticTable.getCommand("ADDVE2C"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
