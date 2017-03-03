package com.github.xipengyang.demo.steps;

import com.github.xipengyang.demo.config.ApplicationConfig;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootContextLoader;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by davidyang on 3/03/17.
 */
@RunWith(SpringRunner.class)
@ContextConfiguration(classes = ApplicationConfig.class, loader = SpringBootContextLoader.class)
@SpringBootTest
public class BaseStep {
}
