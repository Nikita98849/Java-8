package JavaFeatures;

interface demo
{
	void disp();
	
	default void add()
	{
		int a=10,b=20;
		System.out.println("Add = "+(a+b));
	}
	static void sub()
	{
		int a=20,b=10;
		System.out.println("Subtraction = "+(a-b));
	}
}

public class InterfaceExample implements demo {
	public void disp()
	{
		System.out.println("This method is override in class InterFaceExample");
	}
	public static void main(String str[])
	{
		InterfaceExample obj=new InterfaceExample();
		obj.disp();
		obj.add();
		demo.sub();
	}

}
