class Solution {
    public int solution(int angle) {
        if (angle >= 0 && angle < 90) {
            return 1; // 예리각
        } else if (angle == 90) {
            return 2; // 직각
        } else if (angle < 180) {
            return 3; // 둔각
        } else { // angle == 180
            return 4; // 평각
        }
    }
}