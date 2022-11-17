package studio8;

import java.util.LinkedList;
import java.util.Objects;

public class Date {
	private int month;
	private int day;
	private int year;
	private boolean isHoliday;
	
	/**
	 * 
	 * @param month
	 * @param day
	 * @param year
	 */
	public Date(int month, int day, int year, boolean isHoliday) {
		this.month = month;
		this.day = day;
		this.year = year;
		this.isHoliday = isHoliday;
	}
	

    @Override
	public String toString() {
		return "Date: " + month + "/" + day + "/" + year + " Holiday: " + isHoliday;
	}


	@Override
	public int hashCode() {
		return Objects.hash(day, month, year);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Date other = (Date) obj;
		return day == other.day && month == other.month && year == other.year;
	}


	public static void main(String[] args) {
    	Date d1 = new Date(12, 11, 2022, true);
    	Date d2 = new Date(12, 12, 2022, false);
    	Date d3 = new Date(1, 11, 2012, true);
    	Date d4 = new Date(6, 20, 2002, false);
    	Date d5 = new Date(1, 21, 2005, true);
    	//d1.toStrin
    	System.out.println(d1);
    	System.out.println(d1.equals(d2));
    	
    	LinkedList<Date> dates = new LinkedList<Date>();
    }

}
