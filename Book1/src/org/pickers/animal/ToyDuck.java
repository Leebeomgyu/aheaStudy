package org.pickers.animal;

public class ToyDuck implements Duck {

	@Override
	public void cry() {
		// TODO Auto-generated method stub
		System.out.println("장난감꽦꽥");
		
	}

	@Override
	public void swim() {
		
		lowBattery();
		
		System.out.println("장난감 수영하다");
	}
	
	public void sleep(){
		System.out.println("쿨쿨....");
	}
	
	private void lowBattery(){
		System.out.println("배터리가 부족해요");
	}

}
