package com.walking.counterAggregation;

public class CounterService {
    //хранение массива доступных счетчиков
    private Counter[] counters;

    //конструктор
    public CounterService(Counter... counters) {
        this.counters = counters;
    }

    //добавление нового счетчика в массив
    public Counter addCounter(Counter counter){
        int newSizeArray = counters.length + 1;
        Counter[] newCounters = new Counter[newSizeArray];
        newCounters[newCounters.length-1] = counter;

        counters = copyArray(newCounters);

        return counters[counters.length-1];
    }

    private Counter[] copyArray(Counter[] counter){
        for (int i=0; i<counters.length; i++){
            counter[i] = counters[i];
        }

        return counter;
    }

    //получение всех доступных счетчиков
    public Counter[] getArCounter(){
        return counters;
    }

    //получение доступа к счетчику по названию
    public Counter getCounter(String p_name){
        for(int i=0; i< counters.length; i++){
            if (counters[i].getName().equals(p_name)){
                return counters[i];
            }
        }
        return null;
    }

    //увеличение значения счетчика на единицу
    public void setValueCounter(String p_name){
        setValueCounter(p_name, 1);
    }

    //увеличение значения счетчика на заданное значение
    public void setValueCounter(String p_name, int p_value){
        Counter counter = getCounter(p_name);
        counter.setValue(counter.getValue() + p_value);
    }

    //сброс счетчика до нулевого значения
    public void resetValueCounter(String p_name){
        Counter counter = getCounter(p_name);
        counter.setValue(0);
    }

}
