import ddf.minim.*;
AudioSample sound; 

void setup(){
size(500,500);
fill(119,136,85);
  ellipse(250,250,300,300);
  fill(136,255,221);
  ellipse(250,250,250,250);
  fill(153,0,221);
ellipse(250,250,200,200);
Minim minim = new Minim(this);       
sound = minim.loadSample("gummybear.mp3");
}
void draw(){
  
  PImage sink = loadImage("sink.ppm.gif") ; 
 image(sink,300,300);
   PImage poptart = loadImage("poptart.ppm.gif")  ;
 image(poptart, 256,200)  ;
   PImage bolt = loadImage("bolt.ppm.gif") ; 
 image(bolt, 200,200);
   PImage hammer = loadImage("hammer.ppm.gif");  
 image(hammer, 250, 300);
   PImage tennisball= loadImage("tennisball.ppm.gif");  
 image(tennisball, 225,200);
   PImage firecracker = loadImage("firecracker.ppm.gif");  
 image(firecracker, 180, 290);
   PImage basketball = loadImage("basketball.ppm.gif");  
 image(basketball,201, 250);
   PImage roadsign = loadImage("roadsign.ppm.gif");  
 image(roadsign, 205, 169);
   PImage curly = loadImage("curly.ppm.gif");  
   if (mousePressed){
 image(curly, mouseX, mouseY);
       
  
sound.trigger();        
   }
   PImage goblin = loadImage("goblin.ppm.gif")  ;
 image(goblin,230, 312);
   PImage eyeball= loadImage("eyeball.ppm.gif");  
 image(eyeball,145, 251);
}


