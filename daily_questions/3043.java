class Solution {
    public int longestCommonPrefix(int[] arr1, int[] arr2) {
        HashSet<Integer> st = new HashSet<>();
        for(int E : arr1) {
            String s = Integer.toString(E);
            int temp = 0;
            for(char ch : s.toCharArray()) {
                int num = ch - '0';
                temp = temp * 10 + num;
                st.add(temp);
            }
        }
        int res = 0;
        for(int E : arr2) {
            String s = Integer.toString(E);
            int temp = 0;
            int cnt = 0;
            for(char ch : s.toCharArray()) {
                int num = ch - '0';
                cnt++;
                temp = temp * 10 + num;
                if(st.contains(temp)) {
                    res = Math.max(res, cnt);
                }
            }
        }
        return res;
    }
}