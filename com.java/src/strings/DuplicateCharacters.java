package strings;

public class DuplicateCharacters {
	public static void bruteforce(String str){
		int count;
		if (str == null) {
			System.out.println("The given string is null");
		} else if (str.isEmpty()) {
			System.out.println("The given string is empty");
		} else {
			
			char[] string = str.toCharArray();
			for (int i = 0; i < string.length; i++) {
				count =1;
				for (int j = i+1; j < string.length; j++) {
					if(string[i]==string[j] && string[i]!=' ') {
						count++;
						string[j] ='0';
					}
				}
				if(count>1 && string[i]!='0') {
					System.out.println(string[i] + " = " + count);
				}
				
			}
		}
	}
	public static void hashMap(String[] args) {
		String str = "anikethan";
		char[] ch = str.toCharArray();
		//If  order is important use LinkedHashMap
		//If order not imp use HashMap
		//If natural order requried use TreeMap
		Map<Character,Integer> map = new LinkedHashMap<Character,Integer>(); 
	        for(int i = 0; i<ch.length;i++){
	        if(!map.containsKey(ch[i])){
	            map.put(ch[i], 1);
	        }else{
	            map.put(ch[i],map.get(ch[i])+1);
	        }
	    }
	     for (Map.Entry<Character, Integer> entry : map.entrySet()) {
	         if(entry.getValue()>1){
               		System.out.println(entry.getKey() + " = " + entry.getValue());
		 }
	     }
	}
	public static void main(String[] args) {
		String str = "This is duplicate characters check program";
		
	}
}
