import java.io.File;
import javax.media.*;
import javax.swing.*;

public class MusicPlayer {

    public static void main(String[] args) {
        // Create a media player
        Player player = null;

        // Create a file chooser to select an audio file
        JFileChooser fileChooser = new JFileChooser();
        int returnValue = fileChooser.showOpenDialog(null);

        if (returnValue == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();

            try {
                // Create a media object from the selected file
                Media media = new Media(selectedFile.toURI().toString());

                // Create a player for the media
                player = Manager.createPlayer(media);

                // Start the player
                player.start();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
