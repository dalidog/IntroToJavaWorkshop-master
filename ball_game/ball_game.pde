import ddf.minim.*;  
Minim minim;
AudioSample sound;     
int speed=10;
int X=0;
int Y=0;
int speedY=(int)random(20);
void setup() {
  minim = new Minim (this);
  sound = minim.loadSample("sound.wav", 128);

  size(500, 500);

  fill(300, 10, 40);
  stroke(1, 200, 80);
}
void draw() {
  background(100, 100, 100);
  X=X+speed;
  Y=Y+speedY;
  ellipse(X, Y, 100, 100);
  if (X==500) {
    speed=-speed;
  }
  if (X==0) {
    speed=-speed;
  }
  if (Y>=500) {
    speedY=-speedY;
    sound.trigger();
  }
  if (Y<=0) {
    speedY=-speedY;
  }
}

