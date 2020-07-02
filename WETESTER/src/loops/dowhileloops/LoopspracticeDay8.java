package loops.dowhileloops;

import loops.whileloops.LoopspracticeDay7;

public class LoopspracticeDay8 {
	
void callingdowhileloop()
	
	{
	int i = 0;
	do
	{
	int j = 0;
	do
	{
		if (i%2==0)
			System.out.print("*");
		else
			System.out.print("#");
		j++;
	}
	while (j<=i);
	i++;
	System.out.println();
	}
	while (i<=4);
	
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LoopspracticeDay8 L1 = new LoopspracticeDay8();
		L1.callingdowhileloop();

	}

}

/*
Program to print the below pattern

*
##
***
####
*****

*/