package com.this1;

class Cat {
	String furColor;
	int height;
	
	public Cat(String color) {
		this.furColor = color;	//ͨ��this���ʳ�Ա����������this����ʡ��
		this.cry();	//ͨ��this���ó�Ա����������this����ʡ��
	}
	
	public Cat(String color, int height) {
		this(color);	//ͨ��this�����������췽��;this(color)ʵ�ʵ��õĹ��캯��Cat(String color)�������Ƿ�����ĵ�һ�����
		this.height = height;	//ͨ��this���ó�Ա����������this����ʡ��
	}
	
	public void cry() {
		System.out.println("����һֻ" + this.furColor + "��ɫ��è");
	}

	public void grow() {
		this.height++;	//ͨ��this���ʳ�Ա����������this����ʡ��
		System.out.println("�ҳ����ˣ����Ϊ" + this.height);
	}
}
