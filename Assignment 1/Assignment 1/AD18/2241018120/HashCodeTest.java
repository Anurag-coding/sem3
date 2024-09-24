public class HashCodeTest {
    
    public static void main (String[]args){
        int a = 144,b=157,c=144;

        HashCodeTest Obj1 = new HashCodeTest(a);
        HashCodeTest Obj2 = new HashCodeTest(b);
        HashCodeTest Obj3 = new HashCodeTest(c);

    }

    System.out.println("HashCode of valueof 144 is"+ obj1.hashCode);
    System.out.println("HashCode of valueof 157 is"+ obj2.hashCode);
    System.out.println("HashCode of valueof 144 is"+ obj3.hashCode);

    Integer Obj1_hashValue=Obj1.hashCode();  
    Integer Obj2_hashValue=Obj2.hashCode();
    Integer Obj3_hashValue=Obj3.hashCode();
    System.out.println("Equality Comparision between"+a+" and"+b+" hash value"+Obj1_hashValue.equals(Obj2_hashValue));
    System.out.println("Equality  Comparision between"+a+" and"+c+" hash value"+Obj1_hashValue.equals(Obj3_hashValue));")


}
