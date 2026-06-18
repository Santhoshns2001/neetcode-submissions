class Solution {

    public String encode(List<String> strs) {

        StringBuilder sblr= new StringBuilder();

        for(String str:strs){
            sblr.append(str.length());
            sblr.append("#");
            sblr.append(str);
        }

        return sblr.toString();

    }

    public List<String> decode(String str) {
        int i=0;
        List<String> decoder=new ArrayList<>();
        while(i<str.length()){
            int j=i;
            while(str.charAt(j)!='#'){
                j++;
            }
            int length=Integer.parseInt(str.substring(i,j));
            j++;
            String word= str.substring(j,j+length);
            decoder.add(word);
            i=j+length;
        }
        return decoder;
    }
}
