package loops.forloops;

import loops.dowhileloops.LoopspracticeDay9;

public class LoopspracticeDay10 {
	

		void callingforloop()
		
		{
			
			int n = 5;
			int co = 0;

		for (int i=0; i<n; i++) 
	    {  
			co = co +1;
	        for (int j=n-i; j>1; j--) 
	        {  
	            System.out.print(" "); 
	        } 

	        //  inner loop to handle number of columns 
	        //  values changing acc. to outer loop 
	        for (int j=0; j<=i; j++ ) 
	        { 
	            // printing numbers 
	            System.out.print(co + " "); 
	        } 
            
	        // ending line after each row 
	        System.out.println(); 
	        
	    }
	
		}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LoopspracticeDay10 L1 = new LoopspracticeDay10();
		L1.callingforloop();

		
		

	}

}




/*
Program to print the below pattern

    1
   222
  33333
 4444444
555555555


*/