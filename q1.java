import java.util.Scanner;
class q1
{
	public static void main(String[] args)
	{
		int count1=0,count2=0;
		Scanner sr  = new Scanner(System.in);
		System.out.println("Enter the sentence : ");
		String str;
		str = sr.nextLine();
		String[] arr = str.split(" ");
		for(int i=0;i < arr.length;i++)
		{
			arr[i] = arr[i].toLowerCase();
			if((arr[i].charAt(0)=='a' || arr[i].charAt(0)=='e' ||arr[i].charAt(0)=='i' ||arr[i].charAt(0)=='o' || 

 arr[i].charAt(0)=='u') && ((arr[i].charAt(arr[i].length() - 1)=='a') || ((arr[i].charAt(arr[i].length() - 1))=='e') ||(arr[i].charAt(arr[i].length() - 1)=='i') ||(arr[i].charAt(arr[i].length() - 1)=='o') ||(arr[i].charAt(arr[i].length() - 1)=='u') ) )
			count1++;
			
			else if((arr[i].charAt(0)!='a' && arr[i].charAt(0)!='e' && arr[i].charAt(0)!='i' && arr[i].charAt(0)!='o' &&  arr[i].charAt(0)!='u') && ((arr[i].charAt(arr[i].length() - 1)!='a') && ((arr[i].charAt(arr[i].length() - 1))!='e')&& (arr[i].charAt(arr[i].length() - 1)!='i') && (arr[i].charAt(arr[i].length() - 1)!='o') && (arr[i].charAt(arr[i].length() - 1)!='u') ) )
			count2++;
		}
		System.out.println("Count of vowels : "+count1);
		System.out.println("Count of consonants : "+count2);
	}

}
































//Rust will be a very crutial phase so we will start with python only and after that we will working on to update to rust






