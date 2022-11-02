package com.example.demo;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class Concurrencyy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Runnable task = () -> {
//		    String threadName = Thread.currentThread().getName();
//		    System.out.println("Thread name" + threadName);
//		};
//
//		task.run();
//
//		Thread thread = new Thread(task);
//		thread.start();
//
//		System.out.println("Done!");
		
		
		ExecutorService executor = Executors.newSingleThreadExecutor();
		executor.submit(() -> {
		    String threadName = Thread.currentThread().getName();
		    System.out.println("Hello " + threadName);
		});
		
		//shutdown waits till the current job to finish after that it will shut down
		//all the process
		try {
		    System.out.println("attempt to shutdown executor");
		    executor.shutdown();
		    executor.awaitTermination(0, TimeUnit.SECONDS);
		}
		catch (InterruptedException e) {
		    System.err.println("tasks interrupted");
		}
		finally {
		    if (!executor.isTerminated()) {
		        System.err.println("cancel non-finished tasks");
		    }
		    executor.shutdownNow();
		    System.out.println("shutdown finished");
		}
		
		
		//Feture
		
		//executor is interface -->we can intreact with thread pools
		ExecutorService execute=Executors.newSingleThreadExecutor();
	
		//executorservice provides facility for the asynchronous execution of process
		
		Future<String> future=execute.submit(()->{
			Thread.sleep(10000);
			return "Completed";
		});
		 
		try {
			//checking task is done or not
			while(!future.isDone()) {
				System.out.println("Hey your task still pending");
				Thread.sleep(500);
			}
			System.out.println("Task Completed ?="+future.get());
			
			execute.shutdown();
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
	}

}
