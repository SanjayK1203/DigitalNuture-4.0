public class Main {
    public static void main(String[] args) {
        SingletonPattern singleton1 = SingletonPattern.getInstance();
        singleton1.showMessage("The First Object Created");
        SingletonPattern singleton2 = SingletonPattern.getInstance();
        singleton2.showMessage("The Second Object Created");

        if(singleton1 == singleton2)
            System.out.println("Both the instances are same");
        else
            System.out.println("The instances are different");
    }
}
