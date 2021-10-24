package cook8;
/*
1면
   1   2   3   4
   5   6   7   8
   9  10  11  12

2면
  13  14  15  16
  17  18  19  20
  21  22  23  24
 * 
 * */
public class Ex08_11_3cha {

	public static void main(String[] args) {
		int [][][] aa= {
				{   {1,2,3,4},
					{5,6,7,8},
					{9,10,11,12}	
				},
				{   {13,14,15,16},
					{17,18,19,20},
					 {21,22,23,24}	
				}
		};
		
//		for (int i = 0; i < aa.length; i++) {
//			System.out.println((i+1)+"면");
//
//			for (int j = 0; j < aa[i].length; j++) {
//				
//				for (int j2 = 0; j2 < aa[i][j].length; j2++) {
//					System.out.printf("%4d",aa[i][j][j2]);
//				}
//				
//				System.out.println();
//			}
//		}
		int r=0;
		for (int i[][]:aa) {
			System.out.println((++r)+"면");
			for (int j[]:i) {
				for (int k:j) {
					System.out.printf("%4d",k);
				}
				System.out.println();
			}
			System.out.println();
		}
		
	}
}
