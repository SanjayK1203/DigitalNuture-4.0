public class Main {
    public static void main(String[] args) {
        Logger logger1 = Logger.getInstance();
        logger1.log("The First Logger Instance");

        Logger logger2 = Logger.getInstance();
        logger2.log("The Second Logger Instance");

        if (logger1 == logger2)
            System.out.println("Both the logger instances are the same");
        else
            System.out.println("The logger instances are different");
    }
}