package problem;

class Solution35 {
    public long solution(int price, int money, int count) {
        long answer = 0;
        long total = 0;

        for (int i = 1; i <= count; i++) {
            total += price * i;
        }

        if (money < total) {
            answer = total - money;
        } else {
            answer = 0;
        }

        return answer;
    }
}