class Test
{
    public static void main(String[] args) {

        Ubaid u1 = new Ubaid();
        Ubaid u2 = new Ubaid();
        Ubaid u3 = new Ubaid();
        Ubaid u4 = new Ubaid();

        u1 = u4;
        u2 = u3;

        u1.setName("Ubaid");
        System.out.println("Name: " + u4.name);

        u2.setName("Abdul");
        System.out.println("Name: " + u3.name);
    }
}