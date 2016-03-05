
void setup()
{
  size(1000, 1000);
}
void draw()
{
  PImage face = loadImage("face.jpg");
image(face, -525, 125,2000,1000);  


  int y=mouseY;
  int x=mouseX;
  fill(255, 255, 255);
  ellipse(300, 500, 200, 200);
  ellipse(700, 500, 200, 200);
  fill(200, 0, 200);

  if (mouseX<=250) {
    x=250;
  }
  if (mouseX>=350) {
    x=350;
  }
  if (mouseY<=450)
  {
    y=450;
  }
  if (mouseY>=550) {
    y=550;
  }
 ellipse(x, y,45, 100);
  ellipse(x+400, y, 20, 60);

}








