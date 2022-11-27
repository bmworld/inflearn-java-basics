package collections;

import java.util.ArrayList;
import java.util.HashMap;

public class MainClass {
	public static void main(String[] args) {
		System.out.println("------------------------------");
		System.out.println("-- List: 리스트는 interface이다. 이를 구헌한 클래스는 index를 이용하여 데이터를 관리한다.");
		
		ArrayList<String> list = new ArrayList<String>();
		
		 
		 // # 데이터 추가
		 list.add("Hi");
		 list.add("JAVA");
		 list.add("AND");
		 
		 
		 System.out.println("list.size: " + list.size());
		 System.out.println("list: " + list); 
		 
		 // # 데이터 추가
		 list.add(3, "BMWORLD!!");
		 
		 System.out.println("list: " + list);
		 
		 // # 데이터 변경
		 list.set(0, "Hello~");
		 System.out.println("list: " + list);
		 
		 
		 
		String str = list.get(2);
		System.out.println("String list get(2): " + str);
		
		
		list.clear();
		System.out.println("Clear List: " + list);
		
		boolean b= list.isEmpty();
		System.out.println("list.isEmpty(): " + b);
		
		System.out.println("------------------------------");
		System.out.println("-- Map: interface로 구현한 class는 key를 이용하여 data관리");
		
		HashMap<Integer , String> map = new HashMap<Integer, String>();
		map.put(4, "goodMorning");
		map.put(2, "2");
		map.put(3, "value");
		map.put(1, "Hello!");
		System.out.println("map: "+map);
		System.out.println("mapSize: "+map.size()); // 객체의 길이를 아는 방법 size()
		
		
		// 데이터 교체
		map.put(2, "WOW");
		System.out.println("map: "+map);
		
		// 데이터 추출
		str = map.get(3);
		System.out.println("get map: " + str);
		
		// 데이터 제거  
		map.remove(3);
		System.out.println("remove map: "+map);
		;
		
		// 특정 데이터 포함 유무
		b = map.containsKey(4);
		System.out.println("map.containsKey(4): " + b);
		
		
		boolean v = map.containsValue("Hello!"); //  대소문자포함하여 문자열 100% 일치 시, true 반환
		System.out.println("map.containsValue(4): " + v);
		
		// 데이터 전체 제거.
		map.clear();
		System.out.println("clear map: "+map);
		
		
		// 데이터 유무
		b = map.isEmpty();
		System.out.println("map.isEmpty(): "+b);
		System.out.println("------------------------------");
	}
				

}
