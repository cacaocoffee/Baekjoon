import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int N = sc.nextInt();
        int[] width = new int [N];
        int[]height =new int [N];
        int total =0;
        for (int i=0; i<width.length; i++){
            width[i] = sc.nextInt();
            height[i] = sc.nextInt();
        }
        for(int i=0; i< width.length; i++){
            if(width[i] == 136){
                total +=1000;
            }else if( width[i] == 142){
                total +=5000;
            }else if( width[i] == 148){
                total += 10000;
            }else if(width[i] ==154){
                total +=50000;
            }
        }
        System.out.println(total);
        sc.close();

    }
}