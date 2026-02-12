class Solution {
    public int[] shuffle(int[] nums, int n) {
        int []arr=new int[nums.length];
        Queue<Integer> queue1 = new LinkedList<>();
Queue<Integer> queue2 = new LinkedList<>();
        for(int i=0;i<n;i++){
            queue1.add(nums[i]);
        }
        for(int i=n;i<nums.length;i++){
            queue2.add(nums[i]);
        }
        for(int i=0;i<nums.length;i++){
            if(i%2==0){
            arr[i]=queue1.poll();
        }
        else {
            arr[i]=queue2.poll();
        }
        }
        return arr;
    }
}