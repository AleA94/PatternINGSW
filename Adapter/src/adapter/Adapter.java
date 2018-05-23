package adapter;

public class Adapter implements OpenDocument {

	AdvancedOpenDocument advancedOpenDocument;

	public Adapter(String type) {
		if (type.equalsIgnoreCase("word")) {
			advancedOpenDocument = new Word();

		} else if (type.equalsIgnoreCase("pdf")) {
			advancedOpenDocument = new Pdf();
		}
	}

	@Override
	public void open(String type, String name) {
		if(type.equalsIgnoreCase("word")){
	         advancedOpenDocument.openWord(name);
	      }
	      else if(type.equalsIgnoreCase("pdf")){
	         advancedOpenDocument.openPdf(name);
	      }
	}

}
