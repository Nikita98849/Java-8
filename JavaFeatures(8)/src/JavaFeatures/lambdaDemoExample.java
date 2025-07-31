package JavaFeatures;

interface Demo1
{
	void disp(int i);
}
public class lambdaDemoExample {
//	public void disp(int i)
//	{
//		System.out.println("Hello"+i);
//	}

	public static void main(String[] args) {
		
		/*.....First way.......*/
	Demo1 obj;
//		obj=new Demo1()
//				{
//			      public void disp(int i)
//			      {
//			       System.out.println("Hello"+i);
//			      }
//				};
//		obj.disp();
		
		
		/*........Second way.........*/

//		obj=(int i) ->
//			      {
//				    System.out.println("Hello"+i);
//				  };
//						
//		obj.disp();
		
		/*.......Third way.......*/
//		 obj=()->System.out.println("Hello");
		 
		 /*.......Using parameter......*/
	
		 obj=i -> System.out.println("Hello "+i);
		 obj.disp(9);

	}

}
