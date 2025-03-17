import java.util.*;

public class Explanation_51 {
    public static void main(String[] args) {
        solution(new int[]{1, 1, 9, 1, 1, 1}, 0);
    }
    // 큐 활용 -> 큐 FIFO(대기열)
    public static int solution(int[] priorities, int location) {
        int answer = 1;
        // 큐 선언 -> 실행 대기 큐의 프로세스 데이터(값, 인덱스)를 저장하기 위한 큐
        Queue<Process> processes = new LinkedList<>();
        // 우선순위 큐 선언 -> 우선순위가 높은 순으로 실행하기 위한 큐
        PriorityQueue<Integer> mainPriority = new PriorityQueue<>(Collections.reverseOrder());

        // 반복문을 통해 각각의 큐에 데이터 삽입
        for(int i = 0; i < priorities.length; i++){
            mainPriority.add(priorities[i]);
            processes.add(new Process(priorities[i], i));
        }

        // 큐 탐색
        while (true) {
            // 실행 대기 큐의 프로세스를 저장한 큐에서 poll를 통해 추출
            Process ready = processes.poll();
            // 우선순위 큐에서 우선순위가 가장 높은 프로세스를 poll로 추출
            int max = mainPriority.poll();
            // 우선순위가 높은 프로세스와 실행대기큐에서 추출한 프로세스가 같을 때
            if(max == ready.priorities){
                // 그 다음 매개변수로 받은 위치와 비교
                // 같으면 break로 탐색 종료
                if(location == ready.index) break;
                // 다르면 다음 프로세스 탐색
                else answer++;
            // 우선순위가 높은 프로세스와 실행대기큐에서 추출한 프로세스가 다를 때
            }else{
                // 추출한 프로세스 add를 통해 다시 삽입
                mainPriority.add(max);
                processes.add(ready);
            }
        }
        return answer;
    }

    static class Process {
        // 데이터 
        int priorities;
        // 위치
        int index;
        public Process(int priorities, int index){
            this.priorities = priorities;
            this.index = index;
        }
    }
}
