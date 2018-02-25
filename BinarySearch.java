public class BinarySearch {
	public static <T extends Comparable>int BiSearch(T arr[], T number, int left, int right) {
		if(left > right) {
			return -1;
		}
		int mid = (left + right) >>> 1;
		int comp = number.compareTo(arr[mid]);
		if(comp < 0) {
			return BiSearch(arr, number, left, mid - 1);
		} else if(comp > 0) {
			return BiSearch(arr, number, mid + 1, right);
		}
		return mid;
	}
	
	
	public static void main(String args[]) {
		Integer[] array = new Integer[8];
		for(int i = 0; i < 8; i++) {
			array[i] = i+1;
		}
		int number = 8;
		int index = BiSearch(array, number, 0, 7);
		System.out.println(index);
	}
}