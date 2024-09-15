import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * 최댓값과 최솟값
 */
public class Explanation_16 {

    public static void main(String[] args) {
        System.out.println(solution("1 2 3 4"));
    }

    public static String solution(String s) {
        // 직접 푼 풀이
        String[] number = s.split(" ");
        String max = number[0];
        String min = number[0];
        for(String num : number){
            if(Integer.parseInt(num) > Integer.parseInt(max)){
                max = num;
            }
            if(Integer.parseInt(num) < Integer.parseInt(min)){
                min = num;
            }
        }
        return min+" "+max;
        /*
        다른 사람이 푼 풀이
        String[] arrStr = str.split(" ");
        int[] arrInt = new int[arrStr.length];
        int i=0;
        for(String part : arrStr){
          arrInt[i] = Integer.parseInt(part);
          i++;
        }

        StringBuffer sb = new StringBuffer();
        sb.append(Arrays.stream(arrInt).min().getAsInt());
        sb.append(" ");
        sb.append(Arrays.stream(arrInt).max().getAsInt());

        return sb.toString();
        */
    }
}