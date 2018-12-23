package com.springboot.randomvalue;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author: wyc
 * @date: 2018/12/21
 */
@Component
public class RandomValue {

    @Value("${random.value}")
    private String randomValue;

    @Value("${random.int}")
    private Integer randomInt;

    @Value("${random.long}")
    private Long randomLong;

    @Value("${random.uuid}")
    private String uuid;

    @Value("${my.number.less.than.ten}")
    private int randomIntLessThan;

    @Value("${my.number.range}")
    private Integer randomIntRange;

    public String getRandomValue() {
        return randomValue;
    }

    public Integer getRandomInt() {
        return randomInt;
    }

    public Long getRandomLong() {
        return randomLong;
    }

    public String getRandomUUID(){
        return uuid;
    }

    public int getRandomIntLessThan() {
        return randomIntLessThan;
    }

    public int getRandomIntRange() {
        return randomIntRange;
    }
}
