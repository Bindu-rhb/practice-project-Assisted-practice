package JAVAPROGRAMS;
importjava.io.IOException;  
class Testthrows2{  
void m()throwsIOException{  
throw new IOException("device error");//checked exception  
  }  
void n() throws IOException{  
m();  
  }  
void p(){  
try{
n();  
   }
catch(Exception e)
{
System.out.println("exception handled");
}  
}  
public static void main(String args[]){  
   Testthrows2 obj=new Testthrows2();  
obj.p();  
System.out.println("normal flow...");  
  }  
}



