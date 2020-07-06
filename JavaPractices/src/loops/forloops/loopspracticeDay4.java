package loops.forloops;

public class loopspracticeDay4 {
	
void callingforloop()
	
	{
	
	int n =1;
	for (int i=0;i<=4;i++)
	{
	for (int j=0;j<=4;j++)
	{
	System.out.print(n);
	}
	n++;
	}
	System.out.println();
	n--;

	for  (int i=0;i<=4;i++)
	{
	for (int j=4;j>=i;j--)
	{			
	System.out.print(n);
	}
	n--;
	System.out.println();
	}
			
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		loopspracticeDay4 L1 = new loopspracticeDay4();
		L1.callingforloop();

	}

}
