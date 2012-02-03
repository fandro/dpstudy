package creationalpattern.factory.simplefactory;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Phone phone = SimpleFactory.callPhone('i');
		phone.call();
		Phone phone2 = SimpleFactory.callPhone('m');
		phone2.call();
	}
	 
}
