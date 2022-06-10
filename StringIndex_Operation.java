public class StringIndex_Operation {
    public static void main(String[] args) {
        String txt="Hello my name is idris.";
        // For taking a part of a string or slicing a string the substring() function is used. it takes 2 arguments the starting index and the ending index.

        // The substring index goes from 0 as the starting point meaning the character in the  first index will be shown but the character of the last index will be shown as the index of the character we want +1, So the substring end index should always be one more than the index till we want.

        // For checking the length of our string:
        System.out.println(txt.length());// 23
        System.out.println(txt.substring(17, 22));
        System.out.println(txt.substring(17,18));
        System.out.println(txt.substring(0, 5 ));
        System.out.println(txt.substring(22, 23));
    }
}
