public class StaticClassTests {
    public static void main(String[] args) {
        HelloPrinter printer = new HelloPrinter();
        printer.printHello("Dima");
    }

    public static class HelloPrinter {
        public void printHello(String username) {
            System.out.println("Hello, " + username);
        }
    }
}
