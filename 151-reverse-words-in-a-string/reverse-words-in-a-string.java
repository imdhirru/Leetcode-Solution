class Solution {
    public String reverseWords(String s) {
        String rem = s.trim();
        String[] arr = rem.split(" ");
        List<String> list = new ArrayList<>();
        for(String word : arr){
            if(!word.isEmpty()){
                list.add(word);
            }
        }
        Collections.reverse(list);
        return String.join(" ", list);
    }
}