import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Explanation_46 {
    public static void main(String[] args) {
        solution(new String[]{"a", "b", "c"}, new String[]{"com", "b", "d", "p", "c"});
    }
    public static int solution(String[] s1, String[] s2) {
        // 2중 반복문을 사용한 풀이
        int answer = 0;
        // s1 배열을 전부 탐색하기 위한 반복문
        for(int i = 0; i < s1.length; i++){
            // s2 배열을 전부 탐색하기 위한 반복문
            for(int j = 0; j < s2.length; j++){
                // s1[i] 문자열과 s2[j] 문자열을 비교 후 같으면 answer++
                if(s1[i].equals(s2[j])) answer++;
            }
        }
        return answer;
        // 리스트를 활용한 풀이
        // int answer = 0;
        // // s1 배열을 list로 변환
        // List<String> list = new ArrayList<>(Arrays.asList(s1));
        // // s2를 탐색하기 위한 반복문
        // for(String str : s2){
        //     // contains를 사용하여 리스트에서 str이 있는지 탐색 후 있으면 answer++
        //     if(list.contains(str)) answer++;
        // }
        // return answer;
    }
}
