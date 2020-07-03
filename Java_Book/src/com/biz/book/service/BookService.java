package com.biz.book.service;
/*
 * 인터페이스에서는 모양만 만든다
 * 매서드만 선언 가능
 */
public interface BookService {
	
	/*
	 * input()
	 * 어떤 정보를 키보드에서 입력받기
	 * 무작정 입력받기하고
	 * 입력하는 과정에서 END라는 문자열을 입력하면
	 * 입력을 중단한다는 신호를 호출한 곳으로 return
	 * 
	 * input()에서 
	 * 모든 항목 입력이 정상적으로 이루어지면 return true
	 * 만약 중단하기 위해 END 문자열을 입력하면
	 * 호출한곳에 false를 retrun 하여 더이상
	 * 입력을 하지 않겠다고 신호를 보냈다.
	 * 일종의 커뮤니케이션
	 * (true, false 로 받기 위해 void >> boolean 으로 변경해주었다.)
	 * 
	 *  
	 */
	public boolean inputBook();
	public void booklist();
	

}
