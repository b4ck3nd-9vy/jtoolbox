package com.example.jtoolbox.commons;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class StringUtilsTest {

  @Test
  void testReverse() {
    assertEquals("olleH", StringUtils.reverse("Hello"));
  }

}