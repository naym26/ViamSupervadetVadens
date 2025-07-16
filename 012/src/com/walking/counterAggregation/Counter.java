package com.walking.counterAggregation;

public class Counter {
    //поля класса
    private String name;
    int value;
    private String unit;

    //конструктор
    Counter(String p_name, int p_value, String p_unit){
        setName(p_name);
        setValue(p_value);
        setUnit(p_unit);
    }

    //сеттеры
    private void setName(String name) {
        this.name = name;
    }

    public void setValue(int value) {
        this.value = value;
    }

    private void setUnit(String unit) {
        this.unit = unit;
    }
    /*сеттеры конец*/

    /*геттеры*/
    public String getName() {
        return name;
    }

    public int getValue() {
        return value;
    }

    public String getUnit(){
        return unit;
    }
    /*геттеры конец*/
}
