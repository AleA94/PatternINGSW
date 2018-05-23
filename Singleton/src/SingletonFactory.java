
public abstract class SingletonFactory {
	private static SingletonFactory instance;
	private static String nome= "*";
	   protected SingletonFactory() { }
	   
	   public static void init(String nome)
	   {
		   if(instance==null)
			   nome=nome;
		   else throw new RuntimeException("Singleton già inizializzato");
	   }

	   public static SingletonFactory getInstance() {
		   if(instance==null)
		   {
			   switch(nome)
			   {
				   case "*":
						instance=new FactoryOfAsterisks();
						break;
					case "?":
						instance=new FactoryofQuestionMarks();
						break;
					case "o":
						instance=new FactoryOfCircles();
						break;
			   }
		   }
		   return instance;
	   }
	public abstract Tree makeTree();

	public abstract Gift makeGift();
}
