package studio8;

public class Date {
	private int month;
	private int day;
	private int year;
	
	/**
	 * 
	 * @param month
	 * @param day
	 * @param year
	 */
	public Date(int month, int day, int year) {
		this.month = month;
		this.day = day;
		this.year = year;
	}
	
	

    @Override
	public String toString() {
		return "Date: " + month + "/" + day + "/" + year;
	}



	public static void main(String[] args) {
    	Date d1 = new Date(12, 11, 2022);
    	//d1.toStrin
    	System.out.println(d1);
    }

}
