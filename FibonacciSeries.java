import java.util.Scanner;

class FibonacciSeries
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number : ");
		int limit = sc.nextInt();


		int a = 0;
		int b = 1;
		int temp;


		for(int i=a; i<=limit; i++)
		{
			temp = a+ b;
			a = b;
			b = temp;

			System.out.print(a+" ");
		}
	}
}
