import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Explanation_44 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 2, 3, 4, 5}));
    }

    // 반복문을 통한 풀이
    public static int[] solution(int[] num_list) {
        // 전달 받은 배열을 단순히 역순으로 출력하는 것이기 때문에 전달 받은 배열과 같은 크기의 배열 선언
        int[] answer = new int[num_list.length];
        for(int i = 0; i < num_list.length; i++){
            // 선언한 배열 i번째에 (num_list.length-1)-i 인덱스에 있는 값을 삽입
            // ex -> [0] = (5-1)-0 => [0] = [4]
            answer[i] = num_list[(num_list.length-1)-i];
        }
        return answer;

        //리스트를 사용한 풀이
        // 전달 받은 배열을 stream을 통해 list타입으로 변환
        // List<Integer> list = Arrays.stream(num_list).boxed().collect(Collectors.toList());
        // // reverse를 통해 리스트 순서를 반전 시킴
        // Collections.reverse(list);
        // // list를 배열로 전환
        // return list.stream().mapToInt(Integer::intValue).toArray();
        
    }
}
