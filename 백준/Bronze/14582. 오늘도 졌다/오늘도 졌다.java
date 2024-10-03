import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        String[] input1 = br.readLine().split(" ");
        String[] input2 = br.readLine().split(" ");

		int score = 0;
		for (int i = 0; i < input1.length; i++) {
			score += Integer.parseInt(input1[i]);
			if (score > 0) {
				System.out.println("Yes");
				return;
			}
			score -= Integer.parseInt(input2[i]);
		}
		System.out.println("No");
      
    }
}
