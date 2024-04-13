import processing.core.PApplet;
import java.util.Arrays;

/*
 * @author Ryan Fellin
 * A program which draws a background tessalation of both rectangles and triangles, and generates 3 flowers based on the inputted values implemented in the methods
 */
public class Sketch extends PApplet {
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(1900, 1080);
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
   
    
    //float postri = drawtess(0,0,0,0,0,0,0,0,0);
    for (float ypos = 0; ypos <= 1000; ypos += 100)
    for (float triincrease = 0; triincrease <= 1800; triincrease += 100){
      pushMatrix();
    float uppertrix = drawtess(0+triincrease,0+ypos,0+triincrease,100+ypos,100+triincrease,100+ypos,100,200,0);
    System.out.println(uppertrix);
    float rectanglex = drawrect(0+triincrease, 0+ypos, 200, 20, 0, 255, 255);
    System.out.println(rectanglex);

    
    popMatrix();
  }
  float flower = drawflower(0, 0, 6,255,0,0);
    System.out.println(flower);
  float flower2 = drawflower(-680, -250, 3, 0, 0, 255 );
  System.out.println(flower2);
  float flower3 = drawflower(680, 250, 3, 0, 0, 255);
  System.out.println(flower3);
}
  

  
  /** 
   * @param trix1 X coordinate of the triangle's first vertex
   * @param triy1 Y coordinate of the triangle's first vertex
   * @param trix2 X coordinate of the triangle's second vertex
   * @param triy2 Y coordinate of the triangle's second vertex
   * @param trix3 X coordinate of the triangle's third vertex
   * @param triy3 Y coordinate of the triangle's theird vertex
   * @param col1 Red value for the colour of the triangles
   * @param col2 Green value for the colour of the triangles
   * @param col3 Blue value for the colour of the triangles
   * @return Y coordinate of the third vertex, used for easier positioning
   */
  // define other methods down here.
  public float drawtess(float trix1, float triy1, float trix2, float triy2, float trix3, float triy3, float col1, float col2, float col3){
    pushMatrix();
    fill(col1, col2, col3);
    stroke(200);
    triangle(trix1, triy1, trix2, triy2, trix3, triy3);
    //rect(-trix1, -triy1, trix2, triy2);
    popMatrix();
    
    return triy3;
    
  }
  
  
  /** 
   * @param xcoord X-coordinate of the rectangle
   * @param ycoord Y-Coordinate of the rectangle
   * @param rectwidth Width of the rectangle
   * @param recthieght hieght of the rectangle
   * @param colr Red value for the colour of the rectangle
   * @param colg Green value for the colour of the rectangle
   * @param colb Blue value for the colour of the rectangle
   * @return X coordinate of rectangle, used for positioning.
   */
  public float drawrect(float xcoord, float ycoord, float rectwidth, float recthieght, float colr, float colg, float colb){
    
    pushMatrix();
    fill(colr, colg, colb);
    rect(xcoord, ycoord,rectwidth,recthieght );
    popMatrix();
    return(xcoord);
  }
  
  /** 
   * @param xpos X-Position of the flower
   * @param flypos Y-Position of the flower
   * @param scalar - Scale multiple to increase the size of the flower, MUST BE EQUAL TO OR ABOVE 1
   * @param fillcolr Red colour value for the petals of the flower
   * @param fillcolg Green colour value for the petals of the flower
   * @param fillcolb Blue colour value for the petals of the flower
   * @return X-Position of the flower's center, for use in positioning
   */
  public float drawflower(float xpos, float flypos, float scalar, float fillcolr, float fillcolg, float fillcolb){
    for(int ypos = 0; ypos <= 360; ypos += 45 ){
      pushMatrix();
      ellipseMode(CENTER);
      fill(fillcolr,fillcolg,fillcolb);
      translate(950+xpos, 540+flypos);
      rotate(radians(360-ypos));
      ellipse(0,0, 180*scalar, 40*scalar);
      popMatrix();
     }
     pushMatrix();
    fill(1, 50, 32);
    translate(950 + xpos,540 + flypos);
    ellipse(0,0, 40*scalar, 40*scalar);
    popMatrix();
    return(xpos);
    }
    
  
}