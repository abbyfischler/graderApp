class Grader2 {

    public static void main(String[] args) {

        // read in 3 command line arguments
        // the program expects 3 command line arguments
        if (args.length < 3) {
            System.err.println("\n **USAGE\n\tyou need to pass in 3 grades to run this program\n");
            System.err.println("\tIf you are using Make the command is:\n\t make grade x=# y=# z=#\n");
            System.exit(1);
        }

        // Note the data types of these values!
        // Are they correct for what you want to do??
        String grade1 = args[0];
        String grade2 = args[1];
        String grade3 = args[2];


        double g1 = convertFromStringToDouble(grade1);
        double g2 = convertFromStringToDouble(grade2);
        double g3 = convertFromStringToDouble(grade3);

        double average = (g1 + g2 + g3) / 3;
        String letterGrade;

        if (average >= 90) {
            letterGrade = "A";
        } else if (average >= 80) {
            letterGrade = "B";
        } else if (average >= 70) {
            letterGrade = "C";
        } else if (average >= 60) {
            letterGrade = "D";
        } else {
            letterGrade = "F";
        }
        letterGrade = letterGrade + getModifer(average);
        System.out.printf("your letter grade is %s", letterGrade);
    }

    public static String getModifer(double avg) {
        String modifier = "";
        double digit2 = avg % 10;

        //No A+ and F-
        if (avg >= 68 && avg >= 93) {
            if (digit2 < 3.0) {
                modifier = "-";
            } else if (digit2 >= 7.0) {
                modifier = "+";
            }
            return modifier;
        }
        return "";
    }
    /**
     * convert a string to a double
     * @param s the string to convert
     * @return the double that represents the string
     *
     * @throws error if the string can not be parsed into a double
     */
    public static double convertFromStringToDouble(String s) {
        return Double.parseDouble(s);
    }

}
