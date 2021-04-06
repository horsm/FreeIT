package com.freeit.lesson6.annotations;

/*
Класс MyService должен иметь переменные c private модификаторами,
конструктор по умолчанию, get и set методы,
переопределенные методы equals и hashcode,
а так же private метод (private thisClassInfo), который будет просто печатать данные о
самом классе (данные любые на ваш выбор), в котором он определен.
 */

import java.util.Objects;

@Version(numberVersion = 1.0, codeName = "OZON")
public class MyService {
    private String nameProduct;
    private int priceProduct;
    private int discountProduct;

    public MyService() {
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public int getPriceProduct() {
        return priceProduct;
    }

    public void setPriceProduct(int priceProduct) {
        this.priceProduct = priceProduct;
    }

    public int getDiscountProduct() {
        return discountProduct;
    }

    public void setDiscountProduct(int discountProduct) {
        this.discountProduct = discountProduct;
    }

    public String thisClassInfo() {
        return "MyService: " +
                "\nНазвание товара = " + nameProduct +
                "\nЦена товара = " + priceProduct + "$" +
                "\nскидка на товар = " + discountProduct + "%";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyService myService = (MyService) o;
        return priceProduct == myService.priceProduct && discountProduct == myService.discountProduct && Objects.equals(nameProduct, myService.nameProduct);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameProduct, priceProduct, discountProduct);
    }
}
