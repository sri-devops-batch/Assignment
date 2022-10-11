package map;
import java.util.HashMap;
import java.util.Map;

public class MapTask {

	public static void main(String[] args) {
		
		Map<Integer,Double> dayWiseTemp = new HashMap<>();
		
		int date = 0;
		dayWiseTemp.put(++date, 30.60);
		dayWiseTemp.put(++date, 29.60);
		dayWiseTemp.put(++date, 27.30);
		dayWiseTemp.put(++date, 28.30);
		dayWiseTemp.put(++date, 2.30);
		dayWiseTemp.put(++date, 22.10);
		dayWiseTemp.put(++date, 21.10);
		dayWiseTemp.put(++date, 20.30);
		dayWiseTemp.put(++date, 17.30);
		dayWiseTemp.put(++date, 17.60);
		dayWiseTemp.put(++date, 16.80);
		dayWiseTemp.put(++date, 12.80);
		dayWiseTemp.put(++date, 10.60);
System.out.println(dayWiseTemp);
		
		Double result = dayWiseTemp.get(20);// use to extract the value based on key
		double MaxValue=30;
		double MinValue=2.30;
		
		for(Map.Entry<Integer,Double> oneEntry : dayWiseTemp.entrySet()) {
			if(oneEntry.getValue()==MaxValue)
			{
				System.out.println("\n Date:-"+oneEntry.getValue());
				System.out.println("\n Highest temperature:-"+oneEntry.getValue()+"\n");
			}
			else if(oneEntry.getValue()==MinValue) {
				System.out.println("\n Date:-"+oneEntry.getValue());
				System.out.println("\n lowest temperature:-"+oneEntry.getValue()+"\n");
			}	
			else if(oneEntry.getValue()>20 && oneEntry.getValue()<28)
			{

			System.out.print("\n Date :- "+oneEntry.getKey());
			System.out.print("\t Tempetature :- "+oneEntry.getValue()+" \n");
			
		}
		
		
		
	}
		

		
		}
	}