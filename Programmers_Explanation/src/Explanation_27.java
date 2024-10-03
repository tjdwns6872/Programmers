/*
x만큼 간격이 있는 n개의 숫자
*/
import java.util.*;
public class Explanation_27 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(4, 3)));
    }

    // 반복문을 활용해 하나하나 더한 풀이
    // public static long[] solution(int x, int n) {
    //     // x를 n번 더한 값을 차례대로 저장하기 위한 배열
    //     long[] answer = new long[n];
    //     // x를 n번 더한 값을 저장하기 위해 선언한 변수로 초기값 0으로 초기화
    //     long sum = 0;
    //     // 반복문 배열 첫번째 부터 마지막 인덱스까지 차례대로 값을 넣기 위한 조건식
    //     // i = 0; i < n; i++ ex) i는 0; i가 n보다 작을 때 반복; 반복할 때마다 1를 하나씩 더하기
    //     for(int i = 0; i < n; i++){
    //         // sum값(x를 n번 더한 값)에 x를 더한다.
    //         sum += x;
    //         // 배열 i번째에 sum값(x를 n번 더한 값)을 삽입 
    //         answer[i] = sum;
    //     }
    //     return answer;
    // }
    
    // 마지막에 들어갈 값을 구하고 반복문을 활용해 하나하나 빼서 풀이
    public static long[] solution(long x, int n) {
        // x를 n번 더한 값을 차례대로 저장하기 위한 배열
        long[] answer = new long[n];
        // x를 n번 더한 값을 저장하는 변수
        long sum = x * n;
        // 반복문 배열 끝 마지막 인덱스부터 차례대로 값을 넣기 위한 조건식
        // i = n-1; n >= 0 ex) i는 2-1; n이 0보다 크거나 같을 때 반복; 반복할 때마다 i를 하나씩 빼기
        for(int i = n-1; i >= 0; i--){
            // 배열 i번째에 sum값(x를 n번 더한 값)을 삽입 
            answer[i] = sum;
            // sum값(x를 n번 더한 값)에서 x를 뺀다
            sum -=x;
        }
        return answer;
    }
}