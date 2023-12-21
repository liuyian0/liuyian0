package com.liu.day01.api;

public class StringTest04 {
public static void main(String[] args) {
    //反转字符串
  String s = "abcdefghijklmnoprstwxyz";
  System.out.println(reverse(s));
}

private static String reverse(String s) {
    String fan = "";
    for (int i = s.length()-1; i >= 0; i--) {
        fan+=s.charAt(i);
    }
	return fan;
}
}
