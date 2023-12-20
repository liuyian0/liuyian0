package com.liu.day01.test;

public class WhoBig {
public static void main(String[] args) {
  int arr[] = {1,2,9,90,89,68,55,766};
  int max = arr[0];
  for (int i = 1; i <= arr.length-1; i++) {
      if(arr[i]>max){
          max = arr[i];
      }
  }
        System.out.println("最大值为"+max);
}
}
