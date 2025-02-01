public class TurnACOnCommand implements CommandInterface {
    AC ac;

    TurnACOnCommand(AC ac) {
        this.ac = ac;
    }

    @Override
    public void execute() {
        ac.turnOn();
    }

    @Override
    public void undo() {
        System.out.println("Undo - Ac turned off");
    }
}
