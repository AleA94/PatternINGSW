

public class FactoryOfCircles extends SingletonFactory{

	@Override
	public Tree makeTree() {
		return new TreeOfCircles();
	}

	@Override
	public Gift makeGift() {
		return new GiftOfCircles();
	}

}
