public class AppMindswap {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        Dog doggie = new Dog();
        System.out.println(doggie.nameOfDog + " the dog,");
        System.out.println("is " + doggie.age + " years old.");
        System.out.println("It is colored like a " + doggie.color + ".");
        Tool tool = new Tool();
        System.out.println("His favorite tool is a " + tool.favoriteTool + ".");
    }
}
