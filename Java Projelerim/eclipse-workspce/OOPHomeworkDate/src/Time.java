public class Time {

	private int hour;
	private int minute;
	private int second;
	
	public Time(int hour, int minute, int second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}

	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {
		this.minute = minute;
	}

	public int getSecond() {
		return second;
	}

	public void setSecond(int second) {
		this.second = second;
	}
	
	public void setTime(int hour, int minute, int second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
	
	public String toString() {
		
		if(hour < 10 && minute < 10 && second < 10) {
			
			return "0"+ hour + ":" + "0"+ minute + ":" + "0"+ second;
		}
		else if(hour < 10 && minute < 10) {
			
			return "0"+ hour + ":" + "0"+ minute + ":" + second;
		}
		else if(hour < 10 && second < 10) {
			
			return "0"+ hour + ":" + minute + ":0" + second;
		}
		else if(minute < 10 && second < 10) {
			
			return hour + ":0" + minute + ":0" + second;
		}
		else if(hour < 10) {
			
			return "0"+ hour + ":" + minute + ":" + second;
		}
		else if(minute < 10) {
			
			return hour + ":0" + minute + ":" + second;
		}
		else if(second < 10) {
			
			return hour + ":" + minute + ":0" + second;
		}
		else {
			
			return hour + ":" + minute + ":" + second;
		}	
	}
	
	public Time nextSecond() {
		
		Time time = new Time(hour, minute, second);
		
		second++;
		
		if(second >= 60) {
			
			second = second - 60;
			minute++;
			
			if(minute >= 60) {
				
				minute = minute - 60;
				hour++;
				
				if(hour >= 24) {
					
					hour = hour - 24;
					
					return time;
				}
				else {
					
					return time;
				}
			}
			else {
				
				return time;
			}
		}
		else {
			
			return time;
		}
	}
	
	
	public Time previousSecond() {
		
		Time time = new Time(hour, minute, second);
		
		second--;
		
		if(second < 0) {
			
			second = second + 60;
			minute--;
			
			if(minute < 0) {
				
				minute = minute + 60;
				hour--;
				
				if(hour < 0) {
					
					hour = hour + 24;
					
					return time;
				}
				else {
					
					return time;
				}
			}
			else {
				
				return time;
			}
		}
		else {
			
			return time;
		}
	}
}