package controllerss;
import models.Car;

public class CarController {
  public void sortByName(Car[] cars) {
        int n = cars.length;
        for (int i = 0; i < n - 1; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if ((cars[j].getBrand().compareToIgnoreCase(cars[min].getBrand()))<0) {
                    min = j;
                }
            }
            Car temp = cars[min];
            cars[min] = cars[i];
            cars[i] = temp;
        }
  }

  public void printArrayCars(Car[] cars){
    int n = cars.length;
    for(int i = 0; i < n; i++){
      System.out.println(cars[i]);
    }
  }
}

