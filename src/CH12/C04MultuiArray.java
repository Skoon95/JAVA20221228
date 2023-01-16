package CH12;

public class C04MultuiArray {

	public static void main(String[] args) {
		int [][] arr2 = {
				{10,20},
				{30,40,50},
				{60,70,80,90},
				{100,110,120,130,140}
		};
		
		//길이 확인
		System.out.println("arr2의 행의 길이 : " +arr2.length);
		System.out.println("arr2의 0번쨰 요소 길이 : " +arr2[0].length);
		System.out.println("arr2의 1번쨰 요소 길이 : " +arr2[1].length);
		System.out.println("arr2의 2번쨰 요소 길이 : " +arr2[2].length);
		System.out.println("arr2의 3번쨰 요소 길이 : " +arr2[3].length);
		
		for(int [] ar : arr2) {
			for(int n : ar) {
				System.out.print(n+" ");
			}
			System.out.println();
		}

	}

}
