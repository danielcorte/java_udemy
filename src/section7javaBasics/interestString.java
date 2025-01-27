package section7javaBasics;

public class interestString {

    public static void main(String[] args) {

        /*
        Formatar: toLowerCase(), toUpperCase(), trim()
        Recortar: substring(inicio), substring(inicio, fim)
        Substituir: Replace(char, char), Replace(string, string)
        Buscar: IndexOf, LasIndexOf
        str.Split("")
         */

        String original = "abcde FGHIJ ABC abc DEFG    ";

        String s01 = original.toLowerCase();
        String s02 = original.toUpperCase();
        String s03 = original.trim();
        String s04 = original.substring(2);
        String s05 = original.substring(2, 8);
        String s06 = original.replace('a', 'x');
        String s07 = original.replace("abc", "xyz");
        int i = original.indexOf("bc");
        int j = original.lastIndexOf("bc");

        System.out.println("Original: -" + original + "-");
        System.out.println("toLowerCase: -" + s01 + "-");
        System.out.println("toUpperCase: -" + s02 + "-");
        System.out.println("trim: -" + s03 + "-");
        System.out.println("substring: -" + s04 + "-");
        System.out.println("substring2: -" + s05 + "-");
        System.out.println("replace('a', 'x'): -" + s06 + "-");
        System.out.println("replace('abc', 'xyz'): -" + s07 + "-");
        System.out.println("index of: -" + i + "-");
        System.out.println("last index of: -" + j + "-");

    }
}
