package PriorityQueueAcilServis;
import java.util.PriorityQueue;
import java.util.Queue;
public class Main {

	public static void main(String[] args) {
		Queue<Hasta> queue = new PriorityQueue<Hasta>();
		
		queue.offer(new Hasta("Ali", "Yanik"));
		queue.offer(new Hasta("Veli", "Bas agrisi"));
		queue.offer(new Hasta("Fatma", "Apandisit"));
		queue.offer(new Hasta("Ayse", "Yanik"));
		queue.offer(new Hasta("Yagmur", "Bas agrisi"));
		queue.offer(new Hasta("Sena", "Bas agrisi"));
		queue.offer(new Hasta("Edis", "Apandisit"));
		
		int i = 1;
		
		while(!queue.isEmpty()) {
			System.out.println("****************************************");
			System.out.println(i+". siradaki hasta : ");
			System.out.println(queue.poll());
			System.out.println("****************************************");
			i++;
		}
		
	}

}
