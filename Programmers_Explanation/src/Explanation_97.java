import java.util.*;

public class Explanation_97 {
    public static void main(String[] args) {
        solution(new int[]{70, 80, 50}, 100);
    }
    public static int solution(int[] people, int limit) {
        int answer = 0;

        // 가장 가벼운 사람 인덱스 값
        int left = 0;
        // 가장 무거운 사람 인덱스 값
        int right = people.length-1;

        Arrays.sort(people);

        // 가벼운 사람 인덱스 값이 무서운 사람 인덱스 값보다 작거나 같은 때 진행
        // 인덱스 값이 겹치거나 역전되는 일을 방지하기 위한 조건
        while (left <= right) {
            // 가벼운 사람과 무거운 사람의 무게의 합이 무게 제한보다 작거나 같을 때
            if(people[left] + people[right] <= limit){
                // 두 사람 전부 태울 수 있는 경우
                // 가벼운 사람의 인덱스 값 ++
                left++;
            }
            // 무거운 사람은 if문에 조건과 상관 없이 무조건 처리됨
            right--;
            // 보트 추가
            answer++;
        }
        return answer;
    }
}
