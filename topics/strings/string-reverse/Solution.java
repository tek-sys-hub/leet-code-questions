public class Solution {
    public static void main(String[] args) {

        char[] s = {'h','e','l','l','o'};
        reverseString(s);
        System.out.println(s);


    }
    public static void reverseString(char[] s) {

        char[] temp = new char[s.length];
        int n = s.length - 1;
        for (int i = 0; i < s.length; i++) {
            temp[i] = s[i];
        }
        for (int i = 0; i < s.length; i++){
            s[i] = temp[n];
            n--;
        }

        System.out.println(s);

    }
}