import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DateTest {

  @Test
  void nextDate_sample() {
    Date d = new Date(2021,5,27);
    assertEquals(new Date(2021,5,28), d.nextDate());
  }

  @Test
  void date_getYear() {
    Date d = new Date(2021,5,27);
    assertEquals(2021, d.getYear());
  }

  @Test
  void date_getMonth() {
    Date d = new Date(2021,5,27);
    assertEquals(5, d.getMonth());
  }

  @Test
  void date_getDay() {
    Date d = new Date(2021,5,27);
    assertEquals(27, d.getDay());
  }

  @Test()
  void date_setDate_givenNegativeDay() {
    assertThrows(IllegalArgumentException.class, () -> {
      Date d = new Date(2021,11,-1);
    });
  }

  @Test()
  void date_setDate_givenDayHigherThan31() {
    assertThrows(IllegalArgumentException.class, () -> {
      Date d = new Date(2021,11,32);
    });
  }

  @Test()
  void date_setDate_givenDayHigherThan31AndThirdMonth() {
    assertThrows(IllegalArgumentException.class, () -> {
        Date d = new Date(2021,11,31);
    });
  }

  @Test()
  void date_setDate_givenDayHigherThan29AndFebruaryAndLeapYear() {
    assertThrows(IllegalArgumentException.class, () -> {
      Date d = new Date(2021,2,30);
    });
  }

  @Test()
  void date_setDate_givenDayHigherThan29AndFebruaryAndNotLeapYear() {
    assertThrows(IllegalArgumentException.class, () -> {
      Date d = new Date(2021,2,29);
    });
  }

  @Test()
  void date_setDate_givenNegativeMonth() {
    assertThrows(IllegalArgumentException.class, () -> {
      Date d = new Date(2021,-1,30);
    });
  }

  @Test()
  void date_setDate_givenMonthBiggerThan12() {
    assertThrows(IllegalArgumentException.class, () -> {
      Date d = new Date(2021,13,30);
    });
  }

  @Test()
  void date_setDate_givenNegativeYear() {
    assertThrows(IllegalArgumentException.class, () -> {
      Date d = new Date(-1,3,25);
    });
  }

  @Test
  void date_getNextDay_givenEndOfMonth() {
    Date d = new Date(2021,10,31);
    assertEquals(new Date(2021,11,1), d.nextDate());
  }

  @Test
  void date_getNextDay_givenEndOfYear() {
    Date d = new Date(2021,12,31);
    assertEquals(new Date(2022,1,1), d.nextDate());
  }
  @Test
  void date_toString_givenValidDate() {
    Date d1 = new Date(2021,1,10);
    String expectedToString = d1.getYear() + "/January/" + d1.getDay();

    assertEquals(expectedToString, d1.toString());
  }
  
  @Test
  void date_isLeapYear_GivenLeapYear() {
    Date d = new Date(2020,2,10);
    assertTrue(d.isLeapYear());
  }

  @Test
  void date_isLeapYear_GivenNonLeapYear() {
    Date d = new Date(2021,2,10);
    assertFalse(d.isLeapYear());
  }
  

  @Test
  void date_equals_givenNonDateObject() {
    Date d1 = new Date(2000,2,10);
    int d2 = 50;
    assertFalse(d1.equals(d2));
  }

  @Test
  void date_equals_givenNotSameDate() {
    Date d1 = new Date(2020,1,1);
    Date d2 = new Date(2021,1,2);
    assertFalse(d1.equals(d2));
  }

  @Test
  void date_equals_givenSameDate() {
    Date d1 = new Date(2021,1,1);
    Date d2 = new Date(2021,1,1);
    assertTrue(d1.equals(d2));
  }

}