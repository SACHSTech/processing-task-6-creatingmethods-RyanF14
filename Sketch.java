import processing.core.PApplet;

public class Sketch extends PApplet {
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(1920, 1080);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(210, 255, 173);
    noLoop();
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
	  
	// sample code, delete this stuff
    pushMatrix();
    drawtri();
    String postri = drawtess(frameRate, frameRate, frameRate, frameRate, frameRate, frameRate, frameRate, frameRate, frameRate);
    System.out.println(postri);
    popMatrix();
  }
  
  // define other methods down here.
  public String drawtess(float trix1, float triy1, float trix2, float triy2, float trix3, float triy3, float col1, float col2, float col3){
    pushMatrix();
    fill(col1, col2, col3);
    stroke(200);
    triangle(trix1, triy1, trix2, triy2, trix3, triy3);
    //rect(-trix1, -triy1, trix2, triy2);
    return "DEBUG: Triangle tesselation segment completed";
  }
  public void drawtri(){
    drawtess(100,0,200,100,100,100,100,200,0);
    drawtess(100,0,200,100,0,100,100,200,0);
    for(float triincrease 0){
      
  }
}