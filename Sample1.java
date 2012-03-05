import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Sample1 {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String str = "メンタルにがり";
		System.out.println("print : " + str);
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println("Now : " + sdf.format(cal.getTime()));
	}
}
