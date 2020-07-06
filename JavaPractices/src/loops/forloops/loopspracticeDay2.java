package loops.forloops;

public class loopspracticeDay2 {

	void callingforloop()
	
	{
		int n =1;
		for (int i=0;i<=3;i++)
		{
		for (int j=0;j<=i;j++)
		{
			System.out.print(n);
			n=n+1;
		}
		
		System.out.println();
		}
			
	}
	
	public static void main(String[] args) {
		loopspracticeDay2 L1 = new loopspracticeDay2();
		L1.callingforloop();
	}

}
