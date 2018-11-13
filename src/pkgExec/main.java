package pkgExec;

import java.io.IOException;
import java.util.ArrayList;

import pkgData.WTuple;
import pkgHelper.WFileHelper;

public class main {

	public static void main(String[] args) {

		try {
			ArrayList<String> str = WFileHelper.getFileContent("/home/wuttic/Dokumente/Rep/Java/WCalc/samplefile.cpw");
			for(String s : str)
				System.out.println("Line Starts: " + s + ", Line Ends");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
