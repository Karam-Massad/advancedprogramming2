package singleton;

public class SingleObject {

	   private static SingleObject instance = new SingleObject();

	   
	   private SingleObject(){}

	   //Get the only object available
	   public static SingleObject getInstance(){
	      return instance;
	   }

	   public void showMessage(){
	      System.out.println("Hello World!");
	   }
}
