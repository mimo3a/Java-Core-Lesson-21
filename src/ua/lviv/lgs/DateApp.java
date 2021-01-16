package ua.lviv.lgs;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateApp {
	public static void main(String[] args) {

		Date myDate = new Date();
		System.out.println("Date format = " + myDate);
		System.out.println("LocalDate format = " + convertToLocalDate(myDate));
		System.out.println("LocalTime format = " + convertToLocalTime(myDate));
		System.out.println("LocalDateTime format = " + convertToLocalDateTime(myDate));

	}

	public static String convertToLocalDate(Date date) {
		@SuppressWarnings("deprecation")
		String year = Integer.toString((date.getYear() + 1900));
		String month;
		@SuppressWarnings("deprecation")
		int monthNumber = date.getMonth() + 1;
		month = monthNumber < 10 ? ("0" + monthNumber) : ("" + monthNumber);
		String day;
		@SuppressWarnings("deprecation")
		int dayMonth = date.getDate();
		day = dayMonth < 10 ? ("0" + dayMonth) : ("" + dayMonth);
		String localDate = year + "-" + month + "-" + day;
		return localDate;
	}

	public static String convertToLocalTime(Date date) {
		@SuppressWarnings("deprecation")
		int hoursInt = date.getHours();
		String hours = hoursInt < 10 ? ("0" + hoursInt) : ("" + hoursInt);
		@SuppressWarnings("deprecation")
		int minutesInt = date.getMinutes();
		String minutes = minutesInt < 10 ? ("0" + minutesInt) : ("" + minutesInt);
		@SuppressWarnings("deprecation")
		int secondsInt = date.getSeconds();
		String seconds = secondsInt < 10 ? ("0" + secondsInt) : ("" + secondsInt);
		long milliseconds = date.getTime() % 1000;
		String localTime = hours + ":" + minutes + ":" + seconds + "." + milliseconds;
		return localTime;
	}

	public static String convertToLocalDateTime(Date date) {
		String localDateTime = convertToLocalDate(date) + "T" + convertToLocalTime(date);
		return localDateTime;
	}

}
