package LeetCode_Problem;

public class TwoSumArray
{

        public static  int[] twoSum(int[] nums, int target)
        {
            for(int i=0; i<nums.length-1; i++)
            {
                for(int j=i+1; j<nums.length; j++)
                {
                    if(nums[j]+nums[i]==target)
                    {
                        return new int[]{i,j};
                    }
                }
            }
            return new int[]{-1,-1};
        }
    public static void main(String[] args) {
        int nums[]={1,2,3,4,5,6,6};
        int target=10;
        System.out.println(twoSum(nums,target));
    }
    }

