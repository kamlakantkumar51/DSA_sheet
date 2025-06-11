class Solution {
    public String largestNumber(int[] nums) {
        //step 1: firstly,convert array to string format
        String newstr[] = new String[nums.length];

        //then put the elements of array to the string
        for(int i=0;i<nums.length;i++){
            newstr[i] = Integer.toString(nums[i]);
        }
        //sorting by comparing string
        Arrays.sort(newstr,(a,b) -> (b+a).compareTo(a+b));

        //edge case
        if(newstr[0].equals("0")){
            return "0";
        }

        //finally i will have to return the answer in to tostring form,so i will use string builder
        StringBuilder largestnum = new StringBuilder();
        for(String numstr:newstr ){
            largestnum.append(numstr);
        }
        return largestnum.toString();
    }
}
