package QueueInterface;

import java.util.Queue;
import java.util.LinkedList;
import java.util.Random;

public class RamazanPidesi {

	public static void main(String[] args)  throws InterruptedException  {
		
		Queue<String> queue = new LinkedList<String>();
		Random random = new Random();
		
		queue.offer("Rodya");
		queue.offer("Sonya");
		queue.offer("Razumihin");
		queue.offer("Marmeladova");
		queue.offer("Dunya");
		queue.offer("Lizaveta");
		queue.offer("Katerina");
		queue.offer("Zamiyatov");
		queue.offer("Lujin");
		queue.offer("Nastasya");
		
		System.out.println("Ramazan pidesi cikariliyor...");
		int pideSayisi = random.nextInt(10) + 1 ;
		Thread.sleep(2000);
		System.out.println(pideSayisi + " tane pide cikmistir.");
		
		while(pideSayisi != 0) {
			System.out.println(queue.poll()+" pidesini aliyor.");
			Thread.sleep(1000);
			pideSayisi --;
		}
		
		System.out.println("Pide kalmamistir.");
		

	}

}
