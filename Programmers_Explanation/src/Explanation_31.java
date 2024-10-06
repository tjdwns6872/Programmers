/*
자연수 뒤집어 배열로 만들기
*/
import java.util.*;

public class Explanation_31 {

    public static void main(String[] args) {
        System.out.println(solution(12345));
    }

    // 나누기를 이용한 풀이
    // 시간 복잡도 O(log n)+O(log n) = O(log n)
    // 공간 복잡도 O(log n) + O(1) = O(log n)
    // public static int[] solution(long n) {
    //     // 입력 받은 데이터의 길이(자릿수)를 계산-> String.valueOf(n)으로 받아온 n을 문자열로 변환, 변환 후 length()를 통해 길이 계산
    //     int len = String.valueOf(n).length();  // 정수 n을 문자열로 변환 길이를 계산하는 과정이기 때문에 n의 자릿수에 비례/ 자릿수는 대략 log10n + 1이므로 O(log n)의 시간이 소요
    //     // 계산한 길이를 배열 길이로 선언
    //     int[] answer = new int[len]; //배열의 크기가 n의 자릿수와 같고 자릿수는 대략 log10n + 1이므로 배열의 크기는 O(log n)
    //     // 반복문 진행 시 배열 인덱스를 계산할 변수 선언
    //     int index = 0; // 공간 복잡도 상수이기 때문에 O(1)
    //     // n이 0이 아닐 때 실행
    //     while (n != 0) { // 루프가 n이 0이 될 때까지 반복이지만 반복 마다 n/10을 하기 때문에 반복 횟수는 log10n + 1이므로 0(log n)의 시간이 소요된다.
    //         // answer[index]에 n%10을 삽입 ex) 12345/10 = 1234.5 -> 나머지를 구했으므로 answer[index]에 5를 삽입
    //         answer[index] = ((int) (n%10));
    //         // n에 n/10을 삽입 ex)12345/10 = 1234.5 -> 소수점을 버림해서 1234를 n에 삽입 
    //         n /= 10;
    //         // 인덱스 계산을 위해 반복될 때마다 1증가
    //         index++;
    //     }
    //     //answer 리턴
    //     return answer;
    // }

    // StringBuilder와 reverse를 활용한 풀이
    public static int[] solution(long n) {
        // StringBuilder로 n을 문자열로 변환 후 reverse로 문자열를 뒤집는다. 그리고 각 문자를 추출해 int로 변환 후 toArray로 배열로 리턴
        return new StringBuilder().append(n).reverse().chars().map(Character::getNumericValue).toArray();
    }
}
