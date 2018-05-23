

public class FactoryofQuestionMarks extends SingletonFactory {

	@Override
	public Tree makeTree() {
		return new TreeOfQuestionMarks();
	}

	@Override
	public Gift makeGift() {
		return new GiftOfQuestionMarks();
	}

}
