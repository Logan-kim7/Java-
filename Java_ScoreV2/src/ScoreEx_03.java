import com.biz.service.ScoreService;
import com.biz.service.ScoreServiceImplV1;

public class ScoreEx_03 {
	
	public static void main(String[] args) {
		
		ScoreService sService = new ScoreServiceImplV1();
		while(true) {
			if(!sService.inputScore()) {
				break;
			}
		}
		sService.calcSum();
		sService.calcAvg();
		sService.scoreList();
	}

}
