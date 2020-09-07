package com.kh.var;

import java.util.Scanner;

public class InputVariable {
     // 기능 제공용 클래스 
	
	 // Java 1.5 이전 
	
	 // Java 1.5버전 이후부터는 키보드의 입력값 더 쉽게 처리
	 
	public void InputMethod2() {
		// System.in  : 키보드 (입력자원)
		// System.out : 모니터 (출력자원)
		// System.err : 표준 에러 출력
		
		//Scanner : 각각의 자료형 별로 
		//          키보드의 입력값을 처리해주는 객체 
		//누가 만들어 놓은 것을 통째로 가져와 쓸 때 - 원본 그대로가 아니고 일부 따옴 / 스캐너를 하나 가져오기 
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner (System.in);
		
		//java.util.Scanner sc = new java.util.Scanner(System.in);
		//풀패키지(풀클래스명) : 사용하려는 자바 클래스 파일의 이름을 
		//                 해당 클래스가 속한 모든 패키지명을 기술하여 선언하는 것 
		//                 만약, 사용하려는 클래스가 여러개 있고, 그 클래스들의 이름이
		//                 같으면 이렇게 풀패키지명으로 선언해 사용해야 함.
		
		
		//키보드 입력을 위한 변수 공간 선언
		String name;  // 이름
		int   point;  // 점수
		double  avg;  // 평균 
		
		//화면에 값을 입력받기 위한 안내 메세지 출력하기 
		System.out.print("이름을 입력하세요 : ");
		name = sc.nextLine();
		
		System.out.print("점수를 입력하세요 : ");
		point = sc.nextInt();
		
        System.out.print("평균을 입력하세요 : ");
        avg = sc.nextDouble();

	    // 키보드로 입력한 내용 출력하기
        System.out.println("이름 : " + name);
        System.out.println("점수 : " + point);
        System.out.println("평균 : " + avg);
	}
	
	public void myInputMethod() {
		//기본 자료형 3가지 이상을 사용하여 
		//도서 정보를 입력받는 프로그램 만들어 보기
		//단,Scanner를 사용하며, 
		//변수의 이름은 aaa, bbb(X)
		//그럴듯하게 직접 지어 사용하기 
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner (System.in);
		
		//키보드 입력을 위한 변수 공간 선언
		String title;  // 제목
		String author;  // 작가
		int    price;  // 가격
		boolean sale; // 할인여부
		double discount;  // 할인율  
		
		//화면에 값을 입력받기 위한 안내 메세지 출력하기 
		System.out.print("제목을 입력하세요 : ");
		title = sc.nextLine();
		
		System.out.print("작가를 입력하세요 : ");
		author = sc.nextLine();
		
        System.out.print("가격을 입력하세요 : ");
        price = sc.nextInt();
        
        System.out.print("할인여부을 입력하세요 : ");
         sale = sc.nextBoolean();
        
        System.out.print("할인율을 입력하세요 : ");
        discount = sc.nextDouble();

	    // 키보드로 입력한 내용 출력하기
        System.out.println("제목 : " + title);
        System.out.println("작가 : " + author);
        System.out.println("가격 : " + price);
        System.out.println("할인여부 : " + sale);
        System.out.printf("할인율 : " + discount);
		
	}
	
}
