public class extra {
    
}








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
			if((arr[i].charAt(0)=='a' || arr[i].charAt(0)=='e' ||arr[i].charAt(0)=='i' ||arr[i].charAt(0)=='o' ||  arr[i].charAt(0)=='u') && ((arr[i].charAt(arr[i].length() - 1)=='a') || ((arr[i].charAt(arr[i].length() - 1))=='e') ||(arr[i].charAt(arr[i].length() - 1)=='i') ||(arr[i].charAt(arr[i].length() - 1)=='o') ||(arr[i].charAt(arr[i].length() - 1)=='u') ) )
			count1++;
			
			else if((arr[i].charAt(0)!='a' && arr[i].charAt(0)!='e' && arr[i].charAt(0)!='i' && arr[i].charAt(0)!='o' &&  arr[i].charAt(0)!='u') && ((arr[i].charAt(arr[i].length() - 1)!='a') && ((arr[i].charAt(arr[i].length() - 1))!='e')&& (arr[i].charAt(arr[i].length() - 1)!='i') && (arr[i].charAt(arr[i].length() - 1)!='o') && (arr[i].charAt(arr[i].length() - 1)!='u') ) )
			count2++;
		}
		System.out.println("Count of vowels : "+count1);
		System.out.println("Count of consonants : "+count2);
	}
}














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














import java.util.Scanner;
public class q3 
{
    public static void main(String[] args) 
    {
        String str,substring,str1;
        int len,lensub,j,c=0;
        Scanner sr=new Scanner(System.in);
        System.out.print("Enter the Multiple String");
        str=sr.nextLine();
        System.out.print("Enter the Substring to Search");
        substring=sr.nextLine();
        len=str.length();
        for(int i=0;i<len;i++)
        {
            if(str.charAt(i)!=' ')
            {
                j=i;
                while((j+1)<len && str.charAt(j+1)!=' ')
                {
                    j++;
                }
                str1=str.substring(i,j+1);
                if(str1.equals(substring))
                {
                    c++;
                }
                i=j;
            }
        }
    System.out.println("The No. of Substrings in the Multiple String are: "+c);
    }
}







import java.util.Scanner;
class work
{
    public static void main(String st[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first string ");
        String s1=sc.next();
        System.out.println("Enter the second string");
        String s2=sc.next();
        String s3=s1+s2;
        String ans1="",ans2="";
        for(int i=0; i<s3.length(); i++)
        {
            char ch=s3.charAt(i);
            int flag=0;
            for(int j=0; j<s3.length(); j++)
            {
                if(i!=j && s3.charAt(i)==s3.charAt(j))
                {
                    flag=1;
                    break;
                }
            }
            if(flag==1)
            {
                if(ans1.indexOf(ch)==-1)
                {
                    ans1=ans1+ch+" ";
                }
            }
            else
            {
                ans2=ans2+ch+" ";
            }
        }
        System.out.println("Common characters: "+ans1);
        System.out.println("Non common characters: "+ans2);
    }
}