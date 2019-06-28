package merkelTree;

import java.util.ArrayList;
import java.util.List;

public class app {
	
	public static void main(String args[]) {
		List<String> transactions = new ArrayList<String>();
		
		transactions.add("abc");
		transactions.add("bcd");
		transactions.add("cds");
		transactions.add("kld");
		transactions.add("mks");
		transactions.add("zyx");
		transactions.add("tsu");
		 MarkleTree markleTree = new MarkleTree(transactions);
		 
		 System.out.print("root has"+markleTree.getMarkelRoot().get(0));
		
	}

}
