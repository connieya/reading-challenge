package headfirst_design_pattern.facade;

public class Amplifier {
    public void on() {
        System.out.println("앰프가 켜졌습니다.");
    }

    public void setStreamingPlayer(StreamingPlayer player) {
        System.out.println("앰프를 서라운드 모드로 설정 합니다." + player);
    }

    public void setSurroundSound() {
    }

    public void setVolume(int volume) {
        
    }

    public void off() {
    }
}
