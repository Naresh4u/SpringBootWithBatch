package com.springbatch.demo.controller;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping("/employee/")
@ActiveProfiles(value = "development")
public class EmployeeController {
	
	@Autowired
	Job job;
	
	@Autowired
	JobLauncher jobLauncher;

	@RequestMapping(value = "/launchJob", method = RequestMethod.POST)
	@ApiOperation(value = "Simple Batch Job service", notes = "Returns a success message. SLA:500", response = String.class)
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Batch Job is executed successfully", response = String.class),
			@ApiResponse(code = 400, message = "Invalid Input Provided"),
			@ApiResponse(code = 404, message = "Does Not Exist") })
	public String handle() throws Exception {

		try {
			JobParameters jobParameters = new JobParametersBuilder().addLong("time", System.currentTimeMillis())
					.toJobParameters();
			jobLauncher.run(job, jobParameters);
		} catch (Exception e) {
		//yet to done
		}

		return "Hello Boss !!! Conversion is Done, Is there anything i can help you with ? ";
	}
	
	@RequestMapping(value = "/importJob", method = RequestMethod.POST)
	@ApiOperation(value = "Import Data From DB Job service", notes = "Returns a success message. SLA:500", response = String.class)
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Job is executed successfully", response = String.class),
			@ApiResponse(code = 400, message = "Invalid Input Provided"),
			@ApiResponse(code = 404, message = "Does Not Exist") })
	public String importDataFromDBJob() throws Exception {

		try {
			JobParameters jobParameters = new JobParametersBuilder().addLong("time", System.currentTimeMillis())
					.toJobParameters();
			jobLauncher.run(job, jobParameters);
		} catch (Exception e) {
		//yet to done
		}

		return "Hello Boss !!! Conversion is Done, Is there anything i can help you with ? ";
	}

}
