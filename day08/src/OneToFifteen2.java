
public class OneToFifteen2 {

	public static void main(String[] args) {

		int i;
		String t = "\t";
		String t4 = "\t\t\t\t";
		String n = "\n";
		String str = "¡Ú";

		for(i=1; i<=15; i++) {
			System.out.print(i+t);
			if(i==5) {
				System.out.println(n+t4+str);
			}else if(i==10) {
				System.out.println(n+str);
			}
		}
	}

}
