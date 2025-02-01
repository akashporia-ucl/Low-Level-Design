public class App {
    public static void main(String[] args) throws Exception {
        AC ac = new AC();
        RemoteControl remoteControl = new RemoteControl();
        TurnACOnCommand turnACOnCommand = new TurnACOnCommand(ac);
        TurnACOffCommand turnACOffCommand = new TurnACOffCommand(ac);

        remoteControl.setCommand(turnACOnCommand);
        remoteControl.pressButton();
        remoteControl.undo();
        remoteControl.setCommand(turnACOffCommand);
        remoteControl.pressButton();
        remoteControl.undo();

    }
}
