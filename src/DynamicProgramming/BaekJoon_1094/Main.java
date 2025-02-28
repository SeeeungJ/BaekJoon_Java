package DynamicProgramming.BaekJoon_1094;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        // ArrayList를 사용함으로써 배열을 동적으로 수정
        // 일반 Array 경우 크기가 고정이라 불변
        ArrayList<Integer> stick = new ArrayList<>();
        stick.add(64);

        int X = scan.nextInt();
        int sum = 0;
        int temp = 0;

        while(sum != X) {
            // 1조건 실행
            sum = arraySum(stick);
            
            // 1-1 조건 실행
            if (sum > X){
                temp = stick.get(stick.size() - 1) / 2;
                stick.remove(stick.get(stick.size() - 1));
                stick.add(temp);

                // 1-2 조건 실행
                sum = arraySum(stick);
                if (sum < X) {
                    stick.add(temp);
                }
            }
            // while문 안에 있는 조건이 만족하는지 비교하기 위한 sum 초기화
            sum = arraySum(stick);
        }
        System.out.println(stick.size());
    }

    // Python의 sum() 함수를 구현
    static int arraySum(ArrayList<Integer> stick) {
        int sum = 0;
        for (Integer num : stick){
            sum += num;
        }
        return sum;
    }
}

