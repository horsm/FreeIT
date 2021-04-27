package com.freeit.lesson5.human;

import com.freeit.lesson5.human.footwear.IFootWear;
import com.freeit.lesson5.human.jacket.IJacket;
import com.freeit.lesson5.human.trousers.ITrousers;

public class Human implements IHuman{
    private String name;
    private IFootWear footWear;
    private IJacket jacket;
    private ITrousers trousers;

    public Human(String name, IFootWear footWear, IJacket jacket, ITrousers trousers) {
        this.name = name;
        this.footWear = footWear;
        this.jacket = jacket;
        this.trousers = trousers;
    }

    public Human() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public IFootWear getFootWear() {
        return footWear;
    }

    public void setFootWear(IFootWear footWear) {
        this.footWear = footWear;
    }

    public IJacket getJacket() {
        return jacket;
    }

    public void setJacket(IJacket jacket) {
        this.jacket = jacket;
    }

    public ITrousers getTrousers() {
        return trousers;
    }

    public void setTrousers(ITrousers trousers) {
        this.trousers = trousers;
    }

    @Override
    public void getDressed() {
        footWear.putOn();
        jacket.putOn();
        trousers.putOn();
    }

    @Override
    public void unDressed() {
        footWear.takeOff();
        jacket.takeOff();
        trousers.takeOff();
    }

    @Override
    public int getPrice() {
        int price = footWear.getPrice() + jacket.getPrice() + trousers.getPrice();
        return price;
    }
}
