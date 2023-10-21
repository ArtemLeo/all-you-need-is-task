package elementary;

import java.util.Arrays;

public class Elementary_010_VarargsTypeInMethods {
    public static void main(String[] args) {
        String[] st1 = {"aaa", "bbb"};
        String[] st2 = {"ccc", "ddd"};
        String[] result = abc(st1,st2);
        System.out.println(Arrays.toString(result));
    }

    public static String[] abc(String[]... s) {
        int length= 0;
        for (String[] strings : s) {
            length += strings.length;
        }
        String[] result = new String[length];
        int count = 0;
        for (String[] strings : s) {
            for (String string : strings) {
                result[count] = string;
                count++;
            }
        }
        return result;
    }
}
