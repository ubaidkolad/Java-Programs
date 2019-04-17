public class Car implements Vehicle
{
    int speed, gear,wheels;
    Car()
    {
       // noOfWheels = wheels;
    }

    public void applyBrakes()
    {
        speed = 0;
    }

    public void increaseSpeed(int speed)
    {
        this.speed = this.speed + speed;
        System.out.println("The speed of the car is " + this.speed);
    }

    public void decreaseSpeed(int speed)
    {
        this.speed = this.speed - speed;
        System.out.println("The speed of the car is " + this.speed);
    }

    public void changeGear(int gear)
    {
        this.gear=this.gear+gear;
        System.out.println("The car is running on gear "+this.gear);
    }
}