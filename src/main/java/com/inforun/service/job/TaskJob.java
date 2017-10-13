package com.inforun.service.job;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @Author: wilburli
 * @Description:
 * @Date: Created by sh on 2017/10/13.
 */
@Service("taskJob")
public class TaskJob {

    public void doJob(){
        System.out.println("=========this is taskJob==========");
    }


}
