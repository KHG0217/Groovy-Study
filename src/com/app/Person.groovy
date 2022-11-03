package com.app

// getter setter를 명시적을 정의할 필요가 없다.
class Person {
	String firstName
	String lastName
	
	def getName() {
		firstName+ ' '+ lastName
	}

	static void main(args) {
		def person = new Person()
		person.firstName = 'Hyuk Gyu'
		person.lastName = 'Kim'
		
		// assert �����
		assert person.firstName == 'Hyuk Gyu'
		assert person.lastName == 'Kim'
		//assert person.lastName == 'Ki'
		
		println person.getName()
	}
}
