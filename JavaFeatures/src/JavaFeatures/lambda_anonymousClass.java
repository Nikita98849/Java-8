package JavaFeatures;

interface Employee1
{
	void getsalary();
}
public class lambda_anonymousClass {

	public static void main(String[] args)
	{
		int x=10;
	      Employee1 emp=()->
	          {
	    		 // int x=10;
	    		System.out.println(x);
	    		
	    		
	          };
		 
	    	
	    	Employee1 emp1=new Employee1()
	    	{
	    		 int x=10;
	               @Override
	               public void getsalary()
	               {
	            	  
	            	   System.out.println(this.x);
	            	
	               }
	    	};
	    	emp.getsalary();
	    	emp1.getsalary();


	}

}
