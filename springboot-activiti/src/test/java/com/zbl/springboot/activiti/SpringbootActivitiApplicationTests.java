package com.zbl.springboot.activiti;

import org.activiti.engine.ProcessEngine;
import org.activiti.engine.RepositoryService;
import org.activiti.engine.RuntimeService;
import org.activiti.engine.repository.DeploymentBuilder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootActivitiApplicationTests {
	@Autowired
	RuntimeService runtimeService;
	@Autowired
	ProcessEngine processEngine;
	@Test
	public void createTask(){

	}
	@Test
	public void contextLoads() {
		RepositoryService repositoryService = processEngine.getRepositoryService();
		DeploymentBuilder deployment = repositoryService.createDeployment();
		DeploymentBuilder deploymentBuilder = deployment.addClasspathResource("processes/demo.bpmn")
				.addClasspathResource
				("processes/demo.png");

		deploymentBuilder.deploy();

	}
	@Test
	public  void  startTest(){

	}


}
