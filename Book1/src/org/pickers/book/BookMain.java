package org.pickers.book;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookMain {

	
	public static void main(String[] args) {
		
		
		System.out.println("도서관리 프로그램입니다");
		
		
		List<Book> bookList = new ArrayList();
		
		//-1로 초기화
		int inputNumber = -1;
		Scanner scanner = new Scanner(System.in);
		
		while(inputNumber != 0) {
			//메뉴 출력
			System.out.println("메뉴를 선택해주세요");
			System.out.println("0.종료");
			System.out.println("1.책 등록");
			System.out.println("2.책 리스트");
			System.out.print(">");
			inputNumber = scanner.nextInt();
			
			switch(inputNumber){
			case 0:
				System.out.println("프로그램을 종료합니다");
				break;
			case 1:
				System.out.println("책 등록을 선택하셨습니다");
				
				//책 객체를 생성 
				Book book = new Book();
				//입력을 받을 변수
				String bookNumberInput;
				String bookNameInput;
				String bookPublisherInput;
				String bookWriterInput;

				System.out.println("책번호를 입력하세요");
				System.out.print(">");
				bookNumberInput = scanner.next();
				
				System.out.println("책이름을 입력하세요");
				System.out.print(">");
				bookNameInput = scanner.next();

				System.out.println("출판사를 입력하세요");
				System.out.print(">");
				bookPublisherInput = scanner.next();
				
				System.out.println("글쓴이를 입력하세요");
				System.out.print(">");
				bookWriterInput = scanner.next();
				
				book.setCode(bookNumberInput);
				book.setName(bookNameInput);
				book.setPublisher(bookPublisherInput);
				book.setWriter(bookWriterInput);
				
				bookList.add(book);
				
				System.out.println(book + "이/가 추가되었습니다");
				
				break;
			case 2:
				System.out.println("책 리스트를 선택하셨습니다");
				
				for(Book bookObject: bookList) {
					System.out.println(bookObject);
				}
				System.out.println();
				break;
			default:
				System.out.println("다시 선택해주세요");
			}	
		}
		
	}
}
