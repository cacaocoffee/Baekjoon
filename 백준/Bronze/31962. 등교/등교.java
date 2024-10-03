import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();  // 입력받는 N
        int T = sc.nextInt();  // 입력받는 T
        
        int answer = -1;  // 세미콜론 추가
        for (int i = 0; i < N; i++) {  // i < N으로 수정하여 N번 반복
            int N1 = sc.nextInt();  // N1 값 입력받기
            int T1 = sc.nextInt();  // T1 값 입력받기
            if (N1 + T1 <= T) {  // N1과 T1의 합이 T보다 작거나 같을 때
                if (answer <= N1) answer = N1;  // answer에 가장 큰 N1 저장
            }
        }
        System.out.println(answer);  // 결과 출력
    }
}
