public class RemoteControl {
    private CommandInterface command;

    public void setCommand(CommandInterface command) {
        this.command = command;
    }

    public void pressButton() {
        command.execute();
    }

    public void undo() {
        command.undo();
    }
}
