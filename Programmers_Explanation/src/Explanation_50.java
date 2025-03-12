import java.util.ArrayList;
import java.util.List;

public class Explanation_50 {
    public static void main(String[] args) {
        solution(new int[]{4,4,4,3,3});
    }
    public static int[] solution(int []arr) {
        // ArraysList를 활용한 풀이
        List<Integer> list = new ArrayList<>();
        // 임시로 보관할 값 삽입 -> 연속되는지 다음 인덱스 값과 비교를 위해
        int temp = -1;
        for(int i = 0; i < arr.length; i++){
            // 임시로 저장한 값과 현재 인덱스의 값과 비교
            // 같다면 연속된다고 판단하여 continue를 통해 다음 인덱스 탐색
            if(temp == arr[i]) continue;
            // 연속 되지 않는다면 temp에 현재 인덱스 값을 임시 값으로 셋팅
            // list에 현재 인덱스 값 저장
            else{
                temp = arr[i];
                list.add(temp);
            }
        }
        // stream을 통해 list -> int[]로 변환
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
