/*
문자열 내 p와 y의 개수
*/
import java.util.*;
public class Explanation_30 {

    public static void main(String[] args) {
        System.out.println(solution("pPoooyY"));
    }

    // 문자열을 소문자로 변환 후 반복문과 조건문을 활용한 풀이
    // 시간 복잡도 O(n)*O(n) = 2O(n) -> 상수 제거해서 O(n)
    // 공간 복잡도는 O(1)
    // public static boolean solution(String s) {
    //     // 문자열을 소문자로 변환
    //     String temp = s.toLowerCase(); //문자열 변환은 모든 문자를 순회하므로 O(n)의 시간이 소요된다.
    //     // 리턴 값을 저장할 변수 선언, p나 y가 없으면 true를 출력해야 하기 때문에 초기값은 true로 선언
    //     boolean answer = true; // 변수들은 모두 고정된 크기의 메모리를 사용하므로 입력 크기와 무관, 그러므로 공간 복잡도는 O(1)
    //     // 문자열에서 p가 나온 횟수를 저장하기 위한 변수
    //     int countP = 0;
    //     // 문자열에서 y가 나온 횟수를 저장하기 위한 변수
    //     int countY = 0;
    //     // 문자열 전체를 탐색하기 위한 반복문 i는 0; i가 문자열 길이보다 작을 때 실행; 실행 후 i에 1더하기
    //     for(int i = 0; i < temp.length(); i++){ // 문자열의 모든 문자를 딱 한 번 순회 -> 반복 시간이 문자열의 길이에 비례 하므로 시간 복잡도는 O(n)
    //         // 문자열에서 i번째 문자가 p인지 비교
    //         if(temp.charAt(i) == 'p'){ // if-else는 상수 시간 O(1)이 소요
    //             // i번째 문자가 p일 때 countP가 1증가
    //             countP++;
    //         // 문자열에서 i번째 문자가 y인지 비교
    //         }else if(temp.charAt(i) == 'y'){
    //             // i번째 문자가 y일 때 countY가 1증가
    //             countY++;
    //         }
    //     }
    //     // countP와 countY가 서로 값이 다를 때
    //     if(countP != countY){ // 상수시간 O(1)소요
    //         // answer에 false 삽입
    //         answer = false;
    //     }
    //     return answer;
    // }

    // 람다식을 활용한 풀이
    public static boolean solution(String s) {
        // 문자열 대문자로 변경
        s = s.toUpperCase();

        // filter를 통해 P, Y의 갯수를 계산 후 서로 값이 같은지 비교 후 리턴
        return s.chars().filter( e -> 'P'== e).count() == s.chars().filter( e -> 'Y'== e).count();
    }
}
