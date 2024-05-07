package level_0;
//두 수의 나눗셈
public class division {
    public static void main(String[] args) {
    }
    public int solution(int num1, int num2) {
        int answer = 0;
        double div = (double) num1 / num2 * 1000;
        answer = (int) div;
        return answer;
    }
}
