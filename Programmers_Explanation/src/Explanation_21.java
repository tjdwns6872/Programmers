/*
숫자의 표현
*/
public class Explanation_21 {

    public static void main(String[] args) {
        System.out.println(solution(15));
    }

    // 직접 푼 풀이(구간 합 사용)
    // public static int solution(int n) {
    //     int num[] = numArr(n);

    //     return panelSum(num);
    // }

    // public static int[] numArr(int n){
    //     int num[] = new int[n];
    //     for(int i = 0; i < n; i++){
    //         num[i] = i+1;
    //     }
    //     return num;
    // }

    // public static int panelSum(int[] num){
    //     int count = 0;
    //     int numSum[] = new int[num.length+1];
    //     for(int i = 1; i <= num.length; i++){
    //         numSum[i] = numSum[i-1] + num[i-1];
    //     }
    //     int endPoint = 1;
    //     int startPoint = 1;
    //     int answer = num.length;
    //     while (startPoint <= num.length) {
    //         int sum = numSum[endPoint]-numSum[startPoint-1];
    //         if(sum == answer){
    //             startPoint++;
    //             count++;
    //             endPoint = startPoint;
    //         }else if(sum < answer){
    //             endPoint++;
    //         }else if(sum > answer){
    //             startPoint++;
    //             endPoint = startPoint;
    //         }
    //     }
    //     return count;
    // }

    // 제출 후 다른 사람이 푼 풀이
    public static int solution(int num) {
        int answer = 0;
        for (int i = 1; i <= num; i += 2) 
            if (num % i == 0) 
                answer++;

        return answer;
    }
}
