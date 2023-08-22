package headfirst_design_pattern.pattern_command;

public class CeilingFanOnCommand implements Command {
    CeilingFan ceilingFan;
    public CeilingFanOnCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {

    }

    @Override
    public void undo() {

    }
}
