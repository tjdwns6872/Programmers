import java.util.*;

public class Explanation_98 {
    public static void main(String[] args) {
        solution(4, new int[]{1, 3, 2, 5, 4, 5, 2, 3});
    }
    public static int solution(int k, int[] tangerine) {
        int answer = 0;

        // 입력 받은 귤을 크기별로 갯수를 카운트 하기 위한 map 선언
        Map<Integer, Integer> map = new HashMap<>();

        // 입력 받은 귤을 크기별로 map에 저장 => <크기, 갯수>형식으로 저장
        for(int num : tangerine){
            map.put(num, map.getOrDefault(num, 0)+1);
        }

        // map에 value 값을 기준으로 내림차순으로 정렬하기 위한 List
        List<Integer> keySet = new ArrayList<>(map.keySet());

        // map의 키를 value 값으로 내림차순 정렬하는 로직
        keySet.sort((o1, o2) -> map.get(o2).compareTo(map.get(o1)));

        // 리스트에 저장된 키값을 순차적으로 순회
        for(int num : keySet){
            // 키값으로 map에 저장된 귤의 갯수를 저장
            int count = map.get(num);
            // 귤의 다른 종류의 수를 카운트
            answer++;
            // 전달 받은 판매할 귤의 갯수에서 map에서 가져온 갯수를 빼서 남은 값을 저장
            k -= count;
            // k가 0보다 작거나 같을 경우 판매할 귤의 갯수를 전부 카운팅 했으므로 break로 반복문 종료
            if(k <= 0) break;
        }

        return answer;
    }
}
