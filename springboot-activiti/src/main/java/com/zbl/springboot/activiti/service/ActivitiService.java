package com.zbl.springboot.activiti.service;

import org.activiti.engine.RuntimeService;
import org.activiti.engine.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author zhaobaolong
 * @Title: ActivitiService
 * @ProjectName springboot
 * @Description:  工作流Service
 * @date 2018/12/615:07
 */
@Service
public class ActivitiService {
	@Autowired
	RuntimeService runtimeService;
	@Autowired
	TaskService taskService;

}
