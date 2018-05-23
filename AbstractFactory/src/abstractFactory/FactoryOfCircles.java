package abstractFactory;

public class FactoryOfCircles implements Factory {

	@Override
	public Tree makeTree() {
		return new TreeOfCircles();
	}

	@Override
	public Gift makeGift() {
		return new GiftOfCircles();
	}

}
