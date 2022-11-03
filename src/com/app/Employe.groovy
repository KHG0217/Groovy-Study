package com.app
// 클로젼느 보통 변수에 할당되고, 이 변수를 사용해서 클로졀르 호출한다. 
// 클로져를 파라미터로 받는 메소드 작성 가능 Employe
class Employe {
	def salary
	double calculateRaise(c) {
		return c(salary)
	}
	
	static void main(args) {
		Employe employe1 = new Employe(salary:1000)
		def raise1 = {salary -> (salary * 1.5)}
		assert employe1.calculateRaise(raise1) == 1500
		
		Employe employe2 = new Employe(salary:500)
		def raise2 = {salary -> (salary + 300)}
		assert employe2.calculateRaise(raise2) == 800
	}
	
}


	





