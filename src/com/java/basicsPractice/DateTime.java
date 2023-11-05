package com.java.basicsPractice;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class DateTime {
	public static void main(String[] args) {
		ZonedDateTime obj = ZonedDateTime.of(LocalDateTime.now(), ZoneId.of("Asia/Kolkata"));
		System.out.println(obj);
	}

}
