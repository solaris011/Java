import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {
    public static void main(String[] args) {
        ArrayList<Team> team = new ArrayList<>();
        int count = 0, teamWins = 0, teamLosses = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("File? ");
        String file = scanner.nextLine();
        System.out.println("Team: ");
        String teamChosen = scanner.nextLine();
                
        try(Scanner sc = new Scanner(Paths.get(file))) {

            while (sc.hasNextLine()) {
                
                String line = sc.nextLine();
                String[] parts = line.split(",");
                
                String team1 = parts[0];
                String team2 = parts[1];
                int score1 = Integer.valueOf(parts[2]);
                int score2 = Integer.valueOf(parts[3]);
                
                if (team1.equals(teamChosen) || team2.equals(teamChosen)) {
                    team.add(new Team(team1, team2, score1, score2));
                    count++;
                    // *********************************************************
                    if (team1.equals(teamChosen)) {
                        if (score2 > score1) {
                            teamLosses++;
                        } else {
                            teamWins++;
                        }                        
                    } else if (team2.equals(teamChosen)) {
                        if (score2 > score1) {
                            teamWins++;
                        } else {
                            teamLosses++;
                        }   
                    }
                    
                    
                    
                }
            } 
                   
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }        
        System.out.println("Games: " + count);
        System.out.println("Wins: " + teamWins);
        System.out.println("Losses: " + teamLosses);
    }
}
