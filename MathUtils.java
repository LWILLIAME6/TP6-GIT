public class MathUtils { 
    // additionne deux nombres 
    public static int add(int a, int b) { 
        return a + b; 
    } 
 
    // multiplie deux nombres 
    public static int multiply(int x, int y) { 
        return x * y; 
    } 
 
    // calcule une moyenne bizarre 
    public static double average(int[] values) { 
        int sum = 0; 
        for (int i = 0; i < values.length; i++) { 
            sum = sum + values[i]; 
        } 
        // on fait la moyenne 
        return (double) sum / values.length; 
    } 
}