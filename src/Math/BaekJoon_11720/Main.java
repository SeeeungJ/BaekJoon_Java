package Math.BaekJoon_11720;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        String number = scan.next();
        int sum = 0;

        // 문자열를 배열로 나눠담아 각 인덱스마다 합을 구할 수 있도록 표현
        char[] number_array = number.toCharArray();

        for (int i = 0; i < number.length(); i++){
            // char를 숫자로 변환 (문자 '0'의 아스키 코드를 빼줌)
            sum += number_array[i] - '0';
        }

        System.out.println(sum);
    }
}
