package com.app

import org.codehaus.groovy.classgen.ReturnAdder

class Demo {
	
	public static void main(args) {
		
		
		//println 'Hello World'
		// 1. 괄호 생략 가능
		// println 'Hello World';
		
		// println ('Hello World');
		
		// 2. 조건절
		def age = 27
		def person = (age < 19)? '청소년' : '성인'
		//                        거짓 : 참
		//println("$person 입니다.")
		
		assert getPi() in BigDecimal
		// 3. 그루비는 assert라는 키워드로 오류를 확인 가능하다.
		//assert getPi() == 3.15
		
		//9.	
		clos1()
		clos2(3,4)	
		clos3()
		
		
		// 10. Collective Data Types
	
		def  x = [1,2,3,4]
		def  y = ['Hi',1,true,File]
		
		def  a =[]
		
		a += [1,2,3]
		assert a ==[1,2,3]
		assert a.size == 3
		
		// 리스트에 4와 5를 다음과 같이 추가할 수도 있다.
		a << 4 << 5
		assert a == [1,2,3,4,5]
		a.add(6)
		assert a == [1,2,3,4,5,6]
		
		assert a[0] == 1
		assert a.get(0) == 1
		assert a.getAt(0) == 1
		assert a[-1] == 6
		
		a.putAt(1,1) // a 2번째 자리에 1로 치환
		assert a ==[1,1,3,4,5,6]
		// set 메소드는 이전 값을 리턴한다.(1 <- 자리 2번째 공간에 4로 치환)
		assert a.set(1,4)
		println a
		
		assert a.set(1,2)
		
		a.each{println "$it"} // 하나씩 출력
		a.eachWithIndex{it, index -> println item : "$it", index : "$index"}
		/*
		    [item:1, index:0]
			[item:2, index:1]
			[item:3, index:2]
			[item:4, index:3]
			[item:5, index:4]
			[item:6, index:5]
		*/
		
		a-=1
		assert a ==[2,3,4,5,6]
		
		a = a.minus([2,3,4])
		assert a == [5,6]
		
		
		
		// 11. Maps
		def map = ['name':'khg', 'age':27, skills:['Java','Groovy'],'author':true]
		assert map.size()==4
		
		map +=['city':'Seoul']
		assert map == ['name':'khg', 'age':27, skills:['Java','Groovy'],'author':true,'city':'Seoul']
		
		map['state'] = 'AZ'
		println map
		
		assert map.city == 'Seoul'
		assert map['city'] == 'Seoul'
		assert map.get('city') == 'Seoul'
		assert map.getAt('city') == 'Seoul'
		assert map.skills[0] =='Java'
		
		assert ['name':'khg', 'name':'Abdul'] == ['name':'Abdul']
		map.each{ it -> println it.key + ":" + it.value}
		map.eachWithIndex{it, index -> println "item $index - " + it.key + ":" + it.value}
		
		
		
		// 12. Range
		def range = 1..10
		assert range ==[1,2,3,4,5,6,7,8,9,10]
		range = 'a'..'c'
		assert range ==['a','b','c']
		
		range = 1..<8
		assert range == [1,2,3,4,5,6,7]
		
		(1..5).each{println it}
		
		
		// 13. 동일성 동등성 검사
		/*
		 * 	자바의 ==는 동일성, equlas()는 동등성
		 * 	그루비는  is()가 동일성 , ==가 동등성
		 * */
		
		// 생성자를 사용했으므로 서로 다른 인스턴스
		String s1 = new String("안녕하세요")
		String s2 = new String("안녕하세요")
		
		println (s1==s2) // true 값이 같으면 ok
		println (s1.is(s2)) // false 값이 같아도 본질은 다르기때문 

		
		
		
		
	}
	
	// 4. 리턴타입을 명시할 필요가 없다.
	def static getPi() {
		3.14
	}

	
	// 5. getter setter를 명시적을 정의할 필요가 없다. Person class
	
	// 6. 접근제어자를 생략할 경우 기본 접근자가 public으로 인식되므로 모든곳에서 접근 가능하다.
	
	// 7. try/catch 문으로 감쌀필요 없이 그루비에서는 Checked 예외들이 RunTimeException으로 감싸진다.
	
	// 8. 타입을 명시 안해도 된다.
	String message = 'hello'
	// = def message = 'hello'
	
	// 9. Closurse - 재사용 가능한 코드블록인데, 파라미터로 사용될 수도 있고 실행도 가능하다. 익명 메소드라고 생각
	// {arg1, arg2... -> statements} 로 정의한다
	// "->" 는 클로저의 파라미터 목록과 클로저의 기능을 정의하는 블락을 구분해주는 역활을 한다.
	
	def static clos1= {println "Hello Closurse!"}
	
	def static clos2 = {arg1, arg2 -> println arg1 + arg2} //7
	
	def static method1(e) {
		def prefix = "i am"
		return {println prefix + e}  
	}
	// 클로져는 보통 변수에 할당되고, 이 변수를 사용해서 클로져를 호출한다.
	def static clos3 = method1("Groovy")
		
	// 클로젼느 보통 변수에 할당되고, 이 변수를 사용해서 클로졀르 호출한다. 클로져를 파라미터로 받는 메소드 작성 가능 Employe
	

	

	
	
	
	
}

