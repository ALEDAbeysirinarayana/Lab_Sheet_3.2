public class Main {
    public static void main(String []args){
        AccessModifiersDemo demo = new AccessModifiersDemo();
        System.out.println("private variable " + demo.getPrivateVar());
        System.out.println("Default variable " + demo.getDefaultVar());
        System.out.println("Protected variable " + demo.getProtectedVar());
        System.out.println("Public variable " + demo.getPublicVar());
        SubclassDemo sub = new SubclassDemo();
        sub.displayProtectedVar();
    }
}
