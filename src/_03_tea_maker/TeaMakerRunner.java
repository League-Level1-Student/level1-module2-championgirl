package _03_tea_maker;

public class TeaMakerRunner {

	public TeaMakerRunner() {
		// TODO Auto-generated constructor stub
	}
public static void main(String[] args) {
	

	
	TeaBag teabag = new TeaBag("Green");
	
	Kettle kettle = new Kettle();
	kettle.boil();
	
	Cup cup = new Cup();
	
	cup.makeTea(teabag, kettle .getWater());
	
}	
}
