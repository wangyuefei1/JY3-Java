package practice;

public class Vehicle {

	int speed;
	int size;
	int move;
	public void move() {
		move = 1;
		System.out.print(move);
	}
	
	public static void main(String[] args) {
		Vehicle vehicle = new Vehicle();
		vehicle.speed= 1;
		vehicle.size = 2;
		System.out.println("��ʼ�ٶ�Ϊ:"+vehicle.speed);
		System.out.println("���Ϊ:"+vehicle.size);
		vehicle.move();
	}
}
