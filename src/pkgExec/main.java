package pkgExec;

import java.io.IOException;
import java.util.ArrayList;

import pkgData.WTuple;
import pkgHelper.WAnalyzer;
import pkgHelper.WFileHelper;
import pkgHelper.WHelperSemanticTable;

public class main {

	public static void main(String[] args) {

		try {
			ArrayList<String> str = WFileHelper.getFileContent("/home/wuttic/Dokumente/Rep/Java/WCalc/samplefile.cpw");
			ArrayList<String> str2 = WAnalyzer.split(str);
			for(String s : str2)
				System.out.println(" " + s + ", ");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
