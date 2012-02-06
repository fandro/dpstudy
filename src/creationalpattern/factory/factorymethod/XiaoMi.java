package creationalpattern.factory.factorymethod;

/**
 * The Class MotoME525.
 */
public class XiaoMi implements Phone {

	/* (non-Javadoc)
	 * @see creationalpattern.factory.simplefactory.Phone#call(java.lang.String)
	 */
	@Override
	public void call() {
		System.out.println("call form XiaoMi phone!");
	}

}
