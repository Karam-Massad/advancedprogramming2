package facade;

public class DeliveryWebApp extends DeliveryManager {
	
	@Override
	public void sendDeliveryPackage(String Accountfrom, String Accountto, String ammount) {
		System.out.println("Delevering  please wait ...\n"+"Sending from "+Accountfrom+" to "+ Accountto+" the amount of : " +ammount);
	}
}
