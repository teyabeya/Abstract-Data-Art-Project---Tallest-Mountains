import org.code.theater.*;

public class TheaterRunner {
  public static void main(String[] args) {
// Instantiate a DataScene object to play in the Theater
    DataScene playMts = new DataScene();
    
    // Call any DataScene methods to diplay
    playMts.drawScene();
    
    // Play the DataScene in the theater
    Theater.playScenes(playMts);

    
    
  }
}