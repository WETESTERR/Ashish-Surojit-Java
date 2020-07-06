package loops.whileloops;

public class LoopspracticeDay6 {

	void callingwhileloop()
	
	{
		int i = 0;
		int n = 1;
		while (i<=3)
		{
		int j =0;	
		while (j<=i)
		{
		if (n==2 || n==3 || n==5 || n==7)
		
			System.out.print("*");
		else
		    System.out.print(n);
		
		n=n+1;
		j++;
		}
		System.out.println();
		i++;
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LoopspracticeDay6 L1 = new LoopspracticeDay6();
		L1.callingwhileloop();
	}

}


/*
Program to print the below pattern

1
**
4*6
*8910

*/