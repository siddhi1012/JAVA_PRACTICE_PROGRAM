package String;

public class removeDuplicate {
    public static void main(String[] args) {
        String str = "Programming";
        String res = "";
        for (int i = 0; i < str.length(); i++) {
            if (res.indexOf(str.charAt(i)) == -1) {
                res += str.charAt(i);
            }
        }
        System.out.println(res);
    }
}
