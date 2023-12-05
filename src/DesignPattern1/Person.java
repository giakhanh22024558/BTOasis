package DesignPattern1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * This code use Composite Design Pattern
 */
public class Person {
    protected String name;
    protected String sex;
    protected int age;
    protected String Dob;
    protected HashMap<Person, String> relationShip = new HashMap<>();
    protected List<Person> parent = new ArrayList<>();
    protected List<Person> children = new ArrayList<>();
    protected Person partner = null;

    public Person(String name, String sex, int age, String dob) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.Dob = dob;
    }

    public void isMarriedTo(Person p) {
        this.partner = p;
    }

    public void haveParent(Person p) {
        parent.add(p);
    }

    public void haveChildren(Person p) {
        children.add(p);
    }

    public List<Person> getParent() {
        return parent;
    }

    public List<Person> getChildren() {
        return children;
    }

    public Person getPartner() {
        return partner;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDob() {
        return Dob;
    }

    public void setDob(String dob) {
        Dob = dob;
    }


}
