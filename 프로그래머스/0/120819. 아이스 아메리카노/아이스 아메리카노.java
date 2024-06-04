class Solution {
    public int[] solution(int money) {
        int americanoPrice = 5500;

        int count = money / americanoPrice;

        int remainder = money % americanoPrice;

        int[] answer = new int[2];

        answer[0] = count;
        answer[1] = remainder;

        return answer;
    }
}