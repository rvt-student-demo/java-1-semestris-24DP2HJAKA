package rvt;

public class GradesAndPoints 
{

    public static String getGrade(int points) {
        if (points < 0) {
            return "impossible!";
        } else if (points <= 49) {
            return "failed";
        } else if (points <= 59) {
            return "1";
        } else if (points <= 69) {
            return "2";
        } else if (points <= 79) {
            return "3";
        } else if (points <= 89) {
            return "4";
        } else if (points <= 100) {
            return "5";
        } else {
            return "incredible!";
        }
    }
}