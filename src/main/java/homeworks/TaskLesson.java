package homeworks;

public class TaskLesson {
    public static void main(String[] args) {
            for(int i=1; i<=3; i++){
            System.out.println("Это " + i + "-й урок!");
            switch (i){
                case 1:
                    System.out.println ("   Я выполнил все домашние задания " + i + "-го урока.");
                break;
                case 2:
                    System.out.println ("   Я выполнил все домашние задания 2-го урока.");
                    break;
                case 3:
                    System.out.println ("   Я не выполнил домашние задание 3-го урока.");
                    break;
            }

        }
    }
}
