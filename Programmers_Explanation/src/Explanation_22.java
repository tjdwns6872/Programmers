/*
다음 큰 숫자
*/
public class Explanation_22 {

    public static void main(String[] args) {
        System.out.println(solution(78));
    }

    public static int solution(int n) {
        //시간초과...
        String num = Integer.toBinaryString(n);
        long x = num.chars().filter(c -> c == '1').count();
        int num1 = n;
        while (true) {
            String temp = Integer.toBinaryString(num1);
            if(num1 > n && x == temp.chars().filter(c -> c == '1').count()){
                break;
            }
            num1++;
        }
        return num1;
    }
}
