import org.code.theater.*;
import org.code.media.*;
public class DataScene extends Scene {
 private Mountain[] mountains;      // 1D array of Mountain objects

  /*
  * constructor 
  */
  public DataScene() {
    mountains = makeMountains();
  }

  /*
  * returns 1D array of Mountain objects with txt files
  */
  public Mountain[] makeMountains() {
    String[] namesArray = FileReader.toStringArray("names.txt");
    int[] heightsArray = FileReader.toIntArray("hFeet.txt");
    int[] ascentsArray = FileReader.toIntArray("ascents.txt");
    
    
    Mountain[] mountainsArray = new Mountain[namesArray.length];
    for (int i = 0; i < mountainsArray.length; i++) {
      mountainsArray[i] = new Mountain(namesArray[i], heightsArray[i], ascentsArray[i]);
    }

    return mountainsArray;
  }

  /**
   * method to draw the animation
   * Makes sure each mountain is different from the last
   * Makes background color based on the number of ascents
   * Size of image based on size of mountain
   * Also prints the name, height, and number of successful ascents of the mountain.
   */
  public void drawScene() {
    //making array of different mountains
    Mountain[] randoms = {mountains[(int)(Math.random()*mountains.length)],
      mountains[(int)(Math.random()*mountains.length)],
      mountains[(int)(Math.random()*mountains.length)]};
    while (randoms[0].bgColor().equals(randoms[1].bgColor())||randoms[0].picPixels()==(randoms[1].picPixels())){
      randoms[1] = mountains[(int)(Math.random()*mountains.length)];
    }
    while (randoms[1].bgColor().equals(randoms[2].bgColor())||randoms[1].picPixels()==(randoms[2].picPixels())){
      randoms[2] = mountains[(int)(Math.random()*mountains.length)];
    }
   //sets the scene
    setTextHeight(17);
    setTextStyle(Font.SANS, FontStyle.ITALIC);
    for (Mountain mt : randoms){
      clear(mt.bgColor());
      drawImage("Screenshot_2024-12-11_5.48.41_PM-removebg-preview-(1).png", 75, 75, mt.picPixels());
      drawText(mt.toString(), 2, 350);
      playSound("Screen-Recording-2024-12-12-1209.wav");
      pause(3);
    }
    
  }
  
}