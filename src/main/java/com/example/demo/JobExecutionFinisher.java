package com.example.demo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.batch.core.BatchStatus;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.listener.JobExecutionListenerSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

@Component
public class JobExecutionFinisher extends JobExecutionListenerSupport {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	@Override
	public void afterJob(JobExecution jobExecution) {
		// TODO Auto-generated method stub
		//super.afterJob(jobExecution);
		
		if(jobExecution.getStatus() == BatchStatus.COMPLETED) {
			System.err.println("jDDDDDDDDDDDDDDDDDDDDDDDDDddddddoneeeeeeeeeeeeeeee");

			
		}
	}

}
