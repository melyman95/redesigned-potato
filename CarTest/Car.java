public class Car {
    int year;
    String make;
    double gasCapacity;
    double gasLevel;
    double mpg;
    int speed;
    
    public Car(int year, String make, double gasCapacity, int speed, double mpg) {
        
        this.year = year;
        this.make = make;
        this.gasCapacity = gasCapacity;
        gasLevel = this.gasCapacity;
        this.mpg = mpg;
        this.speed = speed;
        
    }
    
    public int getYear() {
        return year;
    }
    
    public String getMake() {
        return make;
    }
    
    public double getGasCapacity() {
        return gasCapacity;
    }
    
    public double getGasLevel() {
        return gasLevel;
    }
    
    public double getMilesPerGallon() {
        return mpg;
    }
    
    public int getSpeed() {
        return speed;
    }
    
    public int accelerate() {
        getSpeed();
        speed += 5;
        if (speed > 180) {
            speed = 180;
        }
        
        return speed;
        
        }
  
    public int brake() {
        getSpeed();
        speed -= 5;
        if (speed < 0) {
            speed = 0;
        }
        
        return speed;
    }
    
    public double drive(int hours) {
        gasLevel -= speed * hours / mpg;
        
        return gasLevel;
    }
    
    public String toString() {
        getMake();
        getYear();
        getSpeed();
        
        return make + ": " + year + ": " + speed;
    }
 }   
    
