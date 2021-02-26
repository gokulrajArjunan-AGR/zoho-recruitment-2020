
import java.util.Scanner;

public class Solution {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		int n=str.length();
		int i, j;       
		for (i=0; i<n; i++)   
		{       
		for (j=2*(n-i); j>0; j--)         
		{       
		System.out.print(" ");   
		}    
		for (j=0; j<=i; j++ )   
		{        
		System.out.print(str.charAt((n/2+j)%n)+" ");   
		}     
		System.out.println();   
		}   
	}
}
