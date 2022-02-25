package com.bridgelabz.stopwatch;

import java.util.Date;
import java.util.Scanner;

public class StopWatch {
	
		public static void main(String[] args) {
			
			StopWatch stopWatch = new StopWatch(); 
			
			Scanner sc = new Scanner(System.in); 
			System.out.println("Enter the 's' for start the stopwatch!!!!");
			String isStart = sc.nextLine(); 
			
			while (!(isStart.length() == 1 && isStart.equals("s"))) {
			System.out.println("Please enter the valid input for starting the stopwatch!!!!"); 
			isStart = sc.nextLine(); 
			
			}
			
			System.out.println("Stopwatch started now, Enter 'e' to end the stopwatch!!!"); 
			Date startTime = stopWatch.noteTime(); 
			String isEnd = sc.nextLine();  
			
			while (!(isEnd.length() == 1 && isEnd.equals("e"))) {
				System.out.println("Please enter the valid input for ending the stopwatch!!!!");
				isEnd = sc.nextLine(); 
			}
			Date endTime = stopWatch.noteTime(); 
		 
			long timeDiff = endTime.getTime() - startTime.getTime();
			int diffInSec = (int) timeDiff / 1000; 
			System.out.println("Stopwatch time => " + stopWatch.getStopWatchTime(diffInSec)); 
			
			sc.close(); 
		}
		
		private String getStopWatchTime(int diffInSec) {
			int h = 0, m = 0, s = 0; 
			
			if (diffInSec > 60) {
				m = diffInSec / 60; 
				s = diffInSec % 60; 
				if (m > 60) {
					h = m / 60; 
					m = m % 60; 
				}	
		} else {
			s = diffInSec;
		}
			return h + ":" + m + ":" + s; 
		}
		private Date noteTime() {
			Date startTime = new Date(System.currentTimeMillis()); 
			return startTime; 
		}

}
