package com.biz.service;

import com.biz.socer.domain.ScoreVO;

/* 
 * 클래스를 상속받아서 작성한다.
 * java 에서는 
 * 
 * extends : 확장하다.
 * =inherit : 상속받다. (다른프로그램에서는 inherit을 많이 사용한다.)
 * 
 * 
 * 자바에서 클래스의 상속
 * 자바 객체지향 개념에서 가장 중요한 개념
 * 기존에 잘 만들어진 클래스를 상속받아서 (inherit)서
 * 그 중 일부 method를 나만의 코드로 바꾸어서 사용하고 싶을때 
 * 클래스를 확장하여 (extends) 참조하고
 * 필요한 method 재정의(Override)하여 사용한다.
 * 
 * private  외부에서접근을 하지못하게 선언 >>(정보의 은닉화)
 * get set를 선언하여 외부에서 접근하기위해 만듬
 * .set(값을저장) >> java를 쓰는사람은 .set이 값을 저장한다는것을 안다 이것은  투명성이다.
 * .get(값을 추출)
 * 이러한것을 캡슐화 라고한다.
 * 
 * 객체지향의 5가지특징
 * 1.상속. 2.method의 재정의 >>같이 따라다닌다.
 * 3. overloading(오버로딩)
 * 4. 정보은닉 5.캡슐화  >> 같이 따라다닌다.
 * 
 * 
 * 
 * 
 * 
 * 
 */
public class ScoreServiceImlV2 extends ScoreServiceImplV1 {

	
	/*
	 * 이 곳에는 보이지는 않지만 ScoreSeriviceImplV1의
	 * 모든 기능(필드변수, 메서드) 복사 붙이기 되어 있는 것과 같다.
	 * extends ScoreSerivceImplV1 명령문을 클래스 뒤에 붙였기 때문에
	 */
	
	
	/*
	 *ScoreSeriviceImplV1의 모든 기능중 scoreList() method의 코드를
	 *바꾸어서 작성하고 싶다.
	 *단, 나머지 기능은 V1의 것을 사용하고 싶다.
	 * 
	 * 
	 */
	@Override
	public void scoreList() {
		System.out.println("===================================================");
		System.out.println("성적일람표 V2");
		System.out.println("===================================================");
		System.out.println("학번\t국어\t영어\t수학\t총점\t평균");
		System.out.println("---------------------------------------------------");
		
		for(ScoreVO sVO : scoreList) {
			System.out.print(sVO.getNum()+"\t");
			System.out.print(sVO.getKor()+"\t");
			System.out.print(sVO.getEng()+"\t");
			System.out.print(sVO.getMath()+"\t");
			System.out.print(sVO.getSum()+"\t");
			System.out.println(sVO.getAvg());
		}
		System.out.println("===================================================");
	}
	

}
