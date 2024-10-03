import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 입력 처리
        String[] input = br.readLine().split(" ");
        
        int C = Integer.parseInt(input[0]);  // 사탕 가격
        int K = Integer.parseInt(input[1]);  // 0의 개수

        // 10의 K제곱 계산
        double num = Math.pow(10, K);
        
        // 사탕 가격 C를 num으로 나눈 후 반올림, 다시 num을 곱해서 최종 값 계산
        int ans = (int) (Math.round(C / num) * num);
        
        // 결과 출력
        System.out.println(ans);
    }
}
