public class Solution {
	public ArrayList<ArrayList<String>> partition(String a) {
	    
	    ArrayList<ArrayList<String>> result = new ArrayList<ArrayList<String>>();
	    if (a.equals("") || a.length() == 0)
	        return result;
	        
	    ArrayList<String> list = new ArrayList<>();
	    helper(result,a,list, 0);
	        
	    return result;     
	    
	}
	
	public void helper(ArrayList<ArrayList<String>> result, String str, 
	                    ArrayList<String> list, int index){
	    
	    if( index == str.length()){
	        ArrayList<String> temp = new ArrayList<String>(list);
	        result.add(temp);
	        return;
	    }

	    for(int i=index+1; i<=str.length(); i++){
	        String substr = str.substring(index,i);
	        if(isPalindrome(substr)){
	            list.add(substr);
	            helper(result,str,list,i);
	            list.remove(list.size()-1);
	        }
	    }
	    
	}
	
	private boolean isPalindrome(String str) {
    	int left = 0;
    	int right = str.length() - 1;
     
    	while (left < right) {
    		if (str.charAt(left) != str.charAt(right)) {
    			return false;
    		}
     
    		left++;
    		right--;
    	}
     
    	return true;
    }
}
