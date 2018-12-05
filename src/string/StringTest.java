package string;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class StringTest {

	public static void main(String[] args) {
		
		/*String s1 = new String("hello");
		String s2 = new String("hello");
		String s4 = "hello";
		String s41 = "hello";
		String s5 = "he";
		String s6 = "llo";
		String s3 = s5+s6;
		String s31 = "he"+"llo";
		System.out.println(s3);
		System.out.println(s1.hashCode());
		System.out.println(s2.equals(s3));
		System.out.println( s4.intern()== s3);
		System.out.println(s2.intern() == s1.intern());
		*/

//		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
		
		/*LocalDate localDate = LocalDate.of(2018, 2, 1);
		LocalDate localDate2 = localDate.with(TemporalAdjusters.lastDayOfMonth());
*/

	/*	LocalDate localDate = LocalDate.now();
		LocalTime localTime = LocalTime.now();
		
		System.out.println(localDate);
		System.out.println(localTime.format(formatter));
		LocalDate dateTime = LocalDate.now();
		LocalDate yesterDay = dateTime.minusDays(1);
		System.out.println(yesterDay);*/
		StringBuffer stringBuffer = new StringBuffer();
		int a = Integer.parseInt("123");
		int b = Integer.valueOf("123");
		String cString = String.valueOf(b);
		System.out.println(cString.toCharArray());
		stringBuffer.append("1234569");
		stringBuffer.insert(0, "78");
		System.out.println(stringBuffer);
	}

}
