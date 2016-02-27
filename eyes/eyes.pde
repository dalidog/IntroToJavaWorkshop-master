
void setup()
{
  size(1000, 1000);
}
void draw()

{fill(255,255,255);
  ellipse(300, 500, 200, 200);
  ellipse(700, 500, 200, 200);
  fill(200,0,200);
  ellipse(mouseX, mouseY,20, 20);
  ellipse(mouseX+400, mouseY, 20, 20);
  if (mouseX<=100){mouseX=100;}
}












