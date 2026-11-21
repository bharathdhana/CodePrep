public class CharacterOccurrenceInString {
    static void main(String[] args) {
        String str = "Geek for Geeks ExE";
        char target = 'e';
        int count = 0;

        for(int i=0; i<str.length(); i++) {
            char ch = Character.toLowerCase(str.charAt(i));
            if(ch == target) {
                count++;
            }
        }
        System.out.println(count);
    }
}
