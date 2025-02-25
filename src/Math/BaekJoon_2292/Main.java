package Math.BaekJoon_2292;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        int output = 1, compare = 1;

        while(compare < N) {
            compare += 6 * output;
            output++;
        }

        System.out.println(output);
    }
}
