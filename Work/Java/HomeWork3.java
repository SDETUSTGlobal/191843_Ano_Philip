public class HomeWork3{

   public static void main(String args[]) {
      
      char grade = 'C';

      switch(grade) {
         case 'A' :
		 {for(int i=1;i<100;i++)
			 {if((i%2)!=0)
				 {
            System.out.println("odd numbers from 1 to 100"+i); 
            
				 }
			 }
			 break;
		 }
         case 'B' :
		 {for(int i=1;i<100;i++)
			 {if((i%2)==0)
				 {
            System.out.println("even numbers from 1 to 100"+i); 
            
				 }
			 }
			 break;
		 }
         case 'C' :
		 {int x=25;
			 
            int sr = (int)Math.sqrt(x);
           
         if(sr*sr== x)
		 {System.out.println("perfect square");
		 }
		 else
	     {System.out.println("not a perfect square");
		 } break;
		 }
		  case 'D' :
		 {int num=-5;
		 if(num>=0)
		 {
            System.out.println("+ve");
		 }
		 else{System.out.println("-ve");
		 }break;
		 }
		 
	  }
   }
}
