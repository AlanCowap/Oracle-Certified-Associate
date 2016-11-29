abstract class Device{
	protected int serialNumber = 0;
	public abstract void switchOn();
	public void vibrate(){System.out.println("vibrate");}
}

class Phone extends Device{
	public void switchOn(){
		System.out.println("Phone switch on");
	}
}

class Tablet extends Device{
	public void switchOn(){
		System.out.println("Tablet switch on");
	}
}