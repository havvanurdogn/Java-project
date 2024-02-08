package HashCodeandEquals;
import java.util.Set;
import java.util.HashSet;
import java.util.Objects;
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


	public int hashCode() {
		return Objects.hash(id, isim);
	}


	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Player other = (Player) obj;
		return id == other.id && Objects.equals(isim, other.isim);
	}
	
	
	
}

public class Main {

	public static void main(String[] args) {
		
		Set<Player> hashset = new HashSet<Player>();
		
		Player player1 = new Player("Raskolnikov", 13);
		Player player2 = new Player("Marmeladov", 89);
		Player player3 = new Player("Razuhimin", 99);
		Player player4 = new Player("Zemyatov", 56);
		Player player5 = new Player("Raskolnikov", 13);
		
		hashset.add(player1);
		hashset.add(player2);
		hashset.add(player3);
		hashset.add(player4);
		hashset.add(player5);
		
		for(Player p : hashset) {
			System.out.println(p);
		}
		

	}

}
