package com.wipro.menudemo;

import java.util.List;

public class OddThreadProcessor extends Thread {

	List<Integer> proceeList=null;
	
	
	
	public OddThreadProcessor(List<Integer> proceeList) {
		super();
		this.proceeList = proceeList;
	}



	public void run() 
	{
		int j=0;
		for(int i:proceeList)
		{
			if(i%2!=0)
			{
				i=i+1;
				proceeList.set(j, i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			j++;
		}
		
	}
}
