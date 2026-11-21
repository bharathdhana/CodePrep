public class CountVowelsInString {
    static void main(String[] args) {
        String str = "Auditorium";
        int count = 0;

        for(int i=0; i<str.length(); i++) {
            char ch = Character.toLowerCase(str.charAt(i));

            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                count++;
        }
        System.out.println("vowels count:" + count);

        // vowels and consonants
        int vowels = 0;
        int consonants = 0;

        for(int i=0; i<str.length(); i++) {
            char ch = Character.toLowerCase(str.charAt(i));

            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                vowels++;
            else consonants++;
        }
        System.out.println(vowels + " " + consonants);

    }
}
