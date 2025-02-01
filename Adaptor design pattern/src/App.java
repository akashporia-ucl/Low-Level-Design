public class App {
    public static void main(String[] args) throws Exception {
        LegacyPrinter legacyPrinter = new LegacyPrinter();
        PrinterAdapter printer = new PrinterAdapter(legacyPrinter);
        printer.printPage("Hello my name is Zephyr");
    }
}
