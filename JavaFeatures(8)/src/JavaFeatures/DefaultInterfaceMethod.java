package JavaFeatures;

interface parent1
{
	default int disp(int a,int b)
	{
		return a+b;
	}
}

interface child
{
	default int disp(int a,int b)
	{
		return a+b;
	}
}

public class DefaultInterfaceMethod implements parent1,child {

	public static void main(String[] args) {
		
		DefaultInterfaceMethod obj=new DefaultInterfaceMethod();
		obj.disp(10, 20);

	}

	@Override
	public int disp(int a, int b) {
		// TODO Auto-generated method stub
		return parent1.super.disp(a, b);
	}

}
