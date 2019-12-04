package com.yusys.demo1;

public class ThreadDemo {
	public static void main(String[] args) {
		//创建线程实例
		MyThread myThread =new MyThread();
		//修改线程名称
		myThread.setName("Z");
		//启动线程
		myThread.start();
		
		MyThread myThread2 =new MyThread();
		myThread2.setName("L");
		myThread2.start();
	}
}
