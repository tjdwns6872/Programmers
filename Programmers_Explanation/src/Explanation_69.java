import java.util.*;

public class Explanation_69 {
    public static void main(String[] args) {
        solution(new int[]{1, 2, 3, 2, 3});
    }   
    public static int[] solution(int[] prices) {
        // 주식 가격을 1초 단위로 변화를 체크하므로 가격의 배열의 크기고 동일하게 셋팅
        int[] answer = new int[prices.length];
        // 인덱스를 저장하는 스택(가격이 떨어지지 않은 인덱스를 추적)
        Stack<Integer> stack = new Stack<>();

        // i는 현재 초, prices[i]는 현재 시점의 가격
        for(int i = 0; i < prices.length; i++){
            // 스택이 비어있지 않고, 현재 가격과 스택에 저장된 인덱스의 주식 가격을 비교
            while(!stack.isEmpty() && prices[i] < prices[stack.peek()]){
                // 가격을 떨어졌을 경우
                // peek으로 가장 최근에 추가된 인덱스로 주식가격을 추출
                // 현재 시점과 차이를 계산
                answer[stack.peek()] = i - stack.peek();
                // 계산이 끝난 시점으로 스택에서 인덱스 제거
                stack.pop();
            }
            // 현재 시점의 시간을 스택에 추가
            stack.push(i);
        }
        // 스택에 남아있는 인덱스 처리
        while (!stack.isEmpty()){
            // 마지막까지 가격이 떨어지지 않았을 경우
            // 남아있는 시간을 계산하여 삽입
            answer[stack.peek()] = prices.length - stack.peek() - 1;
            // 계산이 끝난 인덱스 값 제거
            stack.pop();
        }
        return answer;
    }
}
