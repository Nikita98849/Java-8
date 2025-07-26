package JavaFeatures;

 interface Parent
{
	 public void sayhello(int i);
	
}
@FunctionalInterface
public interface InheritanceFunctionInterface extends Parent{
	
	public void sayhello(int i);  
	                             //but same name in parent and InheritanceFunctionInterface interface
	//public void disp();       //because only one Abstract method inside functinalInterface
	
	public static void main(String arg[])
	{
		InheritanceFunctionInterface obj=(x)->System.out.println("Hello"+x);
		obj.sayhello(100);
	}
	
	

}
