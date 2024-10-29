/*
하샤드 수
*/
import java.util.*;

public class Explanation_35 {

    public static void main(String[] args) {
        System.out.println(solution(881));
    }

    // 전달 받은 수를 문자열로 변경 후 계산하는 공식
    public static boolean solution(int a) {
        // 문자열로 ㅂ녀경
        String aStr = Integer.toString(a);
        // 자릿수의 합을 저장할 변수 선언
        int sum = 0;
        // 문자열의 자릿수 만큼 반복하여 합을 구하는 공식
        for(int i = 0; i < aStr.length(); i++){
            sum += aStr.charAt(i)-48;
        }
        //전달받은 수와 자릿수의 합을 나누어 0으로 나누어떨어지는 확인
        return a%sum==0;
    }
}
