import java.io.*;
import java.util.*;
class Team 
{
    String name;
    int points;

    Team(String name, int points) 
    {
        this.name = name;
        this.points = points;
    }
}
public class q29 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        List<Team> teams = new ArrayList<>();

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("ipl_points.txt"))) 
        {
            System.out.print("Enter number of teams: ");
            int n = sc.nextInt();
            sc.nextLine();
            for (int i = 0; i < n; i++) 
            {
                System.out.print(" Team name: ");
                String name = sc.nextLine();
                System.out.print(" Points: ");
                int pts = sc.nextInt();
                sc.nextLine();
                writer.write(name + "," + pts);
                writer.newLine();
            }
            System.out.println("Teams saved to file.");
        } catch (IOException e) 
        {
            System.out.println("File write error.");
        }

        try (BufferedReader reader = new BufferedReader(new FileReader("ipl_points.txt"))) 
        {
            String line;
            while ((line = reader.readLine()) != null) 
            {
                String[] parts = line.split(",");
                teams.add(new Team(parts[0], Integer.parseInt(parts[1])));
            }
        } catch (IOException e) {
            System.out.println("File read error.");
        }
        teams.sort((a, b) -> b.points - a.points);
        System.out.println("Top 4 Teams");
        for (int i = 0; i < Math.min(4, teams.size()); i++) {
            System.out.println((i+1) + ". " + teams.get(i).name + " - " + teams.get(i).points + " pts");
        }
    }
}