
package merkelTree;
import java.math.BigInteger; 
import java.security.MessageDigest; 
import java.security.NoSuchAlgorithmException; 
  
// Java program to calculate SHA hash value 
  
public class SHA256Helper { 
	
	
 
    public static String getSHA(String input) 
    {
    	try {
    		MessageDigest digest = MessageDigest.getInstance("SHA-256");
    		
    		byte[] messageDigest = digest.digest(input.getBytes()); 
  
    		
    		StringBuffer heaxadecimalString= new StringBuffer();
    		
     
    		
    		for(int i=0;i< messageDigest.length;i++) {
    			String heaxa =Integer.toHexString(0xff & messageDigest[i]);
    			
    			if(heaxa.length()==1)
    				
    				System.out.println("testing-"+heaxa.toString());
    				heaxadecimalString.append("0");
    		//	System.out.println("ddd-"+heaxa);
    			
    			heaxadecimalString.append(heaxa);
    		}
    		return heaxadecimalString.toString();
    	}
    	catch(Exception e) {
    		
    	}
		return input; 
    	
    }
   
    
    
   
} 