package JavaFeatures;

/*public class ThreadLambaExpress implements Runnable {
	@Override
	public void run() {
		for(int i=0;i<=10;i++)
		{
			System.out.println("Hello "+i);
		}
		
	}
	public static void main(String[] args) {
		ThreadLambaExpress obj=new ThreadLambaExpress();
		Thread t=new Thread(obj);
		t.run();	
	}
}*/
public class ThreadLambaExpress
{
	public static void main(String arg[])
	{
		Runnable r=()->{
		for(int i=0;i<=10;i++)
		{
			System.out.println("Hello "+i);
		}
		};
		Thread t=new Thread(r);
		t.run();
		
	}
}
