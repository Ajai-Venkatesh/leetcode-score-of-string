import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        int score = 0;

        for(int i = 0; i < s.length() - 1; i++) {

            int diff = Math.abs(s.charAt(i+1) - s.charAt(i));
            score += diff;

        }

        System.out.println(score);
    }
}
