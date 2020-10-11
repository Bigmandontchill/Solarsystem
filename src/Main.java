public class Main {
    public static void main(String[] args) {
        double angle=0;
        double angleTwo=0;
        System.out.println("Hello World!");
       SolarSystem solar=new SolarSystem(800,800);
       while (true) {
           solar.drawSolarObject(0, 0, 100, "YELLOW");// create the sun
           //create the earth
           angle+=0.3;
           angleTwo+=0.5;
           solar.drawSolarObjectAbout(150,angle, 40, "BLUE", 0, 0);
           solar.drawSolarObjectAbout(300,angleTwo, 40, "RED", 0, 0);

           solar.finishedDrawing();
       }


    }
}
