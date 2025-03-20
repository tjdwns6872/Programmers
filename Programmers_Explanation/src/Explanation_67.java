import java.util.*;

public class Explanation_67 {
    public static void main(String[] args) {
        solution("Bcad");
    }
    public static String solution(String my_string) {
        char[] ch = my_string.toLowerCase().toCharArray();
	    Arrays.sort(ch);
	    //*
        StringBuilder sb = new StringBuilder();
	    for(char c : ch){
	    	sb.append(c);
	    }
	    return sb.toString();
        // 이부분
        //return new String(ch); -> 대체 가능
    }
}
