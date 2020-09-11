package com.example.demo;

import org.springframework.batch.item.ItemProcessor;

public class Processor implements ItemProcessor<Person,Person>{

	@Override
	public Person process(Person item) throws Exception {
		// TODO Auto-generated method stub
		item.getFirstName().toUpperCase();
		item.getLastName().toUpperCase();
		item.getEmail().concat("laura");
		return item;
	}

	

}
