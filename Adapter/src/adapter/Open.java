package adapter;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

public class Open implements OpenDocument{
	Adapter adapter;
	
	public void open(String type, String name){
		
		if(type.equalsIgnoreCase("txt")){
			try {
			     if (Desktop.isDesktopSupported()) {
			       Desktop.getDesktop().open(new File("C:\\Users/aless/Desktop/Adapter.txt"));
			     }
			   } catch (IOException ioe) {
			     ioe.printStackTrace();
			  }
		}
		
		else if(type.equalsIgnoreCase("word")|| type.equalsIgnoreCase("pdf")){
			adapter = new Adapter(type);
	        adapter.open(type, name);
		}
		
	}
}
