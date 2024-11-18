import java.util.ArrayList;

public class GradeRegister {

    private ArrayList<Integer> grades;
    private ArrayList<Integer> pointsList;
    private ArrayList<Integer> passingPoints;
    
    public GradeRegister() {
        this.grades = new ArrayList<>();
        this.pointsList = new ArrayList<>();
        this.passingPoints = new ArrayList<>();
    }

    public void addGradeBasedOnPoints(int points) {
        
        // *************************************************
      
        this.pointsList.add(points);
        if (points >= 50) {
            this.passingPoints.add(points);
            
        }
        this.grades.add(pointsToGrade(points));
        
    }

    public int numberOfGrades(int grade) {
        int count = 0;
        for (int received : this.grades) {
            if (received == grade) {
                count++;
            }
        }

        return count;
    }

    public static int pointsToGrade(int points) {

        int grade = 0;
        if (points < 50) {
            grade = 0;
        } else if (points < 60) {
            grade = 1;
        } else if (points < 70) {
            grade = 2;
        } else if (points < 80) {
            grade = 3;
        } else if (points < 90) {
            grade = 4;
        } else {
            grade = 5;
        }

        return grade;
    }
    
    public double averageOfGrades() {
        int count = 0, sum = 0;
        double avg = 1;
        
        if (grades.isEmpty()) {
            return -1;
        }
        
        for (int i : grades) {
            count++;
            sum += i;
        }
        avg = (1.0) * sum / count;
        return avg;
    }
    
    public double averageOfPoints() {
        int count = 0, sum = 0;
        double avg = 1;
        
        if (pointsList.isEmpty()) {
            return -1;
        }
        
        for (int i : pointsList) {
            count++;
            sum += i;
        }
        avg = (1.0) * sum / count;
        return avg;
    }

    public double averageOfPointsPassing() {
        int count = 0, sum = 0;
        double avg = 1;
        
        if (passingPoints.isEmpty()) {
            return -1;
        }
        
        for (int i : passingPoints) {
            count++;
            sum += i;
        }
        avg = (1.0) * sum / count;
        return avg;
    }

    public double passPercentage () {
        int count1 = 0, count2 = 0;
        double avg = 1;
        
        if (passingPoints.isEmpty()) {
            return -1;
        }
        
        for (int i : pointsList) {
            count2++;
           
        }
        
        for (int i : passingPoints) {
            count1++;
           
        }
        avg = 100 * ((1.0) * count1 / count2);
        return avg;
        
    }
}

