package adapter;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

public class Word implements AdvancedOpenDocument{
	@Override
	public void openWord(String name){
		 try {
		     if (Desktop.isDesktopSupported()) {
		       Desktop.getDesktop().open(new File("C:\\Users/aless/Desktop/Adapter.docx"));
		     }
		   } catch (IOException ioe) {
		     ioe.printStackTrace();
		  }
	}
	
	public void openPdf(String name){}
}
