package com.this1;

class Cat {
	String furColor;
	int height;
	
	public Cat(String color) {
		this.furColor = color;	//通过this访问成员变量，这里this可以省略
		this.cry();	//通过this调用成员方法，这里this可以省略
	}
	
	public Cat(String color, int height) {
		this(color);	//通过this调用其他构造方法;this(color)实际调用的构造函数Cat(String color)，必须是方法体的第一条语句
		this.height = height;	//通过this引用成员变量，这里this可以省略
	}
	
	public void cry() {
		System.out.println("我是一只" + this.furColor + "颜色的猫");
	}

	public void grow() {
		this.height++;	//通过this访问成员变量，这里this可以省略
		System.out.println("我长高了，身高为" + this.height);
	}
}
