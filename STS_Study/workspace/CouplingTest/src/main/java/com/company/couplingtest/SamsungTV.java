package com.company.couplingtest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/*
 * ���� Ŭ����
 */

/*
 * Ŭ���� ����� ���� @Component�� ������ �����ν� ������ �����̳ʴ�
 * �ش� Ŭ������ bean���� �����ϰ� �����Ѵ�.
 */

// annotation�� ������ ���� --> ������ �����ӿ�ũ���� Component�� �������� ��ĵ�ؼ� Ȯ���ϰ� ��ü������ �ع�����.
@Component("tv")

public class SamsungTV implements TV {
   //SonySpeaker Ÿ���� ��� ���� ����
	
/*
 * @Autowired ������̼��� �ַ� ������� ���� �����Ͽ� ����Ѵ�.
 * �ַ� ������� ���� �����Ͽ� �ش� Ÿ���� ��ü�� ã�Ƽ� �ڵ����� �Ҵ��Ѵ�.
 * ������ �����̳ʴ� ������� ���� ���� @Autowired�� Ȯ���ϴ� ���� ���������
 * Ÿ���� üũ�Ѵ�. �׸��� �� Ÿ���� ��ü�� �޸𸮿� �����ϴ��� Ȯ���� �Ŀ�,
 * �� ��ü�� ������ ����(������)�Ѵ�.
 */
	
	@Autowired
   private SonySpeaker speaker;
   private int price;
   
   
      //������
      public SamsungTV() {
         System.out.println("===>SamsungTV(1) ��ü ����");
      }
      /*
       *[�߿�] setter �޼ҵ�� ������ �����̳ʰ� �ڵ����� ȣ���ϸ�, 
       * ȣ���ϴ� ������ <bean> ��ü ���� �����̴�, ���� setter ��������
       * �����Ϸ��� setter �޼ҵ�Ӹ� �ƴ϶� �⺻ �����ڵ� �ݵ�� �ʿ��ϴ�.
       * 
       */
      public void setSpeaker(SonySpeaker speaker) {
    	  System.out.println("===> setSpeaker() ȣ��");
		this.speaker = speaker;
	}

   	public void setPrice(int price) {
   		System.out.println("===> setPrice() ȣ��");
		this.price = price;
	}

	//������
      /*
       *  �Ʒ� �����ڸ� ���� ����?
       *   = > �������� �ذ��ϱ� ���ؼ� ������ DI�� ���� �ذ�����!!
       *   ������ �������� ����ϸ� �������� �Ű������� �������迡 �ִ�
       *   ��ü �ּ� ������ ������ �� �ִ�.
       */
      //���� ���� ���� => ������ ������(DI)���� �ʱ�ȭ �� ������� ���� ���̸�,
      //���� ���� ���� �Ѳ����� �����ؾ� �Ѵ�.
      public SamsungTV(SonySpeaker speaker) { //SonySpeaker ��ü �����س����� override���� �� ��ü ������ �ʿ� ���� > ������ ����
         System.out.println("===>SamsungTV(2) ��ü ����");
         this.speaker = speaker;
      }
      
      public SamsungTV(SonySpeaker speaker,int price) { //SonySpeaker ��ü �����س����� override���� �� ��ü ������ �ʿ� ���� > ������ ����
          System.out.println("===>SamsungTV(3) ��ü ����");
          this.speaker = speaker;
          this.price = price;
       }
      
   @Override //������ 
    public void powerOn() {
      System.out.println("SamsungTV ===> ���� �Ҵ�. (TV ���� : " + price + "��" + ")");
   }

   @Override
   public void powerOff() {
      System.out.println("SamsungTV ===> ���� ����");
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