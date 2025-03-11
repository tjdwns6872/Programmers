import java.util.Arrays;

public class Explanation_45 {
    public static void main(String[] args) {
        solution(new int[]{1, 3, 5}, 1, 2);
    }
    // 반복문을 통한 배열 자르기
    public static int[] solution(int[] numbers, int num1, int num2) {
        // num1~num2 인덱스까지 잘라야 하므로 num2-num1을 빼고 거기에 +1을 해줌 
        // -> 배열을 0부터 시작하기 때문
        int[] answer = new int[(num2-num1)+1];
        for(int i = 0; i < answer.length; i++){
            // 반복문을 통해 i번째 인덱스에 numbers 배열에서 i+num1 인덱스에 존재하는 값 삽입
            // ex) answer[0] = numbers[0+1] => answer[0] = numbers[1]
            answer[i] = numbers[i+num1];
        }
        // 배열 리턴
        return answer;
        
        // Arrays 클래스를 사용한 방법
        // 카피할 배열과 카피 범위를 지정해서 활용
        // return Arrays.copyOfRange(numbers, num1, num2 + 1);
    }
}
