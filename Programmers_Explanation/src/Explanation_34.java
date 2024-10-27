/*
두 정수 사이의 합
*/
import java.util.*;

public class Explanation_34 {

    public static void main(String[] args) {
        System.out.println(solution(0, 9));
    }

    // public static long solution(int a, int b) {
    //     long answer = 0;
    //     if(a==b) answer = a;
    //     else{
    //         int max = a>b ? a:b;
    //         int min = a<b ? a:b;
    //         for(int i = min; i<=max; i++){
    //             answer+=i;
    //         }
    //     }
    //     return answer;
    // }

    //등차수열 합 공식
    public static long solution(int a, int b) {
        //Math를 통해 a는 최솟값, b는 최댓값
        return sumAtoB(Math.min(a, b), Math.max(b, a));
    }

    private static long sumAtoB(long a, long b) {
        return (b - a + 1) * (a + b) / 2;
    }
}
