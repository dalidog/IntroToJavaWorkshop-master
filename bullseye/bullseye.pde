

void setup() {
  size(1000, 1000);
}
void draw() {
  for (int i =800; i>0; i=i-51) {

    if ((i%2)==0) { 
      fill(250, 0, 0);
    } else {
      fill(250, 250, 250);
    }
    ellipse(500, 500, i, i);
  }
}

