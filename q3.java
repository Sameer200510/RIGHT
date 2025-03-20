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