package creationalpattern.factory.factorymethod;


/**
 * @uml.dependency   supplier="creationalpattern.factory.factorymethod.Phone"
 */
public class XiaoMiFactory implements PhoneFactory {

	@Override
	public Phone produce() {
		return new XiaoMi();
	}

}
