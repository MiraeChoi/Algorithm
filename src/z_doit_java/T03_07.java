package z_doit_java;

class T03_07 {
	public interface Comparator<T> {
		int compare(T o1, T o2);
		boolean equals(Object obj);
	}
	
//	public static final Comparator<T> COMPARATOR = new Comp();
//	
//	private static class Comp implements Comparator<T> {
//		public int compare(T d1, T d2) {
//			if(d1 > d2) return 1;
//			if(d1 < d2) return -1;
//			if(d1 == d2) return 0;
//		}
//	}
}
