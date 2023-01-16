
package homework5;

public class ArraySpaceExample {
    public static void main(String[] args) {
        char[] spaceArray = {' ', ' ', 'c', 'a', 't', ' ', 'b', 'i', ' ', 'b', ' '};
        int startIndex = 0;
        int endIndex = spaceArray.length - 1;

        for (int i = 0; i < spaceArray.length; i++) {
            if (spaceArray[i] == ' ') {
                startIndex++;
            } else {
                break;
            }
        }
        for (int i = spaceArray.length - 1; i >= 0; i--) {
            if (spaceArray[i] == ' ') {
                endIndex--;
            } else {
                break;
            }
        }
        int j = 0;
        char[] result = new char [(endIndex - startIndex)+1];
        for (int i = startIndex; i < endIndex+1; i++) {
            result[j++] = spaceArray[i];
        }

        for (int i = 0; i < result.length-1; i++) {

        }
        System.out.print(result);
    }
}


















