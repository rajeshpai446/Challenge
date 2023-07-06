// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.HashMap;

class HelloWorld {
    public static void main(String[] args) {
        String str="{\"a\":{\"b\":{\"c\":\"d\"}}}";
        HashMap<String,String> hmap = new HashMap<String,String>();
        String key="";
        int i=0;
        while(str.contains(":")){
            String[] strarr = str.split(":",2);
           
            if(i==0){
                key= String.valueOf(strarr[0].charAt(2));
            }else{
                key= key+"/"+String.valueOf(strarr[0].charAt(2));
            }
            //int k = strarr[1].length;
            hmap.put(key,strarr[1].substring(0,strarr[1].length()-1));
             System.out.println("key="+key+"\tvalue="+strarr[1].substring(0,strarr[1].length()-1));
            str=strarr[1].substring(0,strarr[1].length()-1);
            i=i+1;
        }
        String output = hmap.get("a/b/c");
        System.out.println("Final Output"+output);
    }
}
