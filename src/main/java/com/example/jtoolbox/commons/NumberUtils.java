package com.example.jtoolbox.commons;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class NumberUtils {

  public static final DecimalFormat DECIMAL_AMOUNT_FORMAT = new DecimalFormat("#.##", new DecimalFormatSymbols(Locale.ENGLISH));
  public static final DecimalFormat DECIMAL_AMOUNT_FORMAT_GERMAN = new DecimalFormat("#,##0.00");

  public static double formatDouble(final double value) {
    return Double.parseDouble(DECIMAL_AMOUNT_FORMAT.format(value));
  }

  public static String formatDoubleGermanAsString(final BigDecimal value) {
    return DECIMAL_AMOUNT_FORMAT_GERMAN.format(value);
  }

  public static BigDecimal asBigDecimal(final String value, final int scale) {
    return new BigDecimal(value).setScale(scale, RoundingMode.HALF_UP);
  }

}
