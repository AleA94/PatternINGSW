package abstractFactory;

public class FactoryofQuestionMarks implements Factory {

	@Override
	public Tree makeTree() {
		return new TreeOfQuestionMarks();
	}

	@Override
	public Gift makeGift() {
		return new GiftOfQuestionMarks();
	}

}
