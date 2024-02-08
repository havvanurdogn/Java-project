public class Main {

	public static void main(String[] args) {
		
		Date date1 = new Date(7, 1, 1453);
		Time time1 = new Time(8, 2, 3);
		
		time1.previousSecond();
		System.out.println(time1.toString());
		
		time1.nextSecond();
		System.out.println(time1.toString());
		
		System.out.println(date1.toString());
		
		
	}

}