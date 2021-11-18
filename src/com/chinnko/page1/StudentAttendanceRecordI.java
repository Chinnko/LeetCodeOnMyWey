package page1;

public class StudentAttendanceRecordI {
    public static void main(String[] args) {

    }

    public static boolean checkRecord(String s) {
        int l = 0, a = 0;
        for (char c : s.toCharArray()) {
            if (c == 'A') {
                if (a == 1) {
                    return false;
                }
                a = a + 1;
            }
            if (c == 'L') {
                if (l == 2) {
                    return false;
                }
                l = l + 1;
                continue;
            }
            if (l != 0) {
                l = 0;
            }
        }
        return true;
    }

}
