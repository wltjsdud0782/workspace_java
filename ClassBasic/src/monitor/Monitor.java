package monitor;

public class Monitor {
    private String brand;
    private int price;
    private String color;

    public Monitor(String brand, int price, String color) {
        this.brand = brand;
        this.price = price;
        this.color = color;
    }

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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void showInfo(){
        System.out.println("제조사 : " + brand);
        System.out.println("가격 : " + price);
        System.out.println("색상 : " + color);
    }


}
