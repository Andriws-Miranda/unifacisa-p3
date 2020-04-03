import java.util.HashSet;
import java.util.TreeSet;

public class TestTimeDiference {
	public static void main(String[] args) {
		
		long startTimeHash = System.nanoTime();
		HashSet<Integer> listaTestes = new HashSet<Integer>();
		for(int i=0;i<5000;i++) {
			listaTestes.add(i);
		}
		for (int i=0;i<listaTestes.size();i++)
		{
			
		}
		for(Integer i : listaTestes) {
			System.out.println(i);
		}
		for(int i=0;i<listaTestes.size();i++) {
			listaTestes.remove(i);
		}
		long endTimeHash = System.nanoTime();
		long timeHash = endTimeHash-startTimeHash;
		System.out.println("Hash time="+timeHash);
		
		long startTimeTree = System.nanoTime();
		TreeSet<Integer> listaTestes2 = new TreeSet<Integer>();
		for(int i=0;i<5000;i++) {
			listaTestes2.add(i);
		}
		for(int i=0;i<listaTestes2.size();i++) {
			
		}
		for(Integer i : listaTestes2) {
			System.out.println(i);
		}
		for(int i=0;i<listaTestes2.size();i++) {
			listaTestes2.remove(i);
		}
		long endTimeTree = System.nanoTime();
		long timeTree = endTimeTree-startTimeTree;
		System.out.println(timeTree);
	}
	
	

}
