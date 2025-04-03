import java.util.*;
public class Explanation_91 {
    public static void main(String[] args) {
        solution(new int[]{1,3,2,5,4}, 10);
    }
    public static int solution(int[] d, int budget) {
        int answer = 0;
        // sort를 통해 입력받은 배열 값을 오름차순으로 정렬
        // 정렬을 해야 최대로 지원할 수 있는 부서의 수를 알 수 있기 때문
        Arrays.sort(d);
        // 정렬한 배열에서 값을 하나 씩 추출해서 budget에서 빼는 방식으로 풀이
        for(int i = 0; i < d.length; i++){
            // budget에서 배열에서 추출한 값을 뺄 수 있는지 확인
            if(budget >= d[i]){
                budget -= d[i];
                answer++;
            }
        }
        return answer;
    }
}
