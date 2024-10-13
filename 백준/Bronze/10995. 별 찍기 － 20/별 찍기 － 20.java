import java.util.Scanner;
 
public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        generatePattern(n);
    }
 
    private static void generatePattern(int n) {
        for (int i = 1; i <= n; i++) {
            linePattern(i, n);
            System.out.println();
        }
    }
    
    private static void linePattern(int index, int n) {
        if (index % 2 == 1) {
            for (int j = 0; j < n; j++) {
                System.out.print("* ");
            }
        } else if (index % 2 == 0) {
            System.out.print(" ");
            for (int j = 0; j < n; j++) {
                System.out.print("* ");
            }
        }
    }
    
}