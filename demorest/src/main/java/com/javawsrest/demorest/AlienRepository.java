package com.javawsrest.demorest;

import java.util.ArrayList;
import java.util.List;

public class AlienRepository {
	
	List<AlienClass> aliens;

	public AlienRepository() {
		
		aliens = new ArrayList<>();
		
		AlienClass a1 = new AlienClass();
		a1.setName("Paras J");
		a1.setAge(31);
		a1.setStatus("Married");
		
		AlienClass a2 = new AlienClass();
		a2.setName("Laddu J");
		a2.setAge(30);
		a2.setStatus("Married");
		
		aliens.add(a1);
		aliens.add(a2);
	}
	
	public List<AlienClass> getAliens()
	{
		return aliens;
	}
	
	public AlienClass getAlien(int age)
	{
		for(AlienClass a : aliens) 
		{
			if(a.getAge()==age)
			{
				return a;
			}
		}
		
		return new AlienClass();
	}

	public void create(AlienClass a1) {
		// TODO Auto-generated method stub
		
		aliens.add(a1);
	}

}
