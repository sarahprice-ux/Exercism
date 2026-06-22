import java.util.Arrays;

class SqueakyClean {
    static String clean(String identifier) {

        char [] asArray = identifier.toCharArray();
        StringBuilder builder = new StringBuilder();
        boolean capitalizeNext = false;

        for (int i = 0; i < asArray.length; i++){
            char ch = asArray[i];
            if(Character.isWhitespace(asArray[i])){
                builder.append('_');
            } else if (ch == '-') {
                 capitalizeNext = true;
            } else if (capitalizeNext){
                builder.append(Character.toUpperCase(ch));
                capitalizeNext = false;
            } else if (!(Character.isDigit(ch)) && (!(Character.isLetter(ch)))) {


            } else {
                switch (ch) {
                    case '4':
                        builder.append('a');
                        break;
                    case '3':
                        builder.append('e');
                        break;
                    case '0':
                        builder.append('o');
                        break;
                    case '1':
                        builder.append('l');
                        break;
                    case '7':
                        builder.append('t');
                        break;
                    default: builder.append(ch);

                }
            }

        } return builder.toString();

    }
}
