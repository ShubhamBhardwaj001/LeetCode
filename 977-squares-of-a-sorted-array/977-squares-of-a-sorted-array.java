class Solution {
    public int[] sortedSquares(int[] nums) {
        int front = 0;
        int temp[]=new int[nums.length];
        int back = nums.length-1;
        int pos=back;
        int rem=0;
        while(front!=back){
            if(Math.abs(nums[front])>Math.abs(nums[back])){
                temp[pos]=nums[front]*nums[front];
                front++;
                rem=back;
            } else{
                temp[pos]=nums[back]*nums[back];
                back--;
                rem=front;
            }
            pos--;
        }
        temp[pos]=nums[rem]*nums[rem];
        return temp;
        
    }
}