package com.example.jtoolbox.commons;

public class StringUtils {

  public static String reverse(String input) {
    return new StringBuilder(input).reverse().toString();
  }

}
