abstract class Animal {
    String food, picture, location;
    int hunger, boundaries;

    public abstract void makeNoise();

    public abstract void eat();
    

    public void sleep() {
        System.out.println("Sleeping sabke jaisa");
    }

    public void roam() {
        System.out.println("Roaming");
    }
}