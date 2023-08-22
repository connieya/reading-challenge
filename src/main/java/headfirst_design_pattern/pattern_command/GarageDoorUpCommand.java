package headfirst_design_pattern.pattern_command;

public class GarageDoorUpCommand implements Command {

    GarageDoor garageDoor;

    public GarageDoorUpCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {

    }

    @Override
    public void undo() {

    }
}
