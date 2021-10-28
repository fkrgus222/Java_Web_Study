package com.company.couplingtest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/*
 * 구현 클래스
 */

/*
 * 클래스 선언부 위에 @Component를 설정해 줌으로써 스프링 컨테이너는
 * 해당 클래스를 bean으로 생성하고 관리한다.
 */

// annotation을 붙히는 이유 --> 스프링 프레임워크에서 Component가 붙은것을 스캔해서 확인하고 객체생성을 해버린다.
@Component("tv")

public class SamsungTV implements TV {
   //SonySpeaker 타입의 멤버 변수 선언
	
/*
 * @Autowired 어노테이션은 주로 멤버변수 위에 선언하여 사용한다.
 * 주로 멤버변수 위에 설정하여 해당 타미의 객체를 찾아서 자동으로 할당한다.
 * 스프링 컨테이너는 멤버변수 위에 붙은 @Autowired를 확인하는 순간 멤버변수의
 * 타입을 체크한다. 그리고 그 타입의 객체가 메모리에 존재하는지 확인한 후에,
 * 그 객체를 변수에 주입(인젝션)한다.
 */
	
	@Autowired
   private SonySpeaker speaker;
   private int price;
   
   
      //생성자
      public SamsungTV() {
         System.out.println("===>SamsungTV(1) 객체 생성");
      }
      /*
       *[중요] setter 메소드는 스프링 컨테이너가 자동으로 호출하며, 
       * 호출하는 시점은 <bean> 객체 생성 직후이다, 따라서 setter 인젝션이
       * 동작하려면 setter 메소드뿐만 아니라 기본 생성자도 반드시 필요하다.
       * 
       */
      public void setSpeaker(SonySpeaker speaker) {
    	  System.out.println("===> setSpeaker() 호출");
		this.speaker = speaker;
	}

   	public void setPrice(int price) {
   		System.out.println("===> setPrice() 호출");
		this.price = price;
	}

	//생성자
      /*
       *  아래 생성자를 만든 이유?
       *   = > 문제점을 해결하기 위해서 생성자 DI를 통해 해결하자!!
       *   생성자 인젝션을 사용하면 생성자의 매개변수로 의존관계에 있는
       *   객체 주소 정보를 전달할 수 있다.
       */
      //다중 변수 매핑 => 생성자 인젝션(DI)에서 초기화 할 멤버변수 여러 개이면,
      //여러 개의 값을 한꺼번에 전달해야 한다.
      public SamsungTV(SonySpeaker speaker) { //SonySpeaker 객체 생성해놨으니 override에서 또 객체 생성할 필요 없음 > 의존성 주입
         System.out.println("===>SamsungTV(2) 객체 생성");
         this.speaker = speaker;
      }
      
      public SamsungTV(SonySpeaker speaker,int price) { //SonySpeaker 객체 생성해놨으니 override에서 또 객체 생성할 필요 없음 > 의존성 주입
          System.out.println("===>SamsungTV(3) 객체 생성");
          this.speaker = speaker;
          this.price = price;
       }
      
   @Override //재정의 
    public void powerOn() {
      System.out.println("SamsungTV ===> 전원 켠다. (TV 가격 : " + price + "원" + ")");
   }

   @Override
   public void powerOff() {
      System.out.println("SamsungTV ===> 전원 끈다");
   }

   @Override
   public void volumnUp() {
      //speaker = new SonySpeaker();
      speaker.volumnUp();
   }

   @Override
   public void volumnDown() {
      //speaker = new SonySpeaker();
      speaker.volumnDown();
   }
   
   
}