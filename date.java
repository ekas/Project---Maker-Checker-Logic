import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;


public class dateSplit {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String dateFormat = "2014-12-03 00.00.00.0";
		String newDate = dateFormat.substring(0,10);
		
		String newDate2[] = newDate.split("-");
		for (int i = 0; i < newDate2.length; i++) {
			System.out.println(newDate2[i]);
		}
		
		int day = Integer.parseInt(newDate2[2]);  
		int month = Integer.parseInt(newDate2[1]); 
		int year = Integer.parseInt(newDate2[0]);
		
		DateFormat dateFormat2 = new SimpleDateFormat("dd/MMM/yyyy");
		Calendar c = Calendar.getInstance();
		c.set(year, month - 1, day, 0, 0);    

		System.out.println(dateFormat2.format(c.getTime()));
	}

}
