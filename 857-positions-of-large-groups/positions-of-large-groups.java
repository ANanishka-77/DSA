class Solution {
    public List<List<Integer>> largeGroupPositions(String s) {
        List<List<Integer>> arr=new ArrayList<>();

        int n=s.length();
        int i=0;
        while(i<n){
            int j=i;
            while(j+1<n&&s.charAt(j)==s.charAt(j+1)){
                j++;
            }
            if(j-i+1>=3){
             arr.add(Arrays.asList(i, j));
            }

          i=j+1;
        }
        return arr;
    }
}