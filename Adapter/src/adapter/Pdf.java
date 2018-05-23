package adapter;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

public class Pdf implements AdvancedOpenDocument {

	@Override
	public void openWord(String name) {}

	@Override
	public void openPdf(String name) {
		try {
		     if (Desktop.isDesktopSupported()) {
		       Desktop.getDesktop().open(new File("C:\\Users/aless/Desktop/Adapter.pdf"));
		     }
		   } catch (IOException ioe) {
		     ioe.printStackTrace();
		  }
	}

}
