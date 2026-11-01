class Solution {
    public int firstUniqChar(String s) {
        char arr[]=s.toCharArray();
        HashMap<Character,Integer> str=new HashMap<>();
    for(char ch:arr)
    {
    str.put(ch, str.getOrDefault(ch, 0) + 1);
    }
for(int i = 0; i < arr.length; i++) {
            if(str.get(arr[i]) == 1) {
                return i;
            }
}
return -1;
    }
}