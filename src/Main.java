import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import java.util.Objects;

public class Main {

    public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        new MyFrame();
        AudioInputStream audioStream = AudioSystem.getAudioInputStream(Objects.requireNonNull(Main.class.getResource("SantaBaby.wav")));
        Clip clip = AudioSystem.getClip();
        clip.open(audioStream);

        FloatControl volumeControl = (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);
        float volume = -17.0f;
        volumeControl.setValue(volume);

        clip.start();

    }
}
















