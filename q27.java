import java.io.*;
public class q27 
{
    public static void main(String[] args) 
    {
        try (BufferedReader reader = new BufferedReader(new FileReader("input.txt"))) 
        {
            String line;
            int lineNumber = 1;
            while ((line = reader.readLine()) != null) 
            {
                int count = 0;
                for (String word : line.split("\s+")) 
                {
                    if (isPalindrome(word)) count++;
                }
                System.out.println(" Line " + lineNumber + " Palindromes: " + count);
                lineNumber++;
            }
        } catch (IOException e) 
        {
            System.out.println(" File Error: " + e.getMessage());
        }
    }
    public static boolean isPalindrome(String word) 
    {
        word = word.toLowerCase().replaceAll("[a to z]", "");
        return word.equals(new StringBuilder(word).reverse().toString());
    }
}
