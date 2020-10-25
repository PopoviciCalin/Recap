public class Main {
    public static void main(String[] args) {
        System.out.println("HELLO");
        System.out.println("hello 2");
        System.out.println("hello 2");
        Animal animal = new Animal();
        animal.walk();
        System.out.println(animal.n);

        System.out.println(10 * 20 + "Javatpoint");
        System.out.println("Javatpoint" + 10 * 20);
        System.out.println("Javatpoint" + 10 + 20);

        String s1 = "Ana";
        String s2 = "Ana";
        String s3 = new String("Ana");
        String s4 = new String("Ana");

        System.out.println(s1==s2);
        System.out.println(s1==s3);
        System.out.println(s3.equals(s4));

        ImutableClass imutableObject = new ImutableClass(x=3, s="a");
//        imutableObject.x=3;
//        System.out.println(imutableObject.x);
//        imutableObject.x=5;
        System.out.println(imutableObject.getX());
    }
}
