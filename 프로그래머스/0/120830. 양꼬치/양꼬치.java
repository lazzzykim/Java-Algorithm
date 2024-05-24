class Solution {
    public int solution(int n, int k) {

        int lamb = 12000 * n;
        int drink = 2000 * k;
        int discount = (n/10) * 2000;


        int totalPrice = lamb + drink;

        return totalPrice - discount;
    }
}