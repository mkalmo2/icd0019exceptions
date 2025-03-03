package exceptions.basic;

public class Code {

    public String readDataFrom(FakeFile file) {
        throw new RuntimeException("not implemented yet");
    }

    public static Integer minimumElement(int[] integers) {
        if (integers == null || integers.length == 0) {
            return null;
        }

        int minimumElement = integers[0];

        for (int current : integers) {
            if (current < minimumElement) {
                minimumElement = current;
            }
        }

        return minimumElement;
    }

    public static boolean containsSingleLetters(String s) {

        int index = 0;

        try {
            while (index < s.length()) {
                if (s.charAt(index) == s.charAt(index + 1)) {
                    return false;
                }

                index++;
            }
        } catch (Exception e) {
            return true;
        }

        return true;
    }
}
