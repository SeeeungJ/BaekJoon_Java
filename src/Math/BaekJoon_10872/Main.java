package Math.BaekJoon_10872;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        int sum = 1;

        for (int i = 1; i <= N; i++){
            sum *= i;
        }

        System.out.println(sum);
    }
}
