package Strings;
class ToLowerCase{
    public String toLowerCase(String s) {
        StringBuilder sb=new StringBuilder();
         for(char ch: s.toCharArray()){  
            if(ch>='A' && ch<='a'){
             sb.append((char)(ch+32));
            }else{
                sb.append(ch); 
            }
        }
        return sb.toString();
    }
}
