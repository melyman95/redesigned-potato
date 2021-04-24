// CPW 143
// Programming Assignment 3
// Author: Ken Meerdink
// Purpose: This program tests the Car class.
//   What it tests: 
//     constructor, 
//     accessors (getters) for all fields of Car,
//     mutators (setters) for speed:
//       accelerate and brake 

public class CarTest {
    public static void main( String[] args ) {
        
        // construct some cars
                         // year   make  gasCap speed mpg
        Car ford = new Car( 1964, "Ford", 20,   96,   15 );
        Car audi = new Car( 2017, "Audi", 15,   128,  30 );
        Car chevy = new Car( 1957, "Chevy", 18, 66,   22 );
        Car toyota = new Car( 2018, "Toyota", 12, 42, 42 );
        Car Honda = new Car( 1995, "Honda", 40,   44,   20 );
        
        // test toString method
        System.out.println( "After constructing the cars:" );
        System.out.println( "Ford: " + ford );
        System.out.println( "Audi: " + audi );
        System.out.println( "Chevy: " + chevy );
        System.out.println( "Toyota: " + toyota );
        System.out.println( "Honda: " + Honda);
        
        // test getters..chevy
        System.out.println( "Test accessors with Chevy:" );
        System.out.println( "Chevy year: " + chevy.getYear() );
        System.out.println( "Chevy make: " + chevy.getMake() );
        System.out.println( "chevy speed: " + chevy.getSpeed() );
        //ford
        System.out.println( "Test accessors with Ford:" );
        System.out.println( "Ford year: " + ford.getYear() );
        System.out.println( "Ford make: " + ford.getMake() );
        System.out.println( "Ford speed: " + ford.getSpeed() );
        //audi
        System.out.println( "Test accessors with Audi:" );
        System.out.println( "Audi year: " + audi.getYear() );
        System.out.println( "Audi make: " + audi.getMake() );
        System.out.println( "Audi speed: " + audi.getSpeed() );
        //toyota
        System.out.println( "Test accessors with Toyota:" );
        System.out.println( "Toyota year: " + toyota.getYear() );
        System.out.println( "Toyota make: " + toyota.getMake() );
        System.out.println( "Toyota speed: " + toyota.getSpeed() );
        
        System.out.println( "Test accessors with Honda:" );
        System.out.println( "Honda year: " + Honda.getYear() );
        System.out.println( "Honda make: " + Honda.getMake() );
        System.out.println( "Honda speed: " + Honda.getSpeed() );           
        
        // test accelerate method
        ford.accelerate();
        System.out.println( "After accelerating the Ford once:" );
        System.out.println( ford );
     
        // test brake method
        ford.brake();
        System.out.println( "After braking the Ford once:");
        System.out.println( ford );
        
        for ( int i = 0; i < 16; i++ ) {
            ford.accelerate();
        }
        
        System.out.println( "After accelerating the Ford 16 times:" );
        System.out.println( ford );
        
        for ( int i = 0; i < 10; i++ ) {
            audi.accelerate();
        }
        System.out.println( "After accelerating the Audi 10 times:" );
        System.out.println( audi );
        
        for ( int i = 0; i < 5; i++ ) {
            audi.brake();
        }
        System.out.println( "After braking the Audi 5 times:" );
        System.out.println( audi );
        
        for ( int i = 0; i < 15; i++ ) {
            audi.brake();
        }
        System.out.println( "After braking the Audi another 15 times:" );
        System.out.println( audi );
        
        // stop the audi
        while ( audi.getSpeed() > 0 ) {
            audi.brake();
        }
        System.out.println( "After braking the Audi till it stops:" );
        System.out.println( audi );
        
        // test drive method
        System.out.println( "Chevy gas before 2 hour drive: " + chevy.getGasLevel() );
        chevy.drive( 2 );
        System.out.println( "Chevy gas after 2 hour drive: " + chevy.getGasLevel() );
        
        // Extra credit work goes here:
        //Honda
        Honda.accelerate();
        System.out.println( "After accelerating the Honda once:" );
        System.out.println( Honda );
        for ( int i = 0; i < 16; i++ ) {
            Honda.accelerate();
        }
        System.out.println( "After accelerating the Honda 16 times:" );
        System.out.println( Honda );
        
        for ( int i = 0; i < 5; i++ ) {
            Honda.brake();
        }
        System.out.println( "After braking the Honda 5 times:" );
        System.out.println( Honda );
        
        for ( int i = 0; i < 15; i++ ) {
            Honda.brake();
        }
        System.out.println( "After braking the Honda 15 times:" );
        System.out.println( Honda );
        
        while ( Honda.getSpeed() > 0 ) {
            Honda.brake();
        }
        System.out.println( "After braking the Honda until it stops:" );
        System.out.println( Honda );

    }
}