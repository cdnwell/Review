package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class MapTest {
	/*
	 * Map 
	 *		키(Key) 값을 이용해서 데이터(Value)를 저장, 삭제, 읽기, 수정 
	 *
	 * map은 메모리를 많이 먹는다.
	 */
	public static void main(String[] args) {
		HashMap<String,Person> map = new HashMap<String, Person>();
		map.put("홍길동", new Person("홍길동",20));
		map.put("김철수", new Person("홍길동",46));
		map.put("이영희", new Person("홍길동",35));
		map.put("홍길동", new Person("홍길동",60));
		
		System.out.println(map);
		System.out.println(map.get("김철수"));
		
		Set<String> set = map.keySet();
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			String key = it.next();
			System.out.println(key + " " + map.get(key));
		}
		
		System.out.println(map.size());
		System.out.println(map.containsKey("홍길동"));
		System.out.println(map.containsValue(new Person("홍길동",60)));
		System.out.println(map.isEmpty());
		//map.clear();
		
//		map.remove("홍길동");
		System.out.println(map.containsKey("홍길동")); //boolean 반환
		System.out.println(map.get("홍길동")); //value반환
	}

}
