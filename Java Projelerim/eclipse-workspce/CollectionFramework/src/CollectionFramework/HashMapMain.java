package CollectionFramework;
import java.util.HashMap;
import java.util.Map;
public class HashMapMain {

	public static void main(String[] args) {
		
		HashMap<Integer,String> hashMap = new HashMap<Integer,String>();
		
		hashMap.put(75, "Pyhton");
		hashMap.put(82, "C#");
		hashMap.put(39, "Go");
		hashMap.put(12, "Java");
		hashMap.put(39, "C++");
		hashMap.put(12, "Java");
		hashMap.put(76, "React");
		hashMap.put(73, "Pyhton");
		
		//hashMap.clear(); tüm verileri temizliyor
		
		System.out.println(hashMap);
		
		System.out.println(hashMap.get(86));
		System.out.println(hashMap.get(82));
		
		for(Map.Entry<Integer, String> entry : hashMap.entrySet()) {
			System.out.println("Key : "+entry.getKey()+" --------> Value : "+entry.getValue());
		}
	}

}
