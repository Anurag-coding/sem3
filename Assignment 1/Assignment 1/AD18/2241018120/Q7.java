public class Q7{

     public static void main(String[]args){
        String a="hello"; 
        String b="World";

        System.out.println("Hashcode of a = "+a+":"+a.hashCode());
        System.out.println("Hashcode of b = "+b+":"+b.hashCode());

        String c="hello";

        System.out.println("Hashcode od c = "+c+":"+c.hashCode());

        Integer a_hashcode=a.hashCode();
        Integer c_hashcode=c.hashCode();

        System.out.println("Hashcode of a==c:"+(a_hashcode).equals(c_hashcode));


     }
}