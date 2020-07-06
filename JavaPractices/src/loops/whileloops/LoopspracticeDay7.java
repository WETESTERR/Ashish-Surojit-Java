package loops.whileloops;

public class LoopspracticeDay7 {
	
void callingwhileloop()
	
	{
	int i = 0;
	int n = 1;
	while (i<=4)
			{
			int j = 0;
			while (j<=i)
			{
			System.out.print (n);
			j++;
			}
			n=n+1;
			i++;
			System.out.println();
			}
	i = 0;
	n=4;
	while (i<=3)
	{
	int j = 0;
	while (j<= 3-i)
	{
	System.out.print (n);
	j++;
	}
	n--;
	i++;
	System.out.println();
	}
	
	
	
	
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
				LoopspracticeDay7 L1 = new LoopspracticeDay7();
				L1.callingwhileloop();

	}

}

/*
Program to print the below pattern

 	  1
      22
      333
      4444
      55555
      4444
      333
      22
      1

*/