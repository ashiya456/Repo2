package fibonacci;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
	int k,a=1,b=1;
	System.out.println("enter the number");
	Scanner sc=new Scanner(System.in);
	k=0;
	int n=sc.nextInt();
	System.out.print("1 1 ");
	while(k<=n)
	{k=a+b;
	if(k>=n)
		break;
	System.out.print(k+ " ");
	a=b;
	b=k;
	}

	}

}
