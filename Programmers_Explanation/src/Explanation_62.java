import java.util.LinkedList;
import java.util.Queue;

public class Explanation_62 {
    public static void main(String[] args) {
        solution(2, 10, new int[]{7,4,5,6});
    }
    public static int solution(int bridge_length, int weight, int[] truck_weights) {
        // 다리 위에 있는 트럭을 관리
        Queue<Integer> queue = new LinkedList<>();
        // 다리 위에 존재하는 트럭의 총 무게
        int totalWeight = 0;
        // 경과 시간을 저장
        int answer = 0;

        // 전달 받은 다리 길이 만큼 큐 초기화
        for(int i = 0; i < bridge_length; i++){
            queue.add(0);
        }

        for(int t : truck_weights){
            // 다음 트럭이 올라갈 수 있는지 확인하는 로직
            // 다리 위에 총 무게와 다음에 올라갈 트럭 무게를 더한 값이 최대 무게를 초과하는 지 확인
            while ((totalWeight + t - queue.peek()) > weight) {
                // 큐에서 값을 poll를 통해 제거하면서 다리를 건넌 트럭을 제거
                // 건넌 트럭의 무게를 뺌
                totalWeight -= queue.poll();
                // 다리의 빈 공간을 다시 0으로 초기화
                queue.add(0);
                // 시간 1초 증가
                answer++;
            }
            // 새로운 트럭이 올라가기 전에 앞에 값을 제거 하여 다리를 건넌 트럭을 제거
            totalWeight -= queue.poll();
            // 새로운 트럭의 무게를 totalWeight에 더하기
            totalWeight += t;
            // 추가된 트럭의 무게를 큐에 추가
            queue.add(t);
            // 시간 증가
            answer++;
        }
        // 마지막 트럭이 다리에 올라간 후에도 다리를 완전히 건너야 하므로 bridge_length만큼 시간 추가
        return answer+bridge_length;
    }
}
