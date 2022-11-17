package studio8;


public class Time {
	
	private int hour;
	private int minute;
	
	/**
	 * 
	 * @param hour
	 * @param minute
	 */
	public Time(int hour, int minute) {
		this.hour = hour;
		this.minute = minute;
		
	}
	
	/**
	 * 
	 * @return hour
	 */
	public int getHour() {
		return this.hour;
	}
	
	/**
	 * 
	 * @return minute
	 */
	public int getMinute() {
		return this.minute;
	}
	
	public String toString() {
		return("Time: "+hour+":"+minute);
	}

	public static void main(String[] args) {
		Time t1 = new Time(12,24);
	
		System.out.println(t1);
}
	
}