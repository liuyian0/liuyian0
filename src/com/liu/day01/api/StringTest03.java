package com.liu.day01.api;

public class StringTest03 {
public static void main(String[] args) {
  //数组转换为字符串，以及字符串的拼接）
  int[] arr = {1,2,3,4,5};
  System.out.println(arrayToString(arr));
}
  public static String arrayToString(int[] arr){
      String s = "";
      s+="[";
      for (int i = 0; i < arr.length; i++) {
          if (i==arr.length-1) {
              s+=arr[i];
          } else {
              s+=arr[i];
              s+=",";
          }
      }
      s+="]";
      return s;
  }
}
