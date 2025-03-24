package com.example.jtoolbox.commons;

import com.google.common.base.Joiner;

public class StringUtils {

  public static String reverse(String input) {
    return new StringBuilder(input).reverse().toString();
  }

  public static String join(String[] array, String separator) {
    //org.apache.commons.lang3.StringUtils.join(array, separator);
    Joiner joiner = Joiner.on(separator);
    return joiner.join(array);
  }

}
