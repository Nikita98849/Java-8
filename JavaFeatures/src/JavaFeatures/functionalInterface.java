package JavaFeatures;

@FunctionalInterface
public interface functionalInterface {
   public void disp(String s);
   
   //public void disp1(); //error because exact only one abstract method inside interface but here two abstract method so can generate error
	
   default void d()
   {
	   System.out.println("This is default interface ..");
   }
   
   public static void d1()
   {
	   System.out.println("This is static interface..");
   }
   public static void main(String arg[])
   {
	   functionalInterface obj=(i)->System.out.print("Hello world "+i);
	   obj.d();
	   functionalInterface.d1();
	   obj.disp("Hi Nikita");
	   
   }
}
