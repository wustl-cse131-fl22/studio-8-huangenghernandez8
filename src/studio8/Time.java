package studio8;

import java.util.Objects;

public class Time {

	private int hour;
	private int minute;
	private boolean isMilitaryTime;

	/**
	 * 
	 * @param hour
	 * @param minute
	 */
	public Time(int hour, int minute, boolean isMilitaryTime) {
		this.hour = hour;
		this.minute = minute;
		this.isMilitaryTime = isMilitaryTime;

	}

	@Override
	public int hashCode() {
		return Objects.hash(hour, minute);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Time other = (Time) obj;
		return hour == other.hour && minute == other.minute;
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
		return ("Time: " + hour + ":" + minute + " isMilitaryTime: " + isMilitaryTime);
	}

	public static void main(String[] args) {
		Time t1 = new Time(12, 24, false);

		System.out.println(t1);
	}

}