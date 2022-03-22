package com.company;

public class Main {

    public static void main(String[] args) {
        //создаем три одномерных массива с набором слов
	String [] wordListOne = {"круглосуточный,", "трех - звездный,", "прелестный,","иновационный,", "умный,"};
    String [] wordListTwo = {"ориентированый", "идеальный", "объектно - ориентированный", "классный"};
    String [] wordListThree = {"продукт", "бизнес", "секс", "деушка", "автомобиль"};
        //вычисляем сколько слов в каждом массиве
    int oneLength = wordListOne.length;
    int twoLength = wordListTwo.length;
    int threeLength = wordListThree.length;
        //генерируем три случайных числа
        int raid1 = (int) (Math.random() * oneLength);
        int raid2 = (int) (Math.random() * twoLength);
        int raid3 = (int) (Math.random() * threeLength);
        //строим фразу
        String phrase = wordListOne[raid1] + " " + wordListTwo[raid2] + " " + wordListThree[raid3];
        //выводим фразу на экран
        System.out.println("Все, что нам нужно, это " + phrase);
    }
   }
