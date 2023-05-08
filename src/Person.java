public class Person {
    private String fullname;
   private int age;
    private String gender;
    public Person(String fullname,int age,String gender ){
        this.fullname=fullname;
        this.age=age;
        this.gender=gender;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getFullname() {
        return fullname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "Person{" +
                "fullname='" + fullname + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }
}






