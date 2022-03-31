package VehicleCatalogue;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String input=sc.nextLine();
        List<Vehicle> cars=new ArrayList<>();


        while (!input.equals("End")){
            String[] carInfo=input.split(" ");
            int speed=Integer.parseInt(carInfo[3]);
            if (carInfo[0].equals("car")) {
                Vehicle cCar = new Vehicle("Car", carInfo[1], carInfo[2], speed);
                cars.add(cCar);
            }else {
                Vehicle cCar = new Vehicle("Truck", carInfo[1], carInfo[2], speed);
                cars.add(cCar);
            }
            input=sc.nextLine();
        }



        while (!input.equals("Close the Catalogue")) {
            input = sc.nextLine();
            for (int i = 0; i < cars.size(); i++) {
                if (cars.get(i).getModel().equals(input)) {
                    System.out.println(cars.get(i));
                    if (cars.get(i).getType().equals("Truck")) {

                    } else {

                    }

                }

            }
        }
        double carHP=horsepowerSum(cars,"Car");
        double truckHP=horsepowerSum(cars,"Truck");



            System.out.println(String.format("Cars have average horsepower of: %.2f.",carHP));
            System.out.println(String.format("Trucks have average horsepower of: %.2f.",truckHP));


    }

    private static double horsepowerSum(List<Vehicle> cars, String type) {
        double sum=0.0;
        int count=0;
        for (Vehicle car:cars) {
            if (car.getType().equals(type)){
                count++;
                sum+=car.getHorsepower();
            }
        }
        if (count>0){
           return sum/=count;
        }else {
            return 0;
        }
    }
}
