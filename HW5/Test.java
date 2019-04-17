class Test
{
    public static void main(String[] args) 
    {
        Dog d = new Dog();
        d.makeNoise();
        d.roam();
        
        Rhino r = new Rhino();
        r.sleep();
        r.makeNoise();

        Lion l = new Lion();
        l.eat();
        l.sleep();
    }
}