package kr.co.himedia.magicnumber.after2;

public class Main {
    public static void main(String[] args) {

        Robot robot = new Robot("고냥이");
        robot.order(Robot.command.WALK);
        robot.order(Robot.command.STOP);
        robot.order(Robot.command.JUMP);

        //robot.order(100);             //enum으로 정의 시 다른 타입 불가능
        //robot.order(Robot.command.);

    }
}
