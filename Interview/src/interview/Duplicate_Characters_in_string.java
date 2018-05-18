package interview;

import java.util.*;
import java.util.Map.Entry;
public class Duplicate_Characters_in_string {
	public static void main(String[] args) {
		String s="hello world venkat 123 tttt";
		Map<String,Integer> map = new HashMap<String,Integer>();
		int k=1;
		for(int i=0;i<s.length();i++) {
			char c = s.charAt(i);
			String s1 = String.valueOf(c);
			int count = check_string(map,s1);
			count++;
			map.put(s1, count);		
		}
		Set<String> set = map.keySet();
		for(String keys : set) {	
			System.out.println(keys+" and value is  "+check_string(map,keys));
		}
	}
	public static int check_string(Map map,String s) {
		Set<Entry<String, Integer>> set = map.entrySet();
		Iterator<Entry<String, Integer>> itr = set.iterator();
		while(itr.hasNext()) {
			Entry<String, Integer> e = itr.next();
			if(e.getKey().equals(s)) {
				return e.getValue();
			}
		}
		return 0;
	}
}
