public class Explanation_100 {
    
    public static void main(String[] args) {
        solution(new int[]{2,6,8,14});
    }

    // 최대공약수, 최대공배수는 유클리드 호제법 활용
    // 최대공약수는 GCD(a, b) => GCD(b, a % b) 반복
    // 최소공배수는 LCM(a * b) / GCD(a, b)로 계산
    public static int solution(int[] arr) {
        int answer = arr[0]; // 초기화

        for(int i : arr){
            answer = lcm(answer, i);
        }

        return answer;
    }
    // 최대공약수 메서드
    static int gcd(int a, int b){
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    // 최소공배수 메서드
    static int lcm(int a, int b){
        return (a * b) / gcd(a, b);
    }
}
