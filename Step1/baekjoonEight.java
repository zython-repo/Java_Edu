import java.util.*;

public class baekjoonEight
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int a, b;
		a = sc.nextInt();
		b = sc.nextInt();
		
		if (0<a && b<10) {
			System.out.println(a*b);
		}
		else {
			System.out.println("plz 0 < A and B <10");
		}
	}
}
