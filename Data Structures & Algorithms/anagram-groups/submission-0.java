class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> hm = new HashMap<>();

        for (int i = 0 ; i  < strs.length ; i++) {
            char [] cs = strs[i].toCharArray();
            Arrays.sort(cs);
            String str = new String(cs);
            hm.putIfAbsent(str, new ArrayList<>());
            hm.get(str).add(strs[i]);
        }

        return new ArrayList<>(hm.values());
    }
}
