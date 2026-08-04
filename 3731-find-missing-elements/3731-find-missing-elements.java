class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        Arrays.sort(nums);
        int first = nums[0];
        int last = nums[nums.length - 1];
        List<Integer> answer = new ArrayList<>();
        for(int i=first ; i<=last ; i++){
            boolean found = false;
            for (int j = 0; j < nums.length; j++) {

                if (nums[j] == i) {
                    found = true;
                    break;
                }
             }
              if (found == false) {
                answer.add(i);
            }
        }
        return answer;
    }
}