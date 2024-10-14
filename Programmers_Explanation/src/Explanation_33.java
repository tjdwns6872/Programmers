/*
정수 제곱근 판별
*/
import java.util.*;

public class Explanation_33 {

    public static void main(String[] args) {
        System.out.println(solution(101));
    }

    // 반복문을 통해 제곱근을 구하는 풀이
    // public static long solution(long n) {
    //     // 제곱근 함수를 통해 제곱근을 구함 
    //     long x = (long) square(n);
    //     // x가 -1일 경우 정수 제곱근이 없으므로 -1리턴
    //     if(x == -1){
    //         return x;
    //     }
    //     // x에 +1를 하고 제곱 계산 -> (x+1)^2
    //     return (x+1)*(x+1);
    // }
    // public static double square(long n){
    //     // n을 i와 나누어서 나온 값을 임시로 저장할 변수
    //     double result = 0;
    //     // 반복문에서 사용할 i값
    //     double i = 1;
    //     while (true) {
    //         // n/i를 result변수에 저장
    //         result = n/i;
    //         // result변수와 i값이 같을 때 리턴(제곱근을 구하는 문제여서)
    //         if(i == result) return result;
    //         // i가 n보다 커지거나 같으면 해당하는 정수 제곱근이 없다고 판별
    //         else if(i>=n) return -1;
    //         // i를 1씩 증가
    //         i++;
    //     }
    // }

    // Math를 통한 풀이(다른 사람 풀이 참고)
    public static long solution(long n) {
        double i = Math.sqrt(n);
    
        return Math.floor(i) == i ? (long) Math.pow(i + 1, 2) : -1;
    }
}

