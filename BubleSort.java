public class BubleSort {
	int array[];
	public static <T extends Comparable<T>> void bubleSort(T array[], int len) {
		do {
			for(int j = 0; j < len-1;j++) {
				int comp = array[j].compareTo(array[j+1]);
				if(comp > 0) {
					T temp = array[j];
					array[j]=array[j+1];
					array[j+1] = temp;
				}
			}
			len--;
		} while(len > 0);
	}
	
	public static void main(String args[]) {
		int[] mass = {1, 5, 3, 6, 8, 7, 4, 2};
		int len = mass.length;
		Integer[] mess = new Integer[len];
		for(int i = 0; i < len; i++) {
			mess[i] = mass[i];
		}
		bubleSort(mess, len);
		for(int i=0; i<len; i++)
        {
            System.out.print(mess[i]+"\t");
        }
        System.out.println();
	}
}
