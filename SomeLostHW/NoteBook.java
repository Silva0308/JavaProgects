public class Notebook {
    private String brand;
    private String model;
    private double price;
    private int ramSize;
    private int storageSize;

    // Конструктор класса
    public Notebook(String brand, String model, double price, int ramSize, int storageSize) {
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.ramSize = ramSize;
        this.storageSize = storageSize;
    }

    // Геттеры и сеттеры для доступа к полям класса
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getRamSize() {
        return ramSize;
    }

    public void setRamSize(int ramSize) {
        this.ramSize = ramSize;
    }

    public int getStorageSize() {
        return storageSize;
    }

    public void setStorageSize(int storageSize) {
        this.storageSize = storageSize;
    }

    // Метод для преобразования информации о ноутбуке в строку
    public String toString() {
        return "Notebook [brand=" + brand + ", model=" + model + ", price=" + price + ", RAM=" + ramSize + "GB, storage=" + storageSize + "GB]";
    }
}