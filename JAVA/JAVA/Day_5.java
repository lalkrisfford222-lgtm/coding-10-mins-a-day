public class Day_5 {
    public static void main(String[] args) {
        String firstName = "goOGlE ";
        String lastName = "chROme";
        String fullName = firstName + lastName;
        String upperCase = fullName.toUpperCase();
        String lowerCase = fullName.toLowerCase();
        String result = capitalizeWords(fullName);

        System.out.println(fullName);
        System.out.println(lowerCase);
        System.out.println(upperCase);
        System.out.println(result);
    }
//Google Chrome
    public static String capitalizeWords(String input) {
        String[] words = input.split("\\s");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            result.append(Character.toTitleCase(word.charAt(0)))
                    .append(word.substring(1).toLowerCase())
                    .append(" ");
        }

        return result.toString().trim();
    }
}