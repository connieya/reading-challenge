package pattern_command;

public class StereoOffCommand implements Command {

    Stereo stereo;

    public StereoOffCommand(Stereo streo) {
        this.stereo = streo;
    }

    @Override
    public void execute() {

    }
}
