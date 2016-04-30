int acceleration=1;
int Xeye1=260;
int Yeye1=100;
int Xeye2=325;
int Yeye2=95;
void setup() {
  size(460, 290);
  PImage catPic=loadImage("cat.jpg");
  background(catPic);
}
void draw() {
  ellipse(Xeye1, Yeye1, 10, 10);
  ellipse(Xeye2, Yeye2, 10, 10);
  fill(0, 238, 17);
}
void keyPressed() {
  Xeye1+=2*acceleration;
  Yeye1+=2*acceleration;
  Xeye2+=2*acceleration;
  Yeye2+=2*acceleration;
}

