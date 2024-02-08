
public class TotalAmountsofPoint {
	
	public static int points(String[] games) {
	      int point = 0;
	      for(int i = 0 ; i < games.length ; i++ ){
	        int x = games[i].charAt(0);
	        int y = games[i].charAt(2);
	        if(x>y) point += 3;
	        else if(x==y) point += 1;
	      }
	      return point;
	    }

	public static void main(String[] args) {
		String[] games = {"3:1", "2:2", "0:1", "3:2"};
		System.out.println(points(games));
	}

}
