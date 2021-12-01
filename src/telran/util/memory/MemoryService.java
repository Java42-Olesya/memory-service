package telran.util.memory;

public class MemoryService {

	public static int getMaxAvailableMemory() {
		long maxMemory = Runtime.getRuntime().maxMemory();
		int maxSize = 0;
		int left = 0;
		long rigth = maxMemory > Integer.MAX_VALUE ? Integer.MAX_VALUE : (int) maxMemory;
		int mid = 0;
		while (left <= rigth) {
			try {
			mid =  (int) ((rigth + left) / 2);	
				byte ar[] = new byte[mid];
				ar = null;
				maxSize = mid;
				left = mid + 1;

			} catch (Throwable e) {
				rigth = mid - 1;
			}
		}
		return maxSize;
	}

}
