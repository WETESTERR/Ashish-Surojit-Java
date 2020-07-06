package loops.whileloops;

public class LoopspracticeDay5 {

	void callingforloop()
	
	{
		
		int i = 0;
		while (i<=4)
		{
			int j = 0;
		while (j<=i)
			{
			System.out.print(j);
			j++;
			}
			System.out.println();
			i++;
			}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LoopspracticeDay5 L1 = new LoopspracticeDay5();
		L1.callingforloop();
	}
}
