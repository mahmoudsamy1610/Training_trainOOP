package CarExample;

public class Main {

    public static void main(String[] args){

        Car c1 = new Car("2020") ;
        c1.color = "blue" ;
        c1.speed = 220 ;

        c1.brake();
        c1.TurnOff();

        Car c2 = new Car() ;
        c2.color = "yellow" ;
        c2.speed = 300 ;

        c2.brake();
        c2.TurnOff();
    }

}
