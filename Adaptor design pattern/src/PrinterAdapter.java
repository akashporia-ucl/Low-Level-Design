public class PrinterAdapter implements ModernPrinter {
    private LegacyPrinter printer;

    public PrinterAdapter(LegacyPrinter printer) {
        this.printer = printer;
    }

    @Override
    public void printPage(String text) {
        printer.printText(text);
    }
}
