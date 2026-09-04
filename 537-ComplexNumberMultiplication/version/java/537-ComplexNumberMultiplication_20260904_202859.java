// Last updated: 9/4/2026, 8:28:59 PM
1class Solution {
2    public String complexNumberMultiply(String num1, String num2) {
3        int p1 = num1.indexOf('+');
4        int p2 = num2.indexOf('+');
5        int a = Integer.parseInt(num1.substring(0, p1));
6        int b = Integer.parseInt(num1.substring(p1 + 1, num1.length() - 1));
7        int c = Integer.parseInt(num2.substring(0, p2));
8        int d = Integer.parseInt(num2.substring(p2 + 1, num2.length() - 1));
9        int real = a * c - b * d;
10        int imaginary = a * d + b * c;
11        return real + "+" + imaginary + "i";
12    }
13}