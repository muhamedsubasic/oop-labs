package Lab4.people;

public class Person {
    private String name;
    private String street;
    private int age;
    private String country;
    public Person(String name, String street) {
        this.name = name;
        this.street = street;
    }

    public int getAge(){
        return this.age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public String getCountry(){
        return this.country;
    }

    public void setCountry(String country){
        this.country = country;
    }

    @Override
    public String toString(){
        return this.name +"\n "+ this.street;
    }
}