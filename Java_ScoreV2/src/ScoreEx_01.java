import java.util.List;
import java.util.Vector;
import java.util.ArrayList;
import java.util.LinkedList;

import com.biz.service.ScoreService;
import com.biz.service.ScoreServiceImlV2;

public class ScoreEx_01 {
	/*
	 * ScoreService 클래스 디자인하기
	 * 	boolean imputScore()
	 * void calcSum()
	 * void calcAvg()
	 * void scoreList()
	 * 
	 * 
	 * 인터페이스
	 * 		자바 클래스의 한 현태이다.
	 * 		메서드들의 원형(Prototype)을 정의만  할수 있다.
	 * 		메서드 들이 할일(코드)는 구체적으로 작성할수 없다.
	 * 		모든 메서드는 {}없이 메서드에서 바로 문장이 종료된다.
	 * 		인터페이스를 implements할 클래스에 규칙을 지정한다.
	 * 		인터페이스를  implements한 클래스는
	 * 		인터페이스에 정의된 메서드를 모두 구현해야 한다.
	 * 		인터페이스에 정의된 모든 메서드를 의무적으로 포함해야 한다.
	 * 		인터페이스에 정의된 메서드 이름을 변경하여 사용할수 없다.
	 * 		자신이 어떤 메서드를 구체적으로 만들어야하는지 명확히 알수 있다.
	 * 
	 * 
	 * 		인터페이스를 implements한 클래스를 사용하는 곳에서는
	 * 			지금 호출하는 method는 어떤 클래스를 사용하든 같은 이름일 것이다. 라는 기대
	 * 			지금 호출하는 method가 반드시 존재하는 메서드 이다 라는 기대
	 * 			혹시 다른 클래스를 사용해서 객체(인스턴스)를 생성했을때
	 * 			나머지 부분의 코드를 (거의) 변경없이 테스트, 사용이 가능하다는 기대
	 * 
	 * 		인터페이스를 사용하므로 해서 (Service)클래스와 (Main)클래스 간에
	 * 			결합도는 낮아지고 응집도는 높아져서 개발생산성, 유지보수성, 등이 매우 좋아진다
	 * 			
	 * 
	 * 		인터페이스를 잘 디자인 해 두면, 어플리케이션을 만들어가는 과정중에
	 * 			후반부로 갈수록 시간, 비용 등이 절약된다.
	 * 
	 * 
	 * 
	 * 
	 *  디폴트가떠서 변경이 안되..
	 */
	
	public static void main(String[] args) {
		// interface를 implements하여 만들어진 클래스는
		// 선언을 할때는 interface로 선언을 하고,
		// 초기화 할때는 실제 코드가 구현된 클래스로 초기화한다.
		ScoreService sService = new ScoreServiceImlV2();
		
		sService.inputScore(); //method() {.....}
		sService.calcSum();
		sService.calcAvg();
		sService.scoreList();
		
		/*
		 * List interface 는 ArrayList 클래스를 선언할때 implements한 주체이다
		 * 따라서 ArrayList 형 객체(인스턴스)를 만들떄는
		 * 		선언은 List로 하고, 초기화는 ArrayList로  수행한다.
		 * 
		 */
		List<String> strList = new ArrayList<String>();
		strList = new LinkedList<String>(); //  
		strList = new Vector<String>();			//
		ArrayList<String> strList1 = new ArrayList<String>();
	}

}
