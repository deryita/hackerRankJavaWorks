public class militaryTime {

    public static String timeConversion(String s) {
        // Write your code here

        StringBuffer sb = new StringBuffer(s.substring(0, s.length() - 2));
        String amOrpm = s.substring(s.length() - 2);
        int newhour = 0;
        // if you are suspicious of string length
        //String substring = str.length() > 2 ? str.substring(str.length() - 2) : str;
        System.out.println(sb);
        System.out.println(amOrpm);

        if (amOrpm.equalsIgnoreCase("am") && (s.substring(0,2).equalsIgnoreCase("12"))) {
          sb.setCharAt(0,'0');
          sb.setCharAt(1, '0');
        }

        if (amOrpm.equalsIgnoreCase("pm") && !(s.substring(0,2).equalsIgnoreCase("12"))){
            newhour = Integer.parseInt(s.substring(0,2)) + 12;
            String newHourString = String.valueOf(newhour);
            System.out.println(newhour);
            sb.setCharAt(0,newHourString.charAt(0));
            sb.setCharAt(1,newHourString.charAt(1));
        }
        return sb.toString();
    }
}
