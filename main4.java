enum level {
    LOW,
    MEDIUM,
    HIGH
}

public class main4 {
    public static void main(String[] args) {
        level x = level.MEDIUM;
        switch (x) {
            case LOW:
                System.out.println("Low level");
                break;
            case MEDIUM:
                System.out.println("Medium level");
                break;
            case HIGH:
                System.out.println("High level");
                break;
        }
        for (level myVar : level.values()) {
            System.out.println(myVar);
        }
    }
}
