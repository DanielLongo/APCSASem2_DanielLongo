import java.util.ArrayList;

public class Digits {
    ArrayList<Integer> list;
    public Digits(int num) {
        list = new ArrayList<Integer> ( );
        while (num > 0) {
            list.add (num % 10);
            num = num / 10;
        }
    }
        public boolean isStricklyIncreasing() {
            int max = Integer.MIN_VALUE;
            for (int val: list) {
                if (val < max) return false;
                max = val;
            }
            return true;
        }

    }

