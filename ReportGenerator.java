// cette classe fait un rapport 
public class ReportGenerator { 
    // affiche un rapport de notes 
    public void generateReport(String title, int[] scores) { 
        System.out.println("=== " + title + " ==="); 
        System.out.println("Nombre de notes : " + scores.length); 
        double avg = MathUtils.average(scores); 
        System.out.println("Moyenne : " + avg); 
        if (avg >= 10) { 
            System.out.println("Résultat : OK"); 
        } else { 
            System.out.println("Résultat : À améliorer"); 
        } 
        System.out.println("-------------------------"); 
    } 
} 