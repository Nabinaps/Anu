package MY_PRACTICE;

public class Main_exceptionOrder {
	public static void main(String[] args) 
	{  

		try{    
			int a=50;    
			a=30/0;    
		} 
		catch(ArrayIndexOutOfBoundsException e)  
		{  
			System.out.println("ArrayIndexOutOfBounds Exception occurs");  
		}    
		catch(ArithmeticException e)  
		{  
			System.out.println("Arithmetic Exception occurs");  
		}  

		catch(Exception e)  
		{  
			System.out.println("Parent Exception occurs"); 
			System.out.println(e);
			e.printStackTrace();
		}             
		System.out.println("rest of the code");    
	}  
}  

