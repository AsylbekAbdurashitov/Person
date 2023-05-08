public class University {
    private String name;
    private String address;
    private int bagyty;
    public University(String name,String address,int bagyty){
        this.name=name;
        this.address=address;
        this.bagyty=bagyty;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setBagyty(int bagyty) {
        this.bagyty = bagyty;
    }

    public int getBagyty() {
        return bagyty;
    }

    @Override
    public String toString() {
        return "University{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", bagyty=" + bagyty +
                '}';
    }
}
