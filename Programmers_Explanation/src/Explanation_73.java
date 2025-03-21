import java.util.*;

public class Explanation_73 {
    public static void main(String[] args) {
        solution("Zbcdefg");
    }
    public static String solution(String s) {
        char[] ch = s.toCharArray();
        Arrays.sort(ch);
        StringBuilder sb = new StringBuilder();
        for(char c : ch){
            sb.append(c);
        }
        sb.reverse();
        return sb.toString();
    }
}
