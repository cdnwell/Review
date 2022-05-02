package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class MapTest {
	/*
	 * Map 
	 *		Ű(Key) ���� �̿��ؼ� ������(Value)�� ����, ����, �б�, ���� 
	 *
	 * map�� �޸𸮸� ���� �Դ´�.
	 */
	public static void main(String[] args) {
		HashMap<String,Person> map = new HashMap<String, Person>();
		map.put("ȫ�浿", new Person("ȫ�浿",20));
		map.put("��ö��", new Person("ȫ�浿",46));
		map.put("�̿���", new Person("ȫ�浿",35));
		map.put("ȫ�浿", new Person("ȫ�浿",60));
		
		System.out.println(map);
		System.out.println(map.get("��ö��"));
		
		Set<String> set = map.keySet();
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			String key = it.next();
			System.out.println(key + " " + map.get(key));
		}
		
		System.out.println(map.size());
		System.out.println(map.containsKey("ȫ�浿"));
		System.out.println(map.containsValue(new Person("ȫ�浿",60)));
		System.out.println(map.isEmpty());
		//map.clear();
		
//		map.remove("ȫ�浿");
		System.out.println(map.containsKey("ȫ�浿")); //boolean ��ȯ
		System.out.println(map.get("ȫ�浿")); //value��ȯ
	}

}
