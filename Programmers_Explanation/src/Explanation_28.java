/*
짝수와 홀수
*/
import java.util.*;
public class Explanation_28 {

    public static void main(String[] args) {
        System.out.println(solution(3));
    }
    public static String solution(int num) {
        // if문을 줄이기 위해 리턴값을 Odd로 초기화
        String answer = "Odd";
        // num%2==0 -> num값을 2로 나누어떨어졌을 때(짝수) 실행
        if(num%2==0){
            // num값이 짝수일 경우 Even삽입
            answer="Even";
        }
        // answer값 리턴
        return answer;
    }
}
