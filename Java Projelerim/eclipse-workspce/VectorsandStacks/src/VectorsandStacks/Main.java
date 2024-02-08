package VectorsandStacks;
import java.util.Vector;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.ListIterator;
import java.util.List;
import java.util.Stack;
public class Main {

	public static void main(String[] args) {
		Vector<String> vector = new Vector<String>();
		
		vector.add("Java");
		vector.add("PHP");
		vector.add("Go");
		vector.add("C++");
		
		Enumeration<String> enumeration = vector.elements();
		
		while(enumeration.hasMoreElements()) {
			System.out.println(enumeration.nextElement());
		}
		
		/*for(String s : vector) {
			System.out.println(s);
		}
		
		ListIterator<String> iterator = vector.listIterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}*/
		
		Stack<String> stack = new Stack<String>();
		
		stack.push("Python");
		stack.push("Java");
		stack.push("C");
		stack.push("React");
		
		/*Enumeration<String> enumeration = stack.elements();
		
		while(enumeration.hasMoreElements()) {
			System.out.println(enumeration.nextElement());
		}*/
		
		//System.out.println(stack.empty());
		
		/*System.out.println("Ilk element : "+stack.firstElement());
		System.out.println("Son element : "+stack.lastElement());*/
		
		//System.out.println(stack.get(0));
		
		//System.out.println(stack.peek()); son elemanı gösterir
		
		//System.out.println(stack.pop()); son elemanı stackten çıkarır
		
		/*while(!stack.empty()) {
			System.out.println(stack.pop());
		}
		
		for(String s : stack) {
			System.out.println(s);
		}*/
	}
	
}
