public class AbstractApp{
	public static void main(String[] args){
		System.out.println("Abstract classes");
		//Device dev = new Device();
		Phone phone = new Phone();
		Tablet tab = new Tablet();
		//phone.switchOn();
		//tab.switchOn();

		AbstractApp aa = new AbstractApp();
		aa.switchOnDevice(phone);
		aa.switchOnDevice(tab);
	}

	public void switchOnDevice(Device dev){
		dev.switchOn();
	}


}