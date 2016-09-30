package ua.app;

public class Main {

    public static void main(String[] args) {
	    Operator operator = new Operator("Jack", "Jonsons");
        Robot robot = new Robot(20, 30);

        operator.setRobot(robot);
        System.out.println(operator.getRobot().getCourse());

        robot.setOperator(operator);
        robot.forward(30);
        robot.printCoordinates();
        System.out.println(robot.getOperator().getFirstName());
    }
}
