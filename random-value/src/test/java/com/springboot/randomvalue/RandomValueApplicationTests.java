package com.springboot.randomvalue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RandomValueApplicationTests {

    @Autowired
    private RandomValue randomValue;

    @Test
    public void testRandomValue() {
        System.out.println("random.value:" + randomValue.getRandomValue());
        System.out.println("random.int:" + randomValue.getRandomInt());
        System.out.println("random.long:" + randomValue.getRandomLong());
        System.out.println("random.uuid:" + randomValue.getRandomUUID());
        System.out.println("random.int.less.than:" + randomValue.getRandomIntLessThan());
        System.out.println("random.int.range:" + randomValue.getRandomIntRange());
    }
}
