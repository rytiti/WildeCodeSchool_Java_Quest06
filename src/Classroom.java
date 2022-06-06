
public class Classroom {

	public static void main(String[] args) {
		Wilder firstWilder = new Wilder("Arnaud", true);
		Wilder secondWilder = new Wilder("Stéphane", false);
		System.out.println(firstWilder.whoAmI());
		System.out.println(secondWilder.whoAmI());
	}

}
