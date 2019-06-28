package merkelTree;

import java.util.ArrayList;
import java.util.List;

public class MarkleTree {
	
	private List<String> transactions;

	public MarkleTree(List<String> transactions) {
		 
		this.transactions = transactions;
	}
	
	public List<String> getMarkelRoot(){
		return construct(this.transactions);
	}

	private List<String> construct(List<String> transactions2) {
		 
		 if(transactions2.size()==1) return transactions2;
		 
		 List<String> updateList= new ArrayList<String>();
		 for(int i=0;i<transactions2.size()-1;i+=2) {
			 updateList.add(mergeHash(transactions2.get(i) ,transactions2.get(i+1)) );
		 }
		 if(transactions2.size()%2==1) {
			 updateList.add(mergeHash(transactions2.get(transactions2.size()-1), transactions2.get(transactions2.size()-1)));
		 }
		return construct(updateList);
	}

	private String mergeHash(String string, String string2) {
	 
		return SHA256Helper.getSHA(string+string2);
	}

}
