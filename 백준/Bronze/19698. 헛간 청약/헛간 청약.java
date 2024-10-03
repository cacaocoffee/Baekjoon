import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int cows = sc.nextInt();  
        int W = sc.nextInt(); 
        int H = sc.nextInt(); 
        int L= sc.nextInt(); 
        int max = (W/L) * (H/L);
            
        if(cows>=max) System.out.println(max);
        else System.out.println(cows);
        
        
    }
}
