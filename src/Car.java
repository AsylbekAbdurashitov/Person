public class Car {
    private String model;
    private String marka;
    private int price;
    public  Car(String model,String marka,int price){
        this.model=model;
        this.marka=marka;
        this.price=price;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getMarka() {
        return marka;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", marka='" + marka + '\'' +
                ", price=" + price +
                '}';
    }
}
