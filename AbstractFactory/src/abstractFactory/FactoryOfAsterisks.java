package abstractFactory;

public class FactoryOfAsterisks implements Factory {

	@Override
	public Tree makeTree() {
		return new TreeOfAsterisks();
	}

	@Override
	public Gift makeGift() {
		return new GiftOfAsterisks();
	}

}
