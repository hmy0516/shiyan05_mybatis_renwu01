package com.hanlu.pojo;

/**
 * @author HMY
 * @date 2018/12/18-23:19
 */
public class Student {

    int id5;
    String snum5;
    String name5;
    int age5;
    String intro5;

    @Override
    public String toString() {
        return "Student{" +
                "id5=" + id5 +
                ", snum5='" + snum5 + '\'' +
                ", name5='" + name5 + '\'' +
                ", age5=" + age5 +
                ", intro5='" + intro5 + '\'' +
                '}';
    }

    public int getId5() {
        return id5;
    }

    public void setId5(int id5) {
        this.id5 = id5;
    }

    public String getSnum5() {
        return snum5;
    }

    public void setSnum5(String snum5) {
        this.snum5 = snum5;
    }

    public String getName5() {
        return name5;
    }

    public void setName5(String name5) {
        this.name5 = name5;
    }

    public int getAge5() {
        return age5;
    }

    public void setAge5(int age5) {
        this.age5 = age5;
    }

    public String getIntro5() {
        return intro5;
    }

    public void setIntro5(String intro5) {
        this.intro5 = intro5;
    }
}
