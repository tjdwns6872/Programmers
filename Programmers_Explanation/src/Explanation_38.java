/*
콜라츠 추측
*/
import java.util.*;

public class Explanation_38 {

    public static void main(String[] args) {
        System.out.println(solution(626331));
    }

    // 기본적인 반복+조건으로 푼 풀이
    public static int solution(long num) {
        // int answer = 0;
        // while (num != 1) {
        //     if(num%2 == 0){
        //         num /= 2;
        //     }else {
        //         num = (num*3)+1;
        //     }
        //     answer++;
        //     if(answer >= 500){
        //         answer = -1;
        //         break;
        //     }
        // }
        // return answer;

        // 삼항식 풀이
        long n = (long)num;
        for(int i=0; i<500; i++){
            if(n==1) return i; 
        n = (n%2==0) ? n/2 : n*3+1;
        }

        return -1;
    }
}
