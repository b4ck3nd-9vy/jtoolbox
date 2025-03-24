package com.example.jtoolbox.commons;

import static org.junit.jupiter.api.Assertions.*;

import java.math.BigDecimal;
import org.junit.jupiter.api.Test;

class NumberUtilsTest {

  @Test
  void testFormatDouble() {
    assertEquals(3.33, NumberUtils.formatDouble(3.333));
    assertEquals(3.36, NumberUtils.formatDouble(3.356));
    assertEquals(3.30, NumberUtils.formatDouble(3.3));
    assertEquals(3.00, NumberUtils.formatDouble(3));
  }

  @Test
  void testFormatDoubleGermanAsString() {
    assertEquals("3,33", NumberUtils.formatDoubleGermanAsString(new BigDecimal("3.33")));
    assertEquals("3,36", NumberUtils.formatDoubleGermanAsString(new BigDecimal("3.356")));
    assertEquals("3,30", NumberUtils.formatDoubleGermanAsString(new BigDecimal("3.3")));
    assertEquals("3,00", NumberUtils.formatDoubleGermanAsString(new BigDecimal("3")));
  }

  @Test
  void testAsBigDecimal() {
    assertEquals(new BigDecimal("3.33"), NumberUtils.asBigDecimal("3.333", 2));
    assertEquals(new BigDecimal("3.36"), NumberUtils.asBigDecimal("3.356", 2));
    assertEquals(new BigDecimal("3.30"), NumberUtils.asBigDecimal("3.3", 2));
    assertEquals(new BigDecimal("3.00"), NumberUtils.asBigDecimal("3", 2));
  }

}