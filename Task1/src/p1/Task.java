package p1;

	import java.util.*;
	import java.util.Scanner;

	public class Task {

		 static void characterCount(String InputString) {
			HashMap<Character,Integer> charCountMap = new HashMap<Character,Integer>();
			char[] StringArray = InputString.toCharArray();
			for(char c : StringArray ) {
			if(charCountMap.containsKey(c)) {
				charCountMap.put(c, charCountMap.get(c) + 1);
			}
			else {
				charCountMap.put(c,1);
			}
				}
			for(Map.Entry entry: charCountMap.entrySet())
					{
				System.out.println(entry.getKey()+" "+entry.getValue());
				
				}
					}
		
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter alphabets :-");
			String str=sc.nextLine();
			characterCount(str);
		}

		
		}
		

	
