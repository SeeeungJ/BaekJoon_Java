package Math.BaekJoon_3003;

import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] whiteChess = {1, 1, 2, 2, 2, 8};

        String findWhiteChess = scan.nextLine();

        // 공백을 기준으로 문자열 분리 후 배열 형태로 저장
        String[] tokens = findWhiteChess.split("\\s+");
        
        // 문자를 정수로 변환하여 저장할 임시 변수
        int temp;
        int[] result = new int[whiteChess.length];

        for (int i = 0; i < tokens.length; i++){
            // 정수로 변환한 후 whiteChess의 각 자릿수에서
            // 빼주어 result 배열에 저장
            temp = Integer.parseInt(tokens[i]);
            result[i] = whiteChess[i] - temp;
        }

        for (int i = 0; i < result.length; i++){
            System.out.print(result[i] + " ");
        }
    }
}
