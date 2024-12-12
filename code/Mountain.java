public class Mountain {

  private String name;        // name of mountain
  private int height;         // height in feet
  private int ascents;        // number of successful ascents

  /*
  * constructor 
  */
  public Mountain(String name, int height, int ascents) {
    this.name = name;
    this.height = height;
    this.ascents = ascents;
  }

  /*
  * accessor method for name 
  */
  public String getName() {
    return name;
  }
  
  /*
  * accessor method for height 
  */
  public int getHeight() {
    return height;
  }

   /*
  * accessor method for ascents 
  */
  public int getAscents() {
    return ascents;
  }

  /*
  *return the length and width for pictures based on size of the mountain
  */
  public int picPixels(){
    if (height<=24000){
      return 100;
    } else if (height<=2600){
      return 170;
    } else{
      return 270;
    }
  }

  /*
  *return the color for background based number of ascents
  */
  public String bgColor(){
    if (ascents==0){
      return "red";
     } else if (ascents<=5){
       return "yellow";
    } else if (ascents<= 20){
      return "green";
    }else if (ascents<=100){
      return "blue";
    }else{
      return "purple";
    }
  }
  
  /*
  * toString method 
  */
  public String toString() {
    return name + ": " + height + " ft. "+ ascents + " successful ascents.";
  }
  
}