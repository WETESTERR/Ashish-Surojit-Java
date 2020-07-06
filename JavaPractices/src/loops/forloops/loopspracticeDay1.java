package loops.forloops;
public class loopspracticeDay1 {
	
 void callingforloop ()

{
	 for (int i=0;i<10;i++)
		for (int j=0;j<=i;j++) 
		 {
			System.out.print ("*");
		 }
	 System.out.println();
}



public static void main(String args[])
{
	
	loopspracticeDay1 L1 = new loopspracticeDay1();
	L1.callingforloop();
	
}


}