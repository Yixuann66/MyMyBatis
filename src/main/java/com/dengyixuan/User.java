package com.dengyixuan;/**
 * @Author 85067
 * @create 20/04/2023 11:50
 */

/**
 * @author 85067
 * @version 1.0
 * @description: TODO
 * @date 20/04/2023 11:50
 */
public class User {
    private Integer id;
    private String name;
    private Integer age;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public User(Integer id, String name, Integer age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
