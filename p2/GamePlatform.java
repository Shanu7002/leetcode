public class GamePlatform {
    public static double calculateFinalSpeed(double initialSpeed, int[] inclinations) {
        // fast return
        if (initialSpeed == 0) return 0;
        if (inclinations == null || inclinations.length == 0) return initialSpeed;

        double currentSpeed = initialSpeed;

        for (int inclination : inclinations) {
            if (inclination == 0) continue;
            
            currentSpeed -= inclination;
            if (currentSpeed <= 0) return 0.0;
        }
        return currentSpeed;
    }

    public static void main(String[] args) {
        System.out.println(calculateFinalSpeed(60.0, new int[] { 0, 30, 0, -45, 0 }));
    }
}