public class Main {
    public static void main(String[] args) {
        double angle=50;
        System.out.println("Hello World!");
       SolarSystem solar=new SolarSystem(800,800);
       while (true) {
           solar.drawSolarObject(30, 0, 100, "YELLOW");// create the sun
           //create the earth
           solar.drawSolarObjectAbout(300,angle, 40, "BLUE", 30, 0);
           angle+=1;//make the earth orbit around the sun 
           solar.finishedDrawing();
       }
    }
}
