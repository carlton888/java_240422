package question05;

public class IrregularArray2 {
	public static void main(String[] args) {
		int intArray[][]=new int[5][];
		intArray[0]=new int[5];
		intArray[1]=new int[1];
		intArray[2]=new int[4];
		intArray[3]=new int[2];
		intArray[4]=new int[3];
		
		//intArray.length:5 (5번 반복)
		for (int i = 0; i < intArray.length; i++) {
			//intArray[i].length (5,1,4,2,3)
			for (int j = 0; j < intArray[i].length; j++) {
				//(0,0)->(0+3)*10+5+0=35
				//(0,1)->(0+3)*10+5+1=36
				//(0,2)->(0+3)*10+5+2=37
				//(0,3)->(0+3)*10+5+3=38
				//(0,4)->(0+3)*10+5+4=39
				//(1,0)->(1+3)*10+5+0=45 ...
				//(0,0)~(4,2) 반복, 행(30~70번대까지 반복)
				intArray[i][j]=(i+3)*10+5+j;
				System.out.print(intArray[i][j]+" ");
			}
			System.out.println();
		}
	}
}









