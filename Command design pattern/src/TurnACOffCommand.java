public class TurnACOffCommand implements CommandInterface {
    AC ac;

    TurnACOffCommand(AC ac) {
        this.ac = ac;
    }

    @Override
    public void execute() {
        ac.turnOff();
    }

    @Override
    public void undo() {
        System.out.println("Undo - Ac turned on");
    }
}
