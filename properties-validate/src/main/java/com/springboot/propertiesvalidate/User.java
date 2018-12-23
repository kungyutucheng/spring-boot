package com.springboot.propertiesvalidate;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * @author: wyc
 * @date: 2018/12/23
 */
@ConfigurationProperties("user")
@Validated
@Component
public class User {


    /**
     * 注意此处的NotNull是javax.validation.constraints.NotNull
     */
    @NotNull
    private String userName;

    private Integer age;

    private Date birthDay;

    /**
     * Valid加不加均可，但官方建议加上
     */
    @Valid
    private School school;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Date getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(Date birthDay) {
        this.birthDay = birthDay;
    }

    public School getSchool() {
        return school;
    }

    public void setSchool(School school) {
        this.school = school;
    }

    //静态类确保在启动的时候就能进行校验，而不是等到内置类School被实例化之后才进行校验
    public static class School{
        @NotNull
        private String name;

        private String address;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        @Override
        public String toString() {
            return "School{" +
                    "name='" + name + '\'' +
                    ", address='" + address + '\'' +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", age=" + age +
                ", birthDay=" + birthDay +
                ", school=" + school +
                '}';
    }
}
