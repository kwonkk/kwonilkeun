package Ch99;

import java.util.Scanner;

public class MakeStar {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("높이를 입력해주세요");
		int n=sc.nextInt();		//높이
		int i=0;	//행
		int j=0;	//공백
		int k=0;	//별
		
		while(i<n)
		{
			//공백
			j=0;
			while(j<=(n-2)-i)
			{
				System.out.print(" ");
				j++;
			}		
			//별
			k=0;
			while(k<=2*i)
			{
				System.out.print("*");
				k++;
			}
			System.out.println();
			i++;
		}		

	}

}
