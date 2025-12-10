class Solution {
   public int solution(int[] mats, String[][] park) {
        java.util.Arrays.sort(mats);
        for (int i = 0; i < mats.length / 2; i++) {
            int temp = mats[i];
            mats[i] = mats[mats.length - 1 - i];
            mats[mats.length - 1 - i] = temp;
        }

        int R = park.length;
        int C = park[0].length;

        for (int k : mats) {
            if (canPlace(k, park, R, C)) {
                return k;
            }
        }

        return -1;
    }

    private boolean canPlace(int k, String[][] park, int R, int C) {
        for (int i = 0; i + k <= R; i++) {
            for (int j = 0; j + k <= C; j++) {
                if (isEmptySquare(i, j, k, park)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean isEmptySquare(int x, int y, int k, String[][] park) {
        for (int i = x; i < x + k; i++) {
            for (int j = y; j < y + k; j++) {
                if (!park[i][j].equals("-1")) {
                    return false;
                }
            }
        }
        return true;
    }
}