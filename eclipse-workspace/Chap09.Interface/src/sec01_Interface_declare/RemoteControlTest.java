package sec01_Interface_declare;

public class RemoteControlTest {

	public static void main(String[] args) {

		RemoteControl rc = new TV();

		rc.turnOn();
		rc.setVolume(21);
		rc.setMute(false);
		RemoteControl.changeBattery();
		System.out.println("");
		
		RemoteControl rc1 = new Audio();
		
		rc1.turnOn();
		rc1.setVolume(11);
		rc1.setMute(true);
		RemoteControl.changeBattery();
	}

}
