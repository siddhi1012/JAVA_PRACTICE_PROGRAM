package String;

public class frequencyCharacter {
    public static void main(String[] args) {
        String str = "My Username is Siddhi@1012";

        int freq[] = new int[256];

        // count frequency
        for (char c : str.toCharArray()) {
            freq[c]++;
        }

        // print frequency

        for (int i = 0; i < 256; i++) {
            if(freq[i] >0 && (char)i != ' ')
            System.out.println((char) i + ":" + freq[i]);
        }
    }

}
