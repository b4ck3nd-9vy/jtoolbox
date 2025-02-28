package com.example.jtoolbox.commons;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class NumberUtils {

  public static final DecimalFormat DECIMAL_AMOUNT_FORMAT = new DecimalFormat("#.##", new DecimalFormatSymbols(Locale.ENGLISH));

  public static double formatDouble(final double value) {
    return Double.parseDouble(DECIMAL_AMOUNT_FORMAT.format(value));
  }

}
