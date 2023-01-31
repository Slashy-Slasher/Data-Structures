/**
 *  
 * @author your name
 *
 */

public class SpecialArray {
	
	/**
	 * This function is to find two different indexes of elements in an 1D sorted array with sum of the two elements equals a given target value. 
	 * If found, return the indexes of the two elements as an array (indexes start from 0). If not found, return an array as [-1,-1].
	 * @param arr - 1D array
	 * @return ret - If found, an 1D array with the two indexes [small_index, large_index]. If not found, ret = [-1,-1]
	 * Assumption: The elements are unique and sorted in ascending order.
	 * Example1:   arr = {1 3 5 6}, target = 7
	 *             ret = [0, 3]
	 *            
	 * Example2:   arr = {1 3 5 6}, target = 10
	 *             ret = [-1, -1]            
	 *            
	 */
	 public static int[] twoIndexes(int[] nums, int target) {
	     int[] ret = {-1, -1};    // if no match, return {-1ï¼Œ -1}
	     
	     //TO-DO: Please fill your code here ....
	     /*
	  
	     */
	     /*
	     for(int i = 0; i<nums.length;i++)
	     {
	    	 System.out.print(nums[i] + " ");
	     }
	     */
	     //System.out.println();
	     for(int i = 0 ; i < nums.length; i++)
	     {
	    	 for(int j = 0; j < nums.length;j++)
	    	 {
	    		 //System.out.println(nums[i] + " + " + nums[j] + " == " + target +"?");
	    		 if(i == j){
	    		 }
	    		 else if((nums[i]+nums[j]) == target)
	    		 {
	    			 ret[0] = i;
	    			 ret[1] = j;
	    			 i = nums.length;
	    			 j = nums.length;
	    		 }
	    	 }
	     }
	     
	     //System.out.println(ret[0] + " + " + ret[1] + " = " + target);
	     
		 return ret; 
	    }
	
	
	
	
	
	
	/**
	 * This function is to print the the outer surrounding elements of 2D n x m array in clock-wise order.
	 * @param arr - 2D array
	 * @return String - the outer surrounding elements of 2D arr in clock-wise order (numbers should be separated by single space)
	 *
	 * Example:    1   2   3  4
	 *             5   6   7  8
	 *             9   10  11 12
	 * 
	 * Return:   1 2 3 4 8 12 11 10 9 5
	 * 
	 */
	public static String printSurroundingArray(int[][] arr)
	{
		 String ret =  "";
			
		 // TO-DO: Please fill your code here ...
		 
		 //Top Side
		 for(int i = 0; i<arr[0].length; i++)
		 {
			 ret += arr[0][i];
			 ret += " ";
		 }
		 //Right Side
		 for(int i = 1; i<arr.length-1; i++)
		 {
			 ret += arr[i][arr.length-1];
			 ret += " ";
		 }
		 //Bottom
		 for(int i = arr.length-1; i != 0; i--)
		 {
			 ret += arr[arr.length-1][i];
			 ret += " ";
		 }
		 //Left Side
	     for(int i = arr.length-1; i != 0; i--)
		 {
			 ret += arr[i][0];
			 ret += " ";
		 }
		 
		 //System.out.println(ret);
		 return ret.trim();
	  	
	}	
	
	
		
	/************   This is an 10 points -  Extra Credit Question  *****************************
	 * This function is to print a 2D n x n square array in Spiral oder
	 * @param arr - 2D array
	 * @return String - the spiral order of arr (numbers should be separated by single space)
	 * Example:    1   2   3
	 *             4   5   6
	 *             7   8   9
	 * 
	 * Return:   1  2  3 6 9 8 7 4 5
	 */
	public static String printSprialArray(int[][] arr)
	{
		 String ret =  "";
		
		// TO-DO: Please fill your code here ...
		//Top Side
		 for(int i = 0; i<arr[0].length; i++)
		 {
			 ret += arr[0][i];
			 ret += " ";
		 }
		 //Right Side
		 for(int i = 1; i<arr.length-1; i++)
		 {
			 ret += arr[i][arr.length-1];
			 ret += " ";
		 }
		 //Bottom
		 for(int i = arr.length-1; i != 0; i--)
		 {
			 ret += arr[arr.length-1][i];
			 ret += " ";
		 }
		 //Left Side
	     for(int i = arr.length-1; i != 0; i--)
		 {
			 ret += arr[i][0];
			 ret += " ";
		 }
	     
		
	     return ret.trim();	  	
		
	}	
	

}