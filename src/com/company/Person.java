package com.company;

public class Person {
    public String name;
    private Integer age;

    public Person(String _name) {
        name = _name;
        System.out.println("Person is created");
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }
// set age to 0 if the _age is invalid ( less than zero and greater than 100)

    public void setAge(Integer _age) {
        if (_age < 0 || _age > 100) {
            age = 0;
        } else {
            age = _age;
        }
// alternative if  / else
// age = _age < 0 || _age > 100 ? 0 : age


    }
}