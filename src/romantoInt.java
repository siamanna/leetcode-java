import java.util.HashMap;
import java.util.Map;

public class romantoInt {
    public static int romanToInt(String s) {

        int finalnum = 0;

        Map<Character,Integer> romantointmap = new HashMap<>();
        romantointmap.put('I',1);
        romantointmap.put('V',5);
        romantointmap.put('X',10);
        romantointmap.put('L',50);
        romantointmap.put('C',100);
        romantointmap.put('D',500);
        romantointmap.put('M',1000);

        for (int i = 0; i < s.length() - 1; i++) {

            if (romantointmap.get(s.charAt(i)) < romantointmap.get(s.charAt(i+1))) {
                finalnum += romantointmap.get(s.charAt(i+1)) - romantointmap.get(s.charAt(i+1));
            } else {
                finalnum += romantointmap.get(s.charAt(i));
            }

        }

        return finalnum;


    }

    public static void main(String args[]) {
        String test = "MCMXCIV";
        int answer = romanToInt(test);
        System.out.println(test + ": " + answer);
    }
}
