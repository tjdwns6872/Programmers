public class Explanation_96 {
    public static void main(String[] args) {
        solution(4);
    }   
    // 반복문을 사용한 풀이
    public static int solution(int n) {
        int ans = 0;

        // n이 0이 될 때까지 반복
        while(n != 0){
            // n이 짝수 일 때는 순간이동을 통해 거리를 좁힐 수 있기 때문에 n/2으로 거리를 좁힌다.
            // 순간이동을 사용하면 배터리를 사용하지 않기 때문에 ans++은 하지 않는다.
            if(n%2 == 0){
                n = n/2;
            }else{
                // n이 홀수 일 때는 n을 2의 배수로 만들기 위해서 -1을 해준다.
                // 점프를 하게되면 배터리를 사용하기 때문에 ans++을 해준다.
                n -= 1;
                ans++;
            }
        }
        return ans;
    }
}
