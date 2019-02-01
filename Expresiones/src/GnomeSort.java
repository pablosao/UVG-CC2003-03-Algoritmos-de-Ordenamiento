/**
 * Código tomado del libro Java Structures
 * Bailey, D. (2007). Java Structures. Williams College.
 * 
 * @author Andrea Elias
 * @author Pablo Sao
 * @version 01/02/2019
 */

public class GnomeSort {
	
    public static int[] gnomeSort(int[] nums){ //takes unsorted array, returns sorted
        int index=1; //start of search
        int temp;
        while(index<nums.length){ //until the array is fully sorted
            if(nums[index]<nums[index-1]){ //compares nums[index] with nums[index-1]. if smaller, switch.
                temp=nums[index];
                nums[index]=nums[index-1];
                nums[index-1]=temp;
                index--; //must decrease index to recheck. since they have been swapped, the array may still be out of order
                if(index==0){ //prevents index from going lower than 1
                    index=1;
                }
            }
            else{
                index++; //if sorted, go up
            }
        }
        return(nums); //reaching the end of the array- completely sorted, returns nums
    }
}

