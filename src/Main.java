import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       /*** University, School, Car жана Person деген класс тузунуз

        Алардын свойстваларын ойлоп табыныз

        Геттер сеттерлерди маани беруу жана алуу учун колдонуу керек

        Ар бир класска 3-4 тон объект тузуп жана аларга маанилерин бериниз

        Ар бир класстын объектилерин оз-озунчо массивке салып, аларды консольго чыгарыныз*/
      //  Scanner scanner=new Scanner(System.in);
Person person=new Person("Asylbek",26,"M");
Person person1=new Person("Askar",21,"M");
Person person2=new Person("Nurik",25,"M");
University university=new University("Arabaev","Kievskiy 120",12);
University university1=new University("Bokonbaev","Chyi 10",15);
University university2=new University("Arabaev","Kievskiy 120",11);
School school=new School("Razzakov","Rizhskaya 27",30);
School school1=new School("Abdurashitov","Rizhskaya 21",340);
School school2=new School("Kozhoyarov","Rizhskaya 20",200);
Car car=new Car("Hyundai","Avante",11000);
Car car1=new Car("Hyundai","Sonata",12000);
Car car2=new Car("KIA","K5",9000);
Person[]baary={person,person1,person2};
        for (int i = 0; i < baary.length; i++) {
            System.out.println(baary[i].getFullname()+"\n"+baary[i].getAge()+"\n"+baary[i].getGender());
            System.out.println("-----------------------------------------------------------");
        }
     University[]universiti={university,university1,university2};
        for (int i = 0; i < universiti.length; i++) {
            System.out.println(universiti[i].getName()+"\n"+universiti[i].getAddress()+"\n"+universiti[i].getBagyty());
            System.out.println("--------------------------------------------------------------");
        }
        School[]schools={school,school1,school2};
        for (int i = 0; i < schools.length ; i++) {
            System.out.println(schools[i].getName()+"\n"+schools[i].getAddres()+"\n"+schools[i].getKlass());
            System.out.println("------------------------------------------------------------------");
        }
        Car[]cars={car,car1,car2};
        for (int i = 0; i < cars.length ; i++) {
            System.out.println(cars[i].getModel()+"\n"+cars[i].getMarka()+"\n"+cars[i].getPrice());
        }
    }
}