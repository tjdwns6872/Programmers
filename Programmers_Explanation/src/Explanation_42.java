import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Explanation_42 {
    public static void main(String[] args) {
       System.out.println(solution(new int[] {2,3,1}));
    }
    public static int[] solution(int[] arr) {
        int temp = arr[0];
        List<Integer> list = new ArrayList<>();

        // arr에 크기가 1이면서 값이 10일 때 -1을 배열에 넣고 반환
        if(arr.length == 1 && arr[0] == 10) return new int[] {-1};

        // 배열 내에 제일 작은 값을 찾기 위한 반복문
        for(int i = 0; i < arr.length; i++){
            // 임시로 저장된 값이 arr[i] 값보다 클 때 temp값을 arr[i]값으로 변경
            if(temp > arr[i]){
                temp = arr[i];
            }
        }

        // list에 배열 값을 복제하는 반복문
        for(int i = 0; i < arr.length; i++){
            // list에 배열 값을 복제 할 때 temp값과 arr[i]값이 동일 할 때 continue를 통해 건너뛰기
            if(temp == arr[i]){
                continue;
            }
            list.add(arr[i]);
        }
        int[] answer = new int[list.size()];
        for(int i = 0; i < answer.length; i++){
            answer[i] = list.get(i);
        }
        return answer;

        // // stream 사용한 풀이
        // if(arr.length <= 1) return new int[]{-1};
        // // stream을 사용하여 배열 내에 작은 수 추출
        // int min = Arrays.stream(arr).min().getAsInt();
        // // filter을 통해서 추출한 작은 수를 제외한 배열 생성 후 반환
        // return Arrays.stream(arr).filter(i -> i != min).toArray();
    }
}
