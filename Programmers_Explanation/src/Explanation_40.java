import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Explanation_40 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{93, 30, 55}, new int[]{1, 30, 5})));
    }

    // 큐를 활용한 풀이
    public static int[] solution(int[] progresses, int[] speeds) {
        //큐 생성
        Queue<Integer> queue = new LinkedList<>();
        
        // 기능 진도 체크를 위한 연산
        for(int i = 0; i < progresses.length; i++){
            // 만약 진도율100%에서 현재 진행된 진도율을 뺀 값에서 작업 속도를 나누었을 때 0으로 떨어지게 되면 몫 값은 작업 시간이 됨
            if((100 - progresses[i]) % speeds[i] == 0){
                // 몫을 큐에 저장
                queue.add((100 - progresses[i]) / speeds[i]);
            }else{
                // 만약 0으로 떨어지지 않게되면 +1일
                queue.add((100 - progresses[i]) / speeds[i] + 1);
            }
        }
        
        // 카운트를 세기 위한 리스트 선언
        List<Integer> list = new ArrayList<>();

        // 큐에 값을 꺼내서 저장
        int num = queue.poll();
        // 카운트 값은 기본 1로 초기화
        int count = 1;
        // 큐가 비게 되면 반복문 정지
        while (!queue.isEmpty()) {
            // 꺼냈던 큐 값과 현재 큐에 저장된 가장 첫번 째 값과 비교
            // 만약 꺼냈던 큐 값이 크거나 같으면 뒤에 작업이 먼저 끝난 것으로 간주하여 같이 배포
            if(num >= queue.peek()){
                // 뒤에 작업 물도 같이 배포 하므로 카운트값 +1
                count++;
                // 배포가 끝난 후엔 큐에서 꺼냄.
                queue.poll();
            }else{
                // 만약 꺼냈던 큐값이 작으면 뒤에 작업은 아직 안끝난 것으로 간주하여 먼저 배포
                list.add(count);
                // 카운트는 1로 초기화
                count = 1;
                // 꺼냈던 큐 값은 배포가 완료됐으므로 다음 값으로 변경
                num = queue.poll();
            }
        }
        // 큐가 비어서 끝났을 때 마지막 기능 배포
        list.add(count);

        // list로 처리된 리턴 값을 규격에 맞추어 int[]로 변경
        int[] answer = new int[list.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}