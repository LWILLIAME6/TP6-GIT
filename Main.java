public class Main { 
    public static void main(String[] args) { 
        int[] notesMaths = {12, 9, 15, 8}; 
        int[] notesInfo = {18, 14, 16}; 
 
        ReportGenerator generator = new ReportGenerator(); 
        generator.generateReport("Bulletin Maths", notesMaths); 
        generator.generateReport("Bulletin Informatique", notesInfo); 
    } 
} 