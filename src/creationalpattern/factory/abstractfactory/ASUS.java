package creationalpattern.factory.abstractfactory;


public class ASUS implements MotherBoard {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean startRun(CPU cpu, RAM ram, HardDisk hd, Monitor monitor) {
		return true;
	}

}
