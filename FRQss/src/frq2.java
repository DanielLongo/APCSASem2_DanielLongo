import java.util.ArrayList;

public class frq2 {
    public String decodeString(ArrayList<StringParts> parts) {
        String out = new String ( );
        int a;
        int b;
        for StringParts x:parts {
            a = x.getStart ( );
            b = x.getEnd ( );
            x += masterString.substring (a, b + 1);
        }
        return out;
    }

    public ArrayList<StringParts> encodeString(String x) {
        int a;
        int b;
        ArrayList<StringParts> out = new ArrayList<StringParts> ( );
        for (int i = 0; i < x.length ( ); i++) {
            if (i == x.length ( ) - 1)
                out.add (new StringParts (a, b));
            return out;
            if (masterString.indexOf (x.charAt (i)) == masterString.indexOf (x.charAt (i + 1)) + 1) {
                b = i + 1;
                continue;
            }
            out.add (new StringParts (a, b));
            a = i;
        }
        return out;
    }
}
