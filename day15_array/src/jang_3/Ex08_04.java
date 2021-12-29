package jang_3;

public class Ex08_04 {

	public static void main(String[] args) {

		int aa[] = {100, 200, 300, 400};
		
		int bb[] = new int[]{100, 200, 300, 300};
		
		int cc[];
		cc= new int[] {100, 200};
		
		int[]dd = new int[1];
		dd[0] = 100;
		int i;
		
//		for(i = 0; i < 4; i++)
//			System.out.print("aa["+i+"]  ==> " + aa[i] + "\t");
//			System.out.println();
//			
//			for(i = 0; i < 3; i++)
//				System.out.print("bb["+i+"] ==> " + bb[i] + "\t");
//			System.out.println();
//	
//			for(i = 0; i < 2; i++)
//				System.out.print("cc["+i+"] ==> " + cc[i] + "\t");
//			System.out.println();
//			
//			for(i = 0; i < 1; i++)
//				System.out.print("dd["+i+"] ==> " + dd[i] + "\t");
//			System.out.println();

		for (i = 0; i < aa.length; i++)
			System.out.print("aa[" + i + "] ==> " + aa[i] + "\t");
			System.out.println();
			for (i = 0; i < bb.length; i++)
				System.out.print("bb[" + i + "] ==> " + bb[i] + "\t");
			System.out.println();
			for (i = 0; i < cc.length; i++)
				System.out.print("cc[" + i + "] ==> " + cc[i] + "\t");
			System.out.println();
			for (i = 0; i < dd.length; i++)
				System.out.print("dd[" + i + "] ==> " + dd[i] + "\t");
			System.out.println();
			
	}

}
