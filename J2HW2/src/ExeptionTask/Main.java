package ExeptionTask;

import ExeptionTask.Exeptions.MyArrayDataException;
import ExeptionTask.Exeptions.MyArraySizeException;


public class Main {
    public static void main(String[] args) throws MyArraySizeException, MyArrayDataException {

        String[][] arr = new String[][]{
                {"00", "01", "02", "03"},
                {"04", "05", "06", "07"},
                {"08", "09", "10", "11"},
                {"12", "13", "14", "15"}};


        int sum = 0;
        if (arr.length != 4) {
            throw new MyArraySizeException("Размер массива должен быть 4x4");
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length != 4) {
                throw new MyArraySizeException("Ошибка. Размер массива должен быть 4x4");
            }
            for (int j = 0; j < arr[i].length; j++) {
                try {
                    sum +=  Integer.parseInt(arr[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("Ошибка. Все значение массива должны быть int");
                }
            }

        }
        System.out.println("Сумма всех значений массива равна:  " + sum);
    }
}

