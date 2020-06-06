package facade;

import java.util.Scanner;

public class Main {

	
		public static void main(String[] args) {
			try (Scanner x = new Scanner(System.in)) {
				System.out.println("please enter the sender name ");
			
				String a = x.nextLine();
				System.out.println("please enter the reciepnt ");
				String b =x.nextLine();
				System.out.println("please enter the ammount");
				String c= x.nextLine();
				
				DeliveryManager dm = new DeliveryManager();

				dm.sendDeliveryPackage(a,b,c);
				
			
				System.out.println("================");
				
		
				DeliveryWebApp da= new DeliveryWebApp();
				da.sendDeliveryPackage(a,b,c);
			}

		
		}

	}


