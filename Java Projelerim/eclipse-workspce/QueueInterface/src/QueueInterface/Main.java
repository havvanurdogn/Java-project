package QueueInterface;
import java.util.Queue;
import java.util.LinkedList;
public class Main {

	public static void main(String[] args) {
		
		Queue<String> queue = new LinkedList<String>();
		
		System.out.println(queue.isEmpty());
		
		queue.offer("Spotify");
		queue.add("Netflix");
		queue.offer("Instagram");
		queue.add("Threads");
		queue.offer("Twitter");
		
		for(String s: queue) {
			System.out.println(s);
		}
		
		//System.out.println("Ilk eleman : "+queue.peek());
		//System.out.println("Ilk eleman : "+queue.element()); eğer liste boş ise hata verir.
		
		//System.out.println("Eleman cikartiliyor : "+queue.poll());
		//System.out.println("Eleman cikartiliyor : "+queue.remove()); eğer liste boş ise hata verir.
		
		while(!queue.isEmpty()) {
			System.out.println("Eleman cikartiliyor : "+queue.poll());
		}
		
		System.out.println(queue.isEmpty());

	}

}
