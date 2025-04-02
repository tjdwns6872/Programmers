public class Explanation_86 {
    public static void main(String[] args) {
        solution(3, 20, 4);
    }public static long solution(int price, int money, int count) {
        long total = 0;
        for(long i = 1; i <= count; i++){
            total += (price*i);
        }
        return money >= total ? 0 : total - money;

        // 등차수열의 합 풀이
        // return Math.max(price * (count * (count + 1) / 2) - money, 0);
    }
}
