public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");
       SolarSystem system=new SolarSystem(800,800);
        Sun sun=new Sun(90,-300,60,"YELLOW",system.getWidth()/2,system.getHeight()/2);
       Planet planet=new Planet(0,50,30,"RED",0,0);
      /*  double centrerads = Math.toRadians(sun.angle);
        double centreOfRotationX = ( 800/ 2.0) + sun.r * Math.sin(centrerads);
        double centreOfRotationY = (800/ 2.0) +sun.r * Math.cos(centrerads);
        planet.CenterX=centreOfRotationX;
        planet.Centery=centreOfRotationY;*/
       while (true) {
           system.Draw(sun);
           planet.move(-1,sun,system);
           system.Draw(planet);
           system.finishedDrawing();
       }


    }
}
