package com.yusys.demo1;

public class ThreadDemo2 {
	public static void main(String[] args) {
		//创建线程实例， 启动线程
		MyThread2 mythread2 =new MyThread2(100);
		Thread thread =new Thread(mythread2);
		thread.setName("小黑");
		
		thread.start();
		/*--------------------------------------------*/
		MyThread2 mythread22 =new MyThread2(200);
		Thread thread2 =new Thread(mythread22);
		thread2.setName("小红");
		
		thread2.start();	
		
	}
}
