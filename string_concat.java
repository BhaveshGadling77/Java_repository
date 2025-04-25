public class string_concat {
    public static void addStr(String str, int indx, int count, String nStr) {
        if (indx == str.length()) {
            for (int i = 0; i < count; i++) {
                nStr += 'x';
            }
            System.out.print(nStr);
            return;
        }

        char currChar = str.charAt(indx);
        if (currChar == 'x') {
            count++;
        } else {
            nStr += currChar;
        }

        addStr(str, indx + 1, count, nStr);
    }

    public static void main(String[] args) {
        String str = "axbcxxd";
        addStr(str, 0, 0, "");
    }
}