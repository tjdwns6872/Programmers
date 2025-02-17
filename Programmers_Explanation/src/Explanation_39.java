import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Explanation_39 {

    public static void main(String[] args) {
        System.out.println(solution(new String[]{"leo", "kiki", "eden"}, new String[]{"eden", "kiki"}));
    }

    public static String solution(String[] participant, String[] completion) {
        String answer = "";
        // 데이터를 저장할 해시 생성
        Map<String, Integer> map = new HashMap<>();
        // 해시에 참가자 저장 {참가자 이름 : 참가자 수} 
        // => 동명이인을 판단하기 위해 getOrDefault를 사용하여 해당 참가자가 있을 경우 +1 없을 경우 디폴트 0에서 +1
        for(String player : participant){
            map.put(player, map.getOrDefault(player, 0)+1);
        }

        // 완주한 참가자 데이터 저장
        // => get으로 참가자를 불러와 참가자 수를 -1
        for(String player : completion){
            map.put(player, map.get(player) - 1);
        }

        // Map 안에 있는 데이터를 차례대로 불러오기 위해 Iterator 인터페이스 사용
        Iterator<Map.Entry<String, Integer>> iter = map.entrySet().iterator();

        // hasNext를 통해 다음 요소가 있는지 확인
        while (iter.hasNext()) {
            // next를 통해 다음 데이터를 저장
            Map.Entry<String, Integer> entry = iter.next();
            // 가져온 데이터에 벨류, 즉 참가자 수가 0이 아니면 완주하지 못한 걸로 간주
            if(entry.getValue() != 0){
                // 완주 하지 못한 키 값을 변수에 저장
                answer = entry.getKey();
                // while 문 중지
                break;
            }
        }
        // 완주하지 못한 참가자 리턴
        return answer;
    }
}