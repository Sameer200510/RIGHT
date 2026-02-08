import java.io.*;

public class q28 
{
    public static void main(String[] args) throws IOException 
    {
        BufferedReader reader = new BufferedReader(new FileReader("students.txt"));
        BufferedWriter debaredWriter = new BufferedWriter(new FileWriter("debared.txt"));
        BufferedWriter notDebaredWriter = new BufferedWriter(new FileWriter("not_debared.txt"));

        String line;
        while ((line = reader.readLine()) != null) 
        {
            String[] data = line.split(" ");
            int attendance = Integer.parseInt(data[4]);

            if (attendance < 70) {
                debaredWriter.write(line);
                debaredWriter.newLine();
            } else {
                notDebaredWriter.write(line);
                notDebaredWriter.newLine();
            }
        }

        reader.close();
        debaredWriter.close();
        notDebaredWriter.close();

        System.out.println("Debared and not-debared student lists generated successfully.");

    }