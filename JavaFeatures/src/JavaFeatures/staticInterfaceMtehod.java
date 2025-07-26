package JavaFeatures;

interface Employee
{
	String getName();
	static String d(String str)
	{
		return str;
	}
}

/*class SoftwareEngineer implements Employee
{
	public String getName() {
		return "Hello World";
	}
	
}
*/

public class staticInterfaceMtehod {

	public static void main(String[] args) {
		Employee e=()->"Hello World";
		System.out.println(e.getName());
		
		System.out.println(Employee.d("Nikita Yadav"));
		
	}

}
