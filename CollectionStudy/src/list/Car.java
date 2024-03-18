package list;

public class Car {
    private String brand;
    private int price;
    private String modelName;

    //모든 변수를 변경할 수 있는 생성자
    public Car(String brand, int price, String modelName) {
        this.brand = brand;
        this.price = price;
        this.modelName = modelName;
    }

    //setter, getter
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }

    public String getModelName() {
        return modelName;
    }
    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    //toString 메소드 오버라이딩
    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", price=" + price +
                ", modelName='" + modelName + '\'' +
                '}';
    }
}
