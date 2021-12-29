
public class OneToFifteen {
	public static void main(String []args) {

		int i;
		String a = "¡Ú";
		String a2 = "\t\t\t\t¡Ú";

		for(i=1; i<=5; i++) {
			System.out.print(i+"\t");
		}
		System.out.println("\n"+a2);

		for(i=6; i<=10; i++) {
			System.out.print(i+"\t");
		}
		System.out.println("\n"+a);

		for(i=11; i<=15; i++) {
			System.out.print(i+"\t");
		}

	}
}
