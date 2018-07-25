package com.loong.date;

import org.junit.Test;

import java.time.Clock;
import java.time.LocalDate;
import java.time.LocalTime;

public class DateTest {

    @Test
    public void dateTest(){
        System.out.println(Clock.systemUTC().instant().toString());
        System.out.println(LocalDate.now().toString());
        System.out.println(LocalTime.now().toString());

    }
}
