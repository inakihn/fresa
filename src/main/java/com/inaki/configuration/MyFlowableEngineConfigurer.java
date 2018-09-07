package com.inaki.configuration;

import com.inaki.listener.MyListener;
import org.flowable.spring.SpringProcessEngineConfiguration;
import org.flowable.spring.boot.EngineConfigurationConfigurer;
import org.springframework.context.annotation.Configuration;

import java.util.Collections;

@Configuration
public class MyFlowableEngineConfigurer implements EngineConfigurationConfigurer<SpringProcessEngineConfiguration> {

    public void configure(SpringProcessEngineConfiguration processEngineConfiguration) {
        // advanced configuration
        processEngineConfiguration.setEventListeners(Collections.singletonList(new MyListener()));
    }

}
