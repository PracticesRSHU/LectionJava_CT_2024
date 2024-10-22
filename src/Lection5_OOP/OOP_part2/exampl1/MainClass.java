package Lection5_OOP.OOP_part2.exampl1;
/*
 *  Створити клас Robot i класи CoffeRobot, RobotDancer, RobotCoocker, 
 *  які будуть нащадками Robot. 
 *  Оголосити в Robot метод work(), в якому слід описати роботу,
 *  яку буде виконувати кожен з роботів (тобто, метод повинен наслідуватись):
• Для Robot, щоб на консоль виводився текст «Я Robot – я просто працюю».
• Для CoffeRobot, щоб на консоль виводився текст «Я CoffeRobot – я варю каву».
• Для RobotDancer, щоб на консоль виводився текст «Я RobotDancer – я просто танцюю».
• Для RobotCoocker, щоб на консоль виводився текст «Я RobotCoocker – я просто готую».
Створити в Main класі екземпляри вищеописаних класів і викликати до кожного з них метод work().
 * */
public class MainClass {
	public static void main(String[] args) {
		Robot robot1=new Robot();
		System.out.println(robot1.getName());
		RobotCoffe robot2=new RobotCoffe(); 
		robot2.work();
		RobotDancer robot3= new RobotDancer();
		robot3.work();
		RobotDancer robot4= new RobotDancer("бальні танці");
		
		Robot robot5=new RobotCoffe();
		robot5.work();
		
		Robot robot6= new RobotDancer();
		robot6.work();
		RobotDancer robot7=(RobotDancer) robot6;
		robot7.info();
	}

}