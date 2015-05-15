package oop01.encapsule;

public class KaupVO {
	private double height;
	private double weight;
	private int idx;
	private String msg;
	
	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	public void setIdx(double weight, double height) {
		this.idx = (int)((weight/(height*height))*10000);
		//  this.idx = (int)((getWeight()/(getHeight()*getHeight()))*10000);
	}
	
	public int getIdx() {
		return idx;
	}

	public void setMsg(String msg){
		//this.msg = msg;
		if(idx>30){this.msg = "��";}
		else if(idx>24){this.msg = "��ü��";}
		else if(idx>20){this.msg = "����";}
		else if(idx>15){this.msg = "��ü��";}
		else if(idx>13){this.msg = "����";}
		else if(idx>10){this.msg = "�������";}
		else{this.msg = "�Ҹ���";}
	}
	
	public String getMsg() {
		return msg;
	}

	@Override
	public String toString() {
		return "ī�������� [Ű=" + height + "cm, ������=" + weight + "kg, ī��������="
				+ getMsg() + "]";
		
		// "ī�������� [Ű=" + getHeight() + "cm, ������=" + getWeight() + "kg, ī��������=" + getMsg() + "]";
	}
}
