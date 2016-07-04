package org.pickers;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.pickers.book.BookVo;
import org.pickers.book.BookDao;

public class Main {

	public static void main(String[] args) {
		
		BookDao bookAction = new BookDao();

		System.out.println("1. 추가");
		System.out.println("2. 책찾기");
		System.out.println("3. 삭제");
		System.out.println("4. 리스트");

		Scanner scanner = new Scanner(System.in);

		while (true) {
			int inputNumber = scanner.nextInt();

			switch (inputNumber) {
			case 1:

				BookVo book = new BookVo();

				System.out.println("책번호 :");
				book.setKey(scanner.nextInt());
				System.out.println("책제목 :");
				book.setName(scanner.next());
				System.out.println("글쓴이 :");
				book.setWirter(scanner.next());
				System.out.println("출판사 :");
				book.setCompany(scanner.next());
				
				bookAction.create(book);
				break;
			case 2:
				System.out.println(bookAction.read(scanner.nextInt()));
				break;
			case 3:
				
				bookAction.delete( scanner.nextInt() );
				break;
			case 4:
				System.out.println(bookAction.list());
				break;
			default:

			}
		}

		
		
		
		
	}

}
