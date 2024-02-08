package CollectionSortandCompareableInterface;
import java.util.List;
import java.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;
class Player implements Comparable<Player> {
	
	private String isim;
	private int id;
	
	public Player(String isim , int id) {
		this.isim = isim;
		this.id = id;
	}
	
	public String toString() {
		return "ID : "+id+"  Isim : "+isim;
	}
		
	public int compareTo(Player player) {
		if(this.id > player.id) {
			return 1;
		}
		else if(this.id < player.id) {
			return -1;
		}
			return 0;
	}

		
}
public class Main {
	
	public static void main(String[] args) {
		//List<Player> listString = new ArrayList<Player>();	
		
		/*listString.add("Java");
		listString.add("Go");
		listString.add("React");
		listString.add("C++");
		
		Collections.sort(listString);
		
		for(String s : listString) {
			System.out.println(s);
		}*/
		
		/*listString.add(new Player("Java", 5));
		listString.add(new Player("C++", 9));
		listString.add(new Player("Python", 1));
		listString.add(new Player("Go", 3));
		
		Collections.sort(listString);
		
		for(Player p : listString) {
			System.out.println(p);
		}*/
		
		Set<Player> treeset = new TreeSet<Player>();
		
		treeset.add(new Player("Java", 5));
		treeset.add(new Player("C++", 9));
		treeset.add(new Player("Python", 1));
		treeset.add(new Player("Go", 3));
		
		for(Player p : treeset) {
			System.out.println(p);
		}
		
	}

}

