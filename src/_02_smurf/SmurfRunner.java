package _02_smurf;

public class SmurfRunner {

	public SmurfRunner() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Smurf papa = new Smurf("Papa");
		Smurf handy = new Smurf("Handy");
		Smurf smurfette = new Smurf("Smurfette");

		// HandySmurf
		handy.eat();
		System.out.println(handy.getName());

		// PapaSmurf
		System.out.println(papa.getName());
	System.out.println(papa.getHatColor());
	System.out.println(papa.isGirlOrBoy());	

		// Smurfette
		System.out.println(smurfette.getName());
		System.out.println(smurfette.getHatColor());
		System.out.println(smurfette.isGirlOrBoy());	

	}

}
