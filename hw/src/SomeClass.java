import java.util.ArrayList;

public class SomeClass {
    public static  void main(String[] args) {
        System.out.println ("Finished" );
    }

    public ArrayList<String> sortStrings(ArrayList<String> names) {
        ArrayList<String> out = new ArrayList<String> ();
        int argmax = 0;
        for (int i = names.size(); i >= 0; i--) {
            for (int k = 0; k < i; k++) {
                if (names.get (argmax).compareTo (names.get (k)) < 0) argmax = k;
            }
            out.add (names.get(argmax));
            out.remove (argmax);

        }
        return out;
    }

    public boolean used(ArrayList<Integer> nums, int num) {
        for (int x: nums) {
            if(num == x) return true;
        }
        return false;
    }
    public ArrayList<String> shuffleArrayList(ArrayList<String> x) {
        ArrayList<Integer> used = new ArrayList<Integer> ();
        used.add(-1);
        ArrayList<String> out = new ArrayList<String> ();
        int index = -1;
        for (String name: x) {
            out.add("");
        }
        for (String name: x) {
            while (!used (used, index)) {
                index = (int) (Math.random ( ) * x.size ( ));
            }
            out.add(index, name);
        }
        return out;
    }
    public ArrayList<String> insertString(ArrayList<String> x, String neww) {
        x.add(neww);
        x = sortStrings (x);
        return x;
    }
}
