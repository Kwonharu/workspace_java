package kr.co.himedia.magicnumber.after2;

public class Robot {
    private String name;
//    public static final int COMMAND_WALK = 0;
//    public static final int COMMAND_STOP = 1;
//    public static final int COMMAND_JUMP = 2;

    public Robot(String name) {
        this.name = name;
    }

    public enum command{
        WALK,
        STOP,
        JUMP
    }

    public void order(Robot.command command){
        if(command == command.WALK){                   // 걷기
            System.out.println(name + " walk");
        } else if (command == command.STOP) {          // 멈춰!
            System.out.println(name + " stop");
        } else if (command == command.JUMP) {          // 점프
            System.out.println(name + " jump");
        }else{
            System.out.println("error");
        }
    }

}
