/**
 * Autor kodu: Sewery Adamczyk
 * Pochodzenie: http://pl.spoj.com/problems/PP0502B/
 */

import java.util.*;

public class Main {

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		
		for(int i=0;i<t;i++)
		{
			int n = in.nextInt();
			int[] tab = new int[n];
			for(int j=0;j<n;j++)
			{
				int k = in.nextInt();
				tab[j] = k;
			}
			for(int l=tab.length-1; l>=0; l--)
			{
				System.out.print(tab[l] + " ");
			}
			System.out.println();
		}

	}

}
