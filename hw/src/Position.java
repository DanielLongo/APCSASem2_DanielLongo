public class Position {
    public static Position findPos(int x, int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i][j] == x) return new Position (i,j)
            }
        }
        return null;
    }

    public static Postion[][] findS(int[][] arr) {
        Postion[][] out = new Postion[arr.length][arr[0].length];
        for (int i = 0; i < out.length; i++) {
            for (int j = 0; j < out.length; j++) {
                out[i][j] = findPos (arr[i][j] +1);
            }

        }
        return out;
    }
}
