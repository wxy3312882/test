package com.test;

class Test {
    public String handle(String s) {

        if (s == null || s.length() == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        int a = 1;
        char c = s.charAt(0);
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                a++;
                if (a == 3) {
                    if (i + 1 < s.length()) {
                        a = 1;
                        c = s.charAt(i + 1);
                        i++;
                    } else {
                        break;
                    }
                }
            } else {
                while (a > 0) {
                    sb.append(c);
                    a--;
                }
                a = 1;
                c = s.charAt(i);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String s = "aabcccbbad";
        String ss = new Test().handle(s);
        System.out.println(ss);
    }
}
