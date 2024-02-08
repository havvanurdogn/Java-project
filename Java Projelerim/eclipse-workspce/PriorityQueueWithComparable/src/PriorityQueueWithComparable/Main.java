package PriorityQueueWithComparable;
import java.util.PriorityQueue;
import java.util.Queue;

class Player implements Comparable<Player>{
	private String isim;
	private int id;
	
	public Player(String isim, int id) {
		this.isim = isim;
		this.id = id;
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

	public String toString() {
		
		return "Isim : "+isim+" || Id : "+id;
	}

	
	public int compareTo(Player player) {
		
		return this.isim.compareTo(player.isim);
	}

	/*public int compareTo(Player player) {
		if(this.id < player.id) {
			return -1;
		}
		else if(this.id > player.id) {
			return 1;
		}
		return 0;
	}*/
	
	
	
}

public class Main {

	public static void main(String[] args) {
		/*Queue<Integer> queue = new PriorityQueue<Integer>();
		
		queue.offer(7);
		queue.offer(50);
		queue.offer(3);
		queue.offer(51);
		queue.offer(9);
		
		for(Integer i : queue) {
			System.out.println(i);
		}
		
		System.out.println(queue.contains(8));
		
		queue.clear();  
		
		System.out.println(queue.size());
		
		
		while(!queue.isEmpty()) {
			System.out.println("Eleman Cikariliyor : "+queue.poll());
		}*/
		
		Queue<Player> queue = new PriorityQueue<Player>();
		
		queue.offer(new Player("Ayse", 445));
		queue.offer(new Player("Fatma", 433));
		queue.offer(new Player("Veli", 147));
		queue.offer(new Player("Ali", 321));
		
		while(!queue.isEmpty()) {
			System.out.println("Eleman Cikariliyor : "+queue.poll());
		}
		
		
	}

}
