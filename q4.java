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