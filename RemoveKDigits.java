// Time Complexity : O(N)
// Space Complexity : O(N)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class Solution {
    public String removeKdigits(String num, int k) {
        LinkedList<Character> li = new LinkedList<>();

        for(char c: num.toCharArray()) {
            while(li.size() > 0 && k > 0 && li.peekLast() > c) {
                li.removeLast();
                k--;
            }
            li.add(c);
        }

        while(k > 0){
            li.removeLast();
            k--;
        }

        StringBuilder sb = new StringBuilder();
        boolean flag = true;
        for(char c : li) {
            if(flag && c =='0') continue;
            flag = false;
            sb.append(c);
        }
        if(sb.length() == 0) return "0";
        return sb.toString();

    }
}