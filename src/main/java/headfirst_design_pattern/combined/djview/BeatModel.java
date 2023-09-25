package headfirst_design_pattern.combined.djview;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.Line;
import javax.sound.sampled.LineUnavailableException;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class BeatModel implements BeatModelInterface, Runnable {
    List<BeatObserver> beatObservers = new ArrayList<>();
    List<BPMObserver> bpmObservers = new ArrayList<>();
    int bpm = 90;
    Thread thread;
    boolean stop = false;
    Clip clip;

    @Override
    public void initialize() {
        try {
            File resource = new File("clap.wav");
            clip = (Clip) AudioSystem.getLine(new Line.Info(Clip.class));
            clip.open(AudioSystem.getAudioInputStream(resource));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void on() {
        bpm = 90;
        notifyBPMObservers();
        thread = new Thread(this);
        stop = false;
        thread.start();
    }

    @Override
    public void off() {
        stopBeat();
        stop = true;

    }

    @Override
    public void run() {
        while (!stop) {
            playBeat();
            notifyBPMObservers();
            try {
                Thread.sleep(60000/getBPM());
            }catch (Exception e) {

            }
        }
    }

    @Override
    public void setBPM(int bpm) {
        this.bpm =bpm;
        notifyBPMObservers();

    }

    @Override
    public int getBPM() {
        return bpm;
    }

    private void playBeat() {
    }

    private void notifyBPMObservers() {
    }



    private void stopBeat() {
    }



    @Override
    public void registerObserver(BeatObserver o) {

    }

    @Override
    public void removeObserver(BeatObserver o) {

    }

    @Override
    public void registerObserver(BPMObserver o) {

    }

    @Override
    public void removeObserver(BPMObserver o) {

    }


}
