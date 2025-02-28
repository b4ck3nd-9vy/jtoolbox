package com.example.jtoolbox.commons;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class NumberUtilsTest {

  @Test
  void testFormatDouble() {
    assertEquals(3.33, NumberUtils.formatDouble(3.333));
    assertEquals(3.36, NumberUtils.formatDouble(3.356));
    assertEquals(3.30, NumberUtils.formatDouble(3.3));
    assertEquals(3.00, NumberUtils.formatDouble(3));
  }

}