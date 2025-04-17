import java.util.*;

public class Explanation_103 {
    public static void main(String[] args) {
        solution(new int[]{7,9,1,1,4});
    }
    public static int solution(int[] elements) {
        // 배열의 길이 저장
        int n = elements.length;

        // 원형 배열을 처리하기 위해 전달 받은 배열을 2배로 확장하기 위한 배열 생성
        int[] doubleArr = new int[2 * n];
        
        // 배열 확장
        for(int i = 0; i < n; i++){
            doubleArr[i] = elements[i];
            doubleArr[i + n] = elements[i];
        }
        
        // 확장된 배열을 기준으로 누적 합 배열 생성
        int[] sumArr = new int[2 * n + 1];
        // 누적 합 배열 생성을 위한 반복문
        for(int i = 0; i < 2 * n; i++){
            sumArr[i+1] = sumArr[i] + doubleArr[i];
        }
        System.out.println(Arrays.toString(sumArr));

        // Set 선언 => Set은 중복 값이 삽입되지 않기 때문
        Set<Integer> set = new HashSet<>();

        // 구간 합을 구한 후 Set에 저장
        for(int i = 1; i <= n; i++){
            for(int j = 0; j < n; j++){
                int sum = sumArr[j + i] - sumArr[j];
                set.add(sum);
            }
        }

        // Set사이즈 리턴
        return set.size();
    }
}
