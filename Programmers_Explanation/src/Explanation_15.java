import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 이중우선순위큐
 */
public class Explanation_15 {

    public static void main(String[] args) {
        String[] operations = {"I -45", "I 653", "D 1", "I -642", "I 45", "I 97", "D 1", "D -1", "I 333"};
        System.out.println(solution(operations)[0]);
        System.out.println(solution(operations)[1]);
    }

    public static int[] solution(String[] operations) {
        List<Integer> nums = new ArrayList<>();
        for(String num : operations){
            if(num.contains("I")){
                nums.add(Integer.parseInt(num.substring(2, num.length())));
            }else{
                if(nums.size() > 0){
                    if(num.contains("-1")){
                        nums.remove(nums.indexOf(Collections.min(nums)));
                    }else{
                        nums.remove(nums.indexOf(Collections.max(nums)));
                    }
                }
            }
        }
        if(nums.size() > 0){
            return new int[]{Collections.max(nums), Collections.min(nums)};
        }else{
            return new int[]{0,0};
        }
    }
}