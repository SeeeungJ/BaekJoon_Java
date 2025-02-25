package Math.BaekJoon_4673;

public class Main {
    public static void main(String[] args) {

        // 0번째 인덱스 스킵을 위한 10001 길이의 boolean 배열
        // 셀프 넘버의 인덱스는 true로 지정
        boolean[] numberArray = new boolean[10001];
        int self_number = 0;

        // 셀프 넘버 구분 반복문
        for (int i = 1; i < 10001; i++) {
            // 함수 호출
            self_number = d(i);
            // 허용된 인덱스 10001를 넘어가지 않도록 조건문 부여
            if (self_number < 10001) {
                // 셀프 넘버일 경우 해당 인덱스의 값을 true로 지정
                numberArray[self_number] = true;
            }
        }
        
        // 출력을 위한 반복문
        for (int i = 1; i < 10001; i++) {
            // 인덱스의 값이 false일 경우(셀프 넘버가 아닌)만 i값 출력
            if (!numberArray[i]) {
                System.out.println(i);
            }
        }
    }
    
    // 셀프 넘버 찾기 함수
    public static int d(int n) {
        int self_number = n;
        while(n > 0) {
            self_number += (n % 10);
            n /= 10;
        }
        return self_number;
    }
}
