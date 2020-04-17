public class Fan {
    public static void main(String[] args) {
        final int SLOW = 1;
        final int MEDIUM = 2;
        final int FAST = 3;

        CreatFan Fan1 = new CreatFan();
        Fan1.setSpeed(FAST);
        Fan1.setRadius(10);
        Fan1.setColor("yellow");
        Fan1.setOn(true);

        CreatFan Fan2 = new CreatFan();
        Fan1.setSpeed(MEDIUM);

        System.out.println(Fan1.toString(1));
        System.out.println(Fan2.toString(2));
    }
}
