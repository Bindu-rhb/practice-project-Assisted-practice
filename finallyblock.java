package JAVAPROGRAMS;


	classTestFinallyBlock{  
		public static void main(String args[]){  
		try{
		int number=25/5;  
		System.out.println(number);  
		  }  
		catch(NullPointerException e)
		  {
			System.out.println(e);
		  }  
		finally
			{
	System.out.println("The Execution of final block always happen ");
			}  
		System.out.println("after final the rest of the code....");
		  } 
		}  
	/*public class TestFinallyBlock1 {

		publicstaticvoid main(String args[]){  
			try{
			int number=5/0;  
			System.out.println(number);  
			  }  
			catch(NullPointerException e)
			  {
				System.out.println(e);
			  }  
			finally
			  {
		System.out.println("finally block is always executed");
			  }  
			System.out.println("then rest of the code...");  
			  } 
	}*/




