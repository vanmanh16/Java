
public class Person {
    private String name;
    private String quequan;
    private Integer age;

    public Person() {
    }

    public Person(String name, String quequan, Integer age) {
        this.name = name;
        this.quequan = quequan;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getQuequan() {
        return quequan;
    }

    public void setQuequan(String quequan) {
        this.quequan = quequan;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
