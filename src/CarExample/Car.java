package CarExample;

public class Car {

    int speed;
    String color ;
    String model;

    // default constructor
    public Car () {
        this.model = model ;
    }

    //special constructor with arguments
        public Car (String model) {
            this.model = model ;
        }


       void TurnOn() {
           System.out.println("Car is ON") ;
       }

       void brake() {
           System.out.println("car braking");
       }

    void TurnOff() {
        System.out.println("Car is OFF") ;
    }


}

