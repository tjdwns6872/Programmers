import java.util.*;

public class Explanation_101 {
    public static void main(String[] args) {
        solution(2, new String[]{"hello", "one", "even", "never", "now", "world", "draw"});
    }
    public static int[] solution(int n, String[] words) {
        Set<String> set = new HashSet<>();

        // 단어의 끝문장을 임시로 저장하기 위한 변수
        char last = 0;
        // 몇번째 배열에 단어인지 체크하기 위한 변수
        // 탈락자 번호와 차례를 알기 위해 필요한 변수
        int index = 0;

        // 입력 받은 배열 순회
        for(int i = 0; i < words.length; i++){
            String str = words[i];

            // 끝말잇기 룰 : 중복 확인
            if(set.contains(str)){
                index = i + 1;
                break;
            }

            // 첫 번째 단어 초기화
            if(i == 0){
                // Set에 문자열 저장
                set.add(str);
                // 마지막 문장의 끝 단어 저장
                last = str.charAt(str.length() - 1);
                continue;
            }

            // 끝말잇기 룰 : 첫 문장 체크
            if(str.charAt(0) != last){
                index = i + 1;
                break;
            }
            // Set에 문자열 저장
            set.add(str);
            // 마지막 문장의 끝 단어 저장
            last = str.charAt(str.length() - 1);
        }

        return result(index, n);
    }
    static int[] result(int index, int n){
        if(index == 0){
            return new int[]{0, 0};
        }

        // %연산 : 사람 번호의 순환을 처리
        // /연산 : 차례의 증가를 계산
        return new int[]{(index - 1) % n + 1, (index - 1) / n + 1};
    }
}
