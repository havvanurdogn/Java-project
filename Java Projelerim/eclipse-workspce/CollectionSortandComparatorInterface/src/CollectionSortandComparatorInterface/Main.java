package CollectionSortandComparatorInterface;
import java.util.List;
import java.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Set;

class BuyuktenKucugeString implements Comparator<String>{

	public int compare(String o1, String o2) {
		
		return -o1.compareTo(o2);
	}
	
}
class BuyuktenKucugePlayerIsim implements Comparator<Player>{

	public int compare(Player o1, Player o2) {
		
		return -o1.getIsim().compareTo(o2.getIsim());
	}
	
}
class BuyuktenKucugePlayer implements Comparator<Player>{

	public int compare(Player o1, Player o2) {
		
		if(o1.getId() > o2.getId()) {
			return 1;
		}
		else if(o1.getId() < o2.getId()) {
			return -1;
		}
		
		return 0;
	}
	
}
class KucuktenBuyugePlayer implements Comparator<Player>{

	public int compare(Player o1, Player o2) {
		
		if(o1.getId() < o2.getId()) {
			return 1;
		}
		else if(o1.getId() > o2.getId()) {
			return -1;
		}
		
		return 0;
	}
	
}
class Player {
	
	private String isim;
	private int id;
	
	public Player(String isim , int id) {
		this.isim = isim;
		this.id = id;
	}
	
	public String toString() {
		return "ID : "+id+"  Isim : "+isim;
	}

	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
		


		
}
public class Main {
	
	public static void main(String[] args) {
		/*List<String> listString = new ArrayList<String>();	
		
		listString.add("Java");
		listString.add("Go");
		listString.add("React");
		listString.add("C++");
		
		Collections.sort(listString,new BuyuktenKucugeString());
		
		for(String s : listString) {
			System.out.println(s);
		}*/
		
		List<Player> listPlayer = new ArrayList<Player>();
		listPlayer.add(new Player("Java", 5));
		listPlayer.add(new Player("C++", 9));
		listPlayer.add(new Player("Python", 7));
		listPlayer.add(new Player("Go", 3));
		
		//Collections.sort(listPlayer,new BuyuktenKucugePlayer());
		//Collections.sort(listPlayer,new KucuktenBuyugePlayer());
		Collections.sort(listPlayer, new BuyuktenKucugePlayerIsim());
		
		for(Player p : listPlayer) {
			System.out.println(p);
		}
		
		
	}

}
