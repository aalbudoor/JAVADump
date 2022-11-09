package NumbersAndStatic;
import java.util.Date;

public class FormattingDate {
	
		//the complete date and time
	String a = String.format("%tc", new Date());
	
	//just the time
	String b1 = String.format("%tr", new Date());
	
	//Day of the week, mnth and day
	
	Date today = new Date();
	String b2 = String.format("%tA, %tB, %td", today, today, today);
	
	
	

}
