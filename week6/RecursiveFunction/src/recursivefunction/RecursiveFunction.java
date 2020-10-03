/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursivefunction;


public class RecursiveFunction {
  public void nextPermutation(int[] nums) {
        int i = nums.length - 2;
        while (i >= 0 && nums[i + 1] <= nums[i]) {
            i--;
        }
        if (i >= 0) {
            int j = nums.length - 1;
            while (j >= 0 && nums[j] <= nums[i]) {
                j--;
            }
            swap(nums, i, j);
        }
        reverse(nums, i + 1);
    }

 


    private void reverse(int[] nums, int start) {
        int i = start, j = nums.length - 1;
        while (i < j) {
            swap(nums, i, j);
            i++;
            j--;
        }
    }

 


    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    
    public void print(int [] nums){
        
        for(int i=0;i<nums.length;i++){
           System.out.print(nums[i]+" ");
            
        }
        System.out.print(" ");
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          int [] nums={1,5,8,4,7,6,5,3,1};
        RecursiveFunction r=new RecursiveFunction();
        r.nextPermutation(nums);
        r.print(nums);
        
        // TODO code application logic here
    }
    
}

