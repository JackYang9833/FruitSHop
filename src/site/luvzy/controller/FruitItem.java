package site.luvzy.controller;

/**
 * @ Author:ytz
 * @ Date:2021/6/16
 * @ Description:
 * @ Version:1.0
 */
public class FruitItem {
    private String name;
    private String unit;
    private int price;
    private int number;

    public FruitItem(String name, String unit, int price, int number) {
        this.name = name;
        this.number = number;
        this.unit = unit;
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getUnit() {
        return unit;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}
