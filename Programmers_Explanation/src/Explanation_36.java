/*
나누어 떨어지는 숫자 배열
*/
import java.util.*;

public class Explanation_36 {

    public static void main(String[] args) {
        int[] arr = {5, 9, 7, 10};
        System.out.println(solution(arr, 5));
    }

    // list와 stream을 사용한 풀이
    public static int[] solution(int[] arr, int divisor) {
        // // 나눠떨어지는 값의 수를 모르기 때문에 길이가 고정된 배열이 아닌 리스트로 진행
        // List<Integer> list = new ArrayList<>();
        // // 반복문을 통해 배열의 존재하는 숫자 하나씩 확인
        // for(int item : arr){
        //     // 숫자가 나누어떨어지면 리스트에 추가
        //     if(item % divisor == 0){
        //         list.add(item);
        //     }
        // }
        // // 반복문이 종료되고 리스트의 길이가 0이면 -1 삽입
        // if(list.size() == 0) list.add(-1);
        // // 리스트 정렬
        // list.sort(null);
        // // 리스트를 스트림을 통해 배열로 변환
        // return list.stream().mapToInt(x -> x).toArray();

        // 람다식 풀이
        return Arrays.stream(arr).filter(factor -> factor % divisor == 0).toArray();
    }
}
