package oop04.abstraction;

public class ComputerInfoClass extends ProductInfoClass{
	private String cpu;
	private String ram;
	private String hdd;
	
	public void displayInfo(){
		/*
		 * ProductInfoClass �� �ִ�
		 * �⺯�� private �̹Ƿ� ������ �Ұ����ϴ�.
		 * ���� �߻�Ŭ������ protected ����
		 * ���� �����ߴµ� ������ private ���� ������?
		 * �׷��� �⺯�� ���� ���� ��ü�� �θ� �ִ�
		 * displayInfo() �� ȣ���ؼ� ó���Ѵ�.
		*/
		// �����ϱ�
		super.displayInfo();
		System.out.println("CPU ���� : " + this.cpu);
		System.out.println("���θ޸� ���� : " + this.ram);
		System.out.println("�ϵ��ũ ���� : " + this.hdd);
		
		
	}
	public void setInfo(String company, String name, String sid, String cpu, String ram, String hdd){
		/*
		 * �Ķ���ͷ� �Ѿ�� ���鵵 �ٷ� super��
		 * ���� �θ� �޼ҵ��� �Ķ���ͷ� ������
		 * �Ϸ� set �Ѵ�.
		 * ��. �⺯�� ������ �θ��ڽ� ���迡��
		 * �����ϹǷ�, �θ��� �⺯�� ���� ����
		 * ���� ������ ����.
		*/
		
		// �����ϱ�
		super.setInfo(company, name, sid);
		this.cpu = cpu;
		this.ram = ram;
		this.hdd = hdd;
	}

}
