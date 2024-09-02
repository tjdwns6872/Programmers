import java.util.Scanner;

/**
 * Explanation_12
 */
public class Explanation_12 {

    public int solution(int[] array, int n) {
        int answer = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i] == n){answer++;}
        }
        return answer;
    }
}