class Human{  
  
 void eat(){System.out.println("Human is eating");}}
 
 
class Man extends Human{  
   
void eat(){System.out.println("Man is eating food");} }

 class Woman extends Human{
	
 void eat() {System.out.println("Woman is eating apple");}
	

	
  
  public static void main(String args[]){  
  Man m = new Man();
  m.eat();
  }
}
