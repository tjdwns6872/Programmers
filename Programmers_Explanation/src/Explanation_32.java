/*
정수 내림차순으로 배치하기
*/
import java.util.*;

public class Explanation_32 {

    public static void main(String[] args) {
        System.out.println(solution(12345));
    }

    //런타임 에러... 이유 -> n최대값이 커서 int형으로 처리가 안됨
    // public static long solution(long n) {
    //     int[] tempList = Stream.of(String.valueOf(n).split("")).mapToInt(Integer :: parseInt).toArray();
    //     Arrays.sort(tempList);
    //     StringBuilder num = new StringBuilder();
    //     for(int i = tempList.length-1; i >= 0; i--){
    //         num.append(tempList[i]);
    //     }
    //     return Integer.parseInt(num.toString());
    // }

    // 문자열 배열과 sort, StringBuilder를 활용한 풀이
    public static long solution(long n) {
        //전달 받은 long값을 toString을 통해 문자열로 변경 후 split("")를 통해 문자열 배열로 변경
        String[] tempList = Long.toString(n).split("");
        //오름차순으로 정렬
        Arrays.sort(tempList);
        //내림차순으로 정렬하기 위해 Builder선언(반복문을 오른쪽 끝부터 왼쪽 끝으로 선언하고 append로 값 삽입)
        StringBuilder num = new StringBuilder();
        //i는 tempList의 크기-1; i가 0보다 크거나 같을 때 실행; 실행 후 i를 하나씩 차감
        for(int i = tempList.length-1; i >= 0; i--){
            //append로 tempList[i]값 num에 삽입
            num.append(tempList[i]);
        }
        //Long.parseLong를 통해 num을 long형으로 변환
        return Long.parseLong(num.toString());

    }
}

