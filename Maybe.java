public class Maybe {
	public static void BS(int array[]) {
		for(int i = 0; i<array.length-1;i++) {
			for(int j = 0; j<array.length-1;j++) {
				if(array[j]>array[j + 1]) {	
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
		}
	}
	
	public static void main(String args[]) {
		int[] mass = {1,5,2,4,3,6,9,8,7};
		BS(mass);
		for(int i=0; i<mass.length; i++)
        {
            System.out.print(mass[i]+"\t");
        }
        System.out.println();
	}
}
