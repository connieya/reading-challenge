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


    private void notifyBPMObservers() {
        for(int i=0; i< beatObservers.size(); i++) {
            BeatObserver observer =  (BeatObserver)beatObservers.get(i);
            observer.updateBeat();
        }
    }

    @Override
    public void registerObserver(BeatObserver o) {
        beatObservers.add(o);
    }

    @Override
    public void removeObserver(BeatObserver o) {
        int i = beatObservers.indexOf(o);
        if (i >=0 ){
            beatObservers.remove(i);
        }

    }

    @Override
    public void registerObserver(BPMObserver o) {

    }

    @Override
    public void removeObserver(BPMObserver o) {
        int i = bpmObservers.indexOf(o);
        if ( i>=0) {
            bpmObservers.remove(i);
        }

    }
    private void playBeat() {
        clip.setFramePosition(0);
        clip.start();
    }

    private void stopBeat() {
        clip.setFramePosition(0);
        clip.start();
    }

}
