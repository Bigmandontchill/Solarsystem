public class Main {
    public static void main(String[] args) {
        int angle=50;
        System.out.println("Hello World!");
       SolarSystem solar=new SolarSystem(800,800);
       while (true) {
           solar.drawSolarObject(30, 0, 40, "YELLOW");
           solar.drawSolarObjectAbout(300,angle, 20, "BLUE", 30, 0);
           angle+=2;
           solar.finishedDrawing();
       }
    }
}
