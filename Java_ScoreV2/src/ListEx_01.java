import java.util.ArrayList;
import java.util.List;

public class ListEx_01 {
	
	public static void main(String[] args) {
		
		//객체 (인스턴스)들의 묶음 객체
		// List<제네릭:Generic> 리스트에 포함된 객체가 무엇인가를 명시
		List<String> strList; //String 객체(문자열)이 요소로 포함된 리스트다.
		strList = new ArrayList<String>();
		
		strList.add("Korea");
		strList.add("대한민국");
		strList.add("우리나라만세");
		
		int size = strList.size();
		for(int i = 0; i < size ; i++) {
			String str = strList.get(i);
			System.out.println(str);
		}
		
		strList.add("이몽룡");
		strList.add("성춘향");
		strList.add("장보고");
		
		size = strList.size();
		for(int i = 0 ; i < size; i++) {
			System.out.println(strList.get(i));
		}
		
		// for문이 strList 개수만큼 반복 수행되는 동안
		// 계속해서 size() method를 호출하여 연산을 수행하도록 한다.
		// strList개수가 for 반복문 내에서 변경되지 않는 경우
		// 매우 불필요한 연산을 반복 수행하는 결과가 된다.(비효율적)
		for(int i = 0 ; i < strList.size(); i++) {
			System.out.println(strList.get(i));
		}
		
		// 개수를 1번만 조회하고 for 반복문 실행하기
		// 이코드는 개수를 1번만 조회하고 for 반복문을 수행하기 때문에
		// 위의 코드 보다는 효율 적이다.
		// 하지만 개수를 조회하는 코드를 생략하면 혹시 List 개수가 변경 되었을떄
		// for 반복문 연산 수행에 문제가 될수 있다.
		
		// 확장for 또는 for each 문이라한다.  strList에서 받아온 값을 String str에 각각 넣어 for문안으로 넣어준다.
		// List 전체에 대해서 for 반복문을 수행할 경우
		// 사용할수 있는 향상된 for, forEach 라고한다
		// for가 반복되면서 strList.get(현재) 를 str 변수에 할당
		// for 반복문 내에서 str 변수 값을 읽어서 사용할 수 있다.
		for(String str :strList) {
			System.out.println(str);
		}
		
		// 배열도 향상된 for를 사용하여 반복문 수행할수 있다.
		int[] intArray = new int[100];
		for(int i : intArray) {
			System.out.println(i);
		}

	}

}
