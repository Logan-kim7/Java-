package com.biz.book.service;

import java.util.ArrayList;

import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

import com.biz.book.domain.BookVO;

/*
 * Impl 이 붙어있게 선언된 class는 인터페이스를 포함하고있는 클래스인경우가많다.
 * 보통 뒤에 Impl이 붙어있으면 인터페이스도 함께있다고 생각하면 된다.
 * 
 * 
 * interface를 implements 하면 interface에 정의된 method를
 * 모두 Override 하여 구현해야 하는 규칙이 적용 된다.
 * 
 *  implements를 수행한 다음에는 반드시 
 * add unimplements method를 실행하여야 한다.(밑줄이 그어진 클래스를 눌러서 실행)
 */
public class BookServiceImplV1  implements BookService{
		List<BookVO> bookList;
		
	public BookServiceImplV1() { // 생성자 
		bookList = new ArrayList<BookVO>();
		
	}
	@Override
	public boolean inputBook() {
		// inputBook() method내에서만
		// Scanner를 사용하게 될것으로 예상되므로
		//필드변수에 선언하지 않고
		// method의 지역변수로 선언, 초기화를 수행
		// method의 지역변수로 선언을 하면 inputBook() method의 수행이 끝나
		// 변수가 자동으로 해제되는 효과를 낼수 있다.
	
		Scanner scn = new Scanner(System.in);
		BookVO bookVO = new BookVO();
		
		System.out.println("도서명을 입력해주세요>> ");
		String strTitle = scn.nextLine();
		
		if(strTitle.equals("([END]: 입력종료>>[END]")) {
			return true;
		}
		// 사용자가 도서명에 [END]를 입력하면
				// 더이상 입력을 하지 않겠다라는 신호를
				// 호출한 곳에 return
		bookVO.setTitle(strTitle);
		
		System.out.println("저자 이름을 입력해주세요 ");
		String strWriter = scn.nextLine();
		
		bookVO.setWriter(strWriter);
		
		System.out.println("출판사를 입력하세요");
		String strcomp = scn.nextLine();
		
						
		System.out.println("출판일을 입력해주세요(*000.00.00형식으로*)>> ");
		String strYear = scn.nextLine();
		// VO에서 출판연도 필드변수를 int로  지정했기 때문에
		// 입력받은 문자열을 숫자로 바꿀 필요가 있다.
		
		int intYear = 0;
		try {
			intYear = Integer.valueOf(strYear);
		}catch (Exception e) {
			System.out.println("출판일은 숫자만가능!!!");
			System.out.println(bookVO.getTitle() + "출판 정보 부터 다시입력하세요");
			return true;
		}
		bookVO.setYear(intYear);
		
		
		
		System.out.println("가격을 입력해주세요>>");
		String intPrice = scn.nextLine();
		int intPrc = 0;
		try {
			intPrc= Integer.valueOf(intPrc);
			
		}catch (Exception e) {
			System.out.println("출판일은 숫자만가능!!!");
			System.out.println(bookVO.getTitle() + "출판 정보 부터 다시입력하세요");
			
			return true;
		} 
		bookVO.setPrice(intPrc);
		bookList.add(bookVO);
		/*
		 * 만약 연도를 문자열로 잘못입력해서 오류가 발생할 경우
		 * 현재 입력하고 있는 도서정보를 도서명부터 다시 입력하도록
		 */
				// TODO Auto-generated method stub
		// 처음에는 return false로 되어있는데 
		// 모든항목이 입력이 완료되고 다음 도서정보를 입력받겠다 
		// 라는 신호를 호출한곳에 return 알림
		return true;
		
		/*
		 * bookLsit.add(bookVO) 코드가 실행되기 전에 
		 * return true를 수행하면
		 * 현재 method가 실행되면서 입력했던 
		 * 도서 정보들(도서명, 출판사)들이 아직 List에 추가되기 전이므로
		 * 현재의 입력된 도서정보는 모두 무시되어 버린다
		 * main에서는 true가 return 되었으므로
		 * 아무런 판단없이 다시 입력을 수행하는 inputBook() method를
		 * 호출하게 될것이고 
		 * 
		 * return하기전에 현재 도서를 다시 입력하라는 메시지를 
		 * 보여주었으로 
		 * 입력하는 사용자는 당연히 현재 입력하던 도서를
		 * 다시 입력하게 될것이다.
		 */
		
	}

	@Override
	public void booklist() {
		
		System.out.println("===================================================");
		System.out.println("도서 목록");
		System.out.print("도서명\t 저자\t 출판사\t 출판일\t 가격\n");
		int listsize = bookList.size(); 
		for(int i = 0 ; i < listsize; i++) {
		System.out.printf("%d\t%d\t%d\t%s\t%s\n",bookList.get(i).getTitle(),bookList.get(i).getWriter(),bookList.get(i).getComp(),
				bookList.get(i).getYear(),bookList.get(i).getPrice());
		// TODO Auto-generated method stub
		
		
	}
  }
}
