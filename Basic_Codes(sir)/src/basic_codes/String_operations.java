package basic_codes;

public class String_operations {

    public static void main(String[] args) {
        Integer ax = 100;
        String s = "1219382";
        int r = Integer.parseInt(s);
        System.out.println(r);
        String s1 = "Java Programming ";
        String s2 = "Java";
        System.out.println(+s1.length());
        if (s1.equals(s2)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        System.out.println("charaT" + s1.charAt(3));
        s1.equalsIgnoreCase(s2);
        s1.concat(s2);
        System.out.println("COncate" + s1);
        s1 = s1.concat(s2);
        System.out.println(s1);
        System.out.println(s2);
        String s3 = "Java";
        s3 = s3.replace("va", "a");
        System.out.println(s3);
        String s4;
        s4 = s1.substring(4, 8);
        System.out.println(s4);
        String s5 = "Programing";
        s5 = s5.toLowerCase();
        System.out.println(s5);
        s5 = s5.toUpperCase();
        System.out.println(s5);
        String s6 = "565";
        s6.toString();
        System.out.println(s6);
        String s7 = "\n\t" + "   123 345 ";
        s7.trim();
        System.out.println(s7.trim() + "#");
        StringBuffer sb = new StringBuffer();
        sb.append("Java");
        sb.append("WOrld");
        sb.append("Programming");
        System.out.println("StingBuffer" + sb.toString());

    }

}
