public class Common {
    static String CommonPrefixUtil(String str1, String str2){
        String result="";
        int n1 = str1.length(), n2 = str2.length();
        for (int i=0, j=0;i<=n1-1&&j<=n2-1;i++,j++){
            if (str1.charAt(i)!=str2.charAt(j)){
                break;
            }
            result+=str1.charAt(i);
        }
        return result;
    }
    static String CommonPrefix(String arr[], int n){
        String prefix = arr[0];
        for (int i=0;i<n-1;i++){
            prefix=CommonPrefixUtil(prefix, arr[i]);
        }
        return prefix;
    }

    public static void main(String[] args) {
        String arr[]={"coding","code","coder","codeislife"};
        int n = arr.length;
        String ans =CommonPrefix(arr,n);
        if (ans.length()>0){
            System.out.println("The longest common prefix -"+ans);
        }
        else
            System.out.println("There is no prefix");
    }
}

