package Model;

import java.util.Random;

public class MyList implements IList{
    public MyList() {
    }

    @Override
    public void compareArray(double firstArray, double secondArray) {
        if(firstArray == secondArray){
            System.out.println("Средние значения равны");
        }
        else if(firstArray > secondArray){
            System.out.println("Первый список имеет большее среднее значение");
        }
        else{
            System.out.println("Второй список имеет большее среднее значение");
        }
    }

    @Override
    public double averageArray(int[] array) {
        double sum = 0;
        for (double value: array) {
            sum += value;
        }

        double resultValue = sum/array.length;
        System.out.println("Среднее значение списка равно: " + resultValue);
        return resultValue;
    }

    public int[] createArray() {
        Random random = new Random();
        int[] array = random.ints(0,101).distinct().limit(10).toArray();
        return array;
    }
}
