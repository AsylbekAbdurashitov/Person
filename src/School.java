public class School {
    private String name;
    private String addres;
    private int klass;
public School(String name,String addres,int klass){
    this.name=name;
    this.addres=addres;
    this.klass=klass;
}
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAddres(String addres) {
        this.addres = addres;
    }

    public String getAddres() {
        return addres;
    }

    public void setKlass(int klass) {
        this.klass = klass;
    }

    public int getKlass() {
        return klass;
    }

    @Override
    public String toString() {
        return "School{" +
                "name='" + name + '\'' +
                ", addres='" + addres + '\'' +
                ", klass=" + klass +
                '}';
    }
}
