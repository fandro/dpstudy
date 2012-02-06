package creationalpattern.factory.factorymethod;


public class IphoneFactory implements PhoneFactory {

	@Override
	public Phone produce() {
		// TODO Auto-generated method stub
		return new IPhone();
	}

}
