package src;

import java.util.Arrays;

public class AnagramCheck {
    public static void main(String[] args) {
        System.out.println(checkAnagram("silent","listen"));

    }
    public static boolean checkAnagram(String s1, String s2){
        if(s1.length()!=s2.length()){
            return false;
        }else {
            char[]a1=s1.toLowerCase().toCharArray();
            char[]a2=s2.toLowerCase().toCharArray();
            Arrays.sort(a1);
            Arrays.sort(a2);
            return Arrays.equals(a1,a2);
        }

    }
}
