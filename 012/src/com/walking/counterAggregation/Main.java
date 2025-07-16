/*
* –Разработать программу в рамках компании walking/com, позвол¤ющую следить за счетчиками на газ, холодную воду, гор¤чую воду и электричество. ќбозначение программы в рамках компании Ч counterAggregation.
»спользу¤ за основу задачу(https://github.com/KFalcon2022/practical-tasks/tree/master/src/com/walking/lesson8_classes_objects) из темы про классы и объекты, реализовать класс счетчика, который хранит название счетчика и его значение, его единицы измерени¤, а также обеспечивает доступ к значени¤м. Ќазвание счетчика и его единицы измерени¤ должны быть неизменны.
“акже реализовать сервис CounterService, зона ответственности которого Ч хранение массива доступных счетчиков, получение всех доступных счетчиков, получение доступа к счетчику по названию, увеличение значени¤ счетчика на единицу или заданное значение, а также сброс счетчика до нулевого значени¤.
ќтветственность класса, содержащего main() Ч создание счетчиков. —ам класс также предлагаю назвать Main.
“акже реализовать в классе Main приватный метод, который позвол¤ет вывести значени¤ счетчиков в виде:
    <Ќазвание счетчика>: <«начение счетчика>
Ќапример:
  √аз: 2333
  √ор¤ча¤ вода: 0
  ’олодна¤ вода: 23
* */
package com.walking.counterAggregation;

import com.walking.counterAggregation.Counter;
import com.walking.counterAggregation.CounterService;

public class Main {
    public static void main(String[] args){
        Counter counterColdWater = new Counter("Холодная вода", 1, "куб/м");
        Counter counterHotWater = new Counter("Горячая вода", 0, "куб/м");
        Counter counterElectric = new Counter("Электричество", 100, "кВт");


        CounterService сounterService = new CounterService(counterColdWater, counterHotWater);
        сounterService.addCounter(counterElectric);
        сounterService.setValueCounter("Электричество", 200);
        сounterService.setValueCounter("Горячая вода", 3);

        displayinfo(сounterService.getArCounter());
    }

    private static void displayinfo(Counter[] counter){
        for (int i=0; i < counter.length; i++){
            System.out.printf("%s: %d %s \n", counter[i].getName(), counter[i].getValue(), counter[i].getUnit());
        }

        //forech
        for (Counter i: counter) System.out.printf("%s: %d %s \n", i.getName(), i.getValue(), i.getUnit());
    }

}
