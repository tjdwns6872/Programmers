/*
자리수 더하기
*/
import java.util.*;
public class Explanation_29 {

    public static void main(String[] args) {
        System.out.println(solution(123));
    }
    // 아스키 코드를 활용한 풀이
    // public static int solution(int n) {
    //     // 더한 수를 저장할 변수 선언 및 0으로 초기화
    //     int answer = 0;
    //     // 넘어온 수를 문자열로 변환 후 toCharArray를 통해 char배열로 변환
    //     char[] nums = Integer.toString(n).toCharArray();
    //     // 반복문 i는 0; i가 nums배열의 길이보다 작을 때 실행, 실행 후 i에 1더하기
    //     for(int i = 0; i < nums.length; i++){
    //         // 배열에 저장된 문자를 형변환을 통해 숫자로 변환(문자 -> 숫자로 변환 시 아스키 코드로 변환되어 -48를 추가 입력)후 변수에 저장
    //         answer += (int) nums[i]-48;
    //     }
    //     // 더한 수를 리턴
    //     return answer;
    // }

    // 나머지 값을 통해 자리수를 구해 더하는 풀이
    public static int solution(int n) {
        // 더한 수를 저장할 변수 선언 및 0으로 초기화
        int answer = 0;
        // 반복문 n이 0이 아닐 때 실행
        while (n != 0) {
            // n나누기 10에 나머지를 더한다 ex) 123/10= 12.3 -> 3 나머지를 구했으므로 3
            answer += n % 10;
            // n에서 10을 나눈다. ex) 123/10= 12.3 -> 12 몫을 구했으므로 12
            n /= 10;
        }
        // 더한 수를 리턴
        return answer;
    }
}
