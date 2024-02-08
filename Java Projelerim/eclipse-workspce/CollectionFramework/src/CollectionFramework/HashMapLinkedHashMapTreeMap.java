package CollectionFramework;
import java.util.Map;
import java.util.LinkedHashMap;
import java.util.Collection;
import java.util.HashMap;
import java.util.TreeMap;
public class HashMapLinkedHashMapTreeMap {

	public static void mapYazdir(Map<Integer,String> map) {
		map.put(5, "Java");
		map.put(9, "React");
		map.put(3, "C++");
		map.put(1, "Python");
		
		/*Collection<String> set = map.values();
		
		for(String s : set) {
			System.out.println("Value : "+s);
		}*/
		
		/*for(Map.Entry<Integer, String> entry : map.entrySet()) {
			System.out.println("Key : "+entry.getKey()+" -----> Value : "+entry.getValue());
		}*/
		
		for(Integer key : map.keySet()) {
			System.out.println("Key : "+key+"----> Value : "+map.get(key));
		}
		
	}
	public static void main(String[] args) {

		Map<Integer,String> linkedHashMap = new LinkedHashMap<Integer,String>();
		Map<Integer,String> hashMap = new HashMap<Integer,String>();
		Map<Integer,String> treeMap = new TreeMap<Integer,String>();
		
		System.out.println("***************************");
		System.out.println("HashMap : ");
		mapYazdir(hashMap);
		
		System.out.println("***************************");
		System.out.println("LinkedHashMap : ");
		mapYazdir(linkedHashMap);
		
		System.out.println("***************************");
		System.out.println("TreeMap : ");
		mapYazdir(treeMap);
	}

}
