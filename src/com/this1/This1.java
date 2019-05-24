package com.this1;
/*
 * 当一个对象创建后，Java虚拟机给这个对象分配一个引用自身的指针，这个指针的名字就是this
 * this代表实例对象自身
 */
public class This1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat garfield = new Cat("黄", 12);
		garfield.grow();
		garfield.grow();
	}

}
