import java.util.*;

public class Explanation_66 {
    public static void main(String[] args) {
        solution("hi12392");
    }
    public static int[] solution(String my_string) {
        String intStr = my_string.replaceAll("[^0-9]", "");
	    char[] ch = intStr.toCharArray();
	    int[] answer = new int[ch.length];
	    for(int i = 0; i < answer.length; i++){
	    	answer[i] = Integer.valueOf(ch[i])-48;
	    }
        Arrays.sort(answer);
        return answer;
    }
}
