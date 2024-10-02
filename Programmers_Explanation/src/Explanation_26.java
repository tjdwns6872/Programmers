/*
평균 값 구하기
*/
import java.util.*;
public class Explanation_26 {

    public static void main(String[] args) {
        int arr[] = {1,2,3,4};
        System.out.println(solution(arr));
    }

    // 배열에 있는 모든 값을 더하고 마지막에 배열에 길이만큼 나눠서 리턴
    // public static double solution(int[] arr) {
    //     double answer = 0;
    //     for(int i = 0; i < arr.length; i++){
    //         answer += arr[i];
    //     }
    //     return answer/arr.length;
    // }

    // stream을 사용한 풀이
    public static double solution(int[] arr) {
        return Arrays.stream(arr).average().getAsDouble();
    }
}
