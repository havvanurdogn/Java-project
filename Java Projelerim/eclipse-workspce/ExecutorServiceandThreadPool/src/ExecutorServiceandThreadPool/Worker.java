package ExecutorServiceandThreadPool;

public class Worker implements Runnable{

	private String name;
	private int taskId;
	
	public Worker(String name, int taskId) {
		this.name = name;
		this.taskId = taskId;
	}

	public void run() {
		System.out.println("Worker " + name + " is starting to " + taskId + ".");
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			System.out.println("Interrupted Exception");
		}
		
		System.out.println("Worker " + name + " has done " + taskId + ".");
	}
	
	
	
	
}
