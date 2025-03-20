import java.util.Scanner;
class q2
{
	public static void main(String[] args)
	{
		int i;
		String str1,str2,temp,t2;
		Scanner sr = new Scanner(System.in);
		System.out.println("Enter string 1 :");
		str1 = sr.nextLine();
		System.out.println("Enter string 2 having same word length :");
		str2 = sr.nextLine();
		String[] arr1 = str1.split(" ");
		String[] arr2 = str2.split(" ");
		for(i=0;i<arr1.length;i++)
		{
			int l1,l2;
			l1 = arr1[i].length();
			l2 = arr2[i].length();
			if(l1<=l2)
			{
				
				temp = arr1[i];
				t2 = arr2[i].substring(0,l1);
				arr1[i] = t2;
				t2 = arr2[i].substring(l1,arr2[i].length());
				arr2[i] = temp+t2;
			}
			else
			{				
				temp = arr2[i];
				t2 = arr1[i].substring(0,l2);
				arr2[i] = t2;
				t2 = arr1[i].substring(l2,arr1[i].length());
				arr1[i] = temp+t2;				
			}
		}
		for(i=0;i<arr1.length;i++)
		{
			System.out.print(arr1[i]+" ");	
		}
		System.out.println();
		for(i=0;i<arr1.length;i++)
			System.out.print(arr2[i]+" ");
	}
}