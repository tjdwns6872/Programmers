import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;
import java.util.stream.Collectors;

/**
 * 최솟값 만들기
 */
public class Explanation_18 {

    public static void main(String[] args) {
        System.out.println(solution(new int[]{1,4,2}, new int[]{5, 4, 4}));
    }

    public static int solution(int []A, int []B) {
        // // 직접 푼 풀이
        // int answer = 0;
        // List<Integer> aList = Arrays.stream(A).boxed().collect(Collectors.toList());
        // List<Integer> bList = Arrays.stream(B).boxed().collect(Collectors.toList());
        // for(int i = 0; i < A.length; i++){
        //     answer = answer+(Collections.max(aList)*Collections.min(bList));
        //     aList.remove(aList.indexOf(Collections.max(aList)));
        //     bList.remove(bList.indexOf(Collections.min(bList)));
        // }
        // return answer;

        // 시간초과 뜬 이후 다른 사람 코드 참고하여 푼 풀이
        int answer = 0;
        PriorityQueue<Integer> Aq = new PriorityQueue<>();
        PriorityQueue<Integer> Bq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i =0; i < A.length; i++){
            Aq.offer(A[i]);
            Bq.offer(B[i]);
        }
        for(int i = 0; i < A.length; i++){
            answer += (Aq.poll()*Bq.poll());
        }
        return answer;
    }
}