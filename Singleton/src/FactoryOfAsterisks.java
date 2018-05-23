

public class FactoryOfAsterisks extends SingletonFactory {

	@Override
	public Tree makeTree() {
		return new TreeOfAsterisks();
	}

	@Override
	public Gift makeGift() {
		return new GiftOfAsterisks();
	}

}
