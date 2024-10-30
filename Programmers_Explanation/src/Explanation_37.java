/*
서울에서 김서방 찾기
*/
import java.util.*;

public class Explanation_37 {

    public static void main(String[] args) {
        String[] seoul = {"Jane", "Kim"};
        System.out.println(solution(seoul));
    }

    public static String solution(String[] seoul) {
        StringBuilder sBuilder = new StringBuilder();
        sBuilder.append("김서방은 ");
        for(int i = 0; i < seoul.length; i++){
            if(seoul[i].equals("Kim")) sBuilder.append(i);
        }
        return sBuilder.append("에 있다").toString();
    }
}
