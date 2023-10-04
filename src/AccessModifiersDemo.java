public class AccessModifiersDemo {
    private int privateVar;
    private double defaultVar;
    protected boolean protectedVar;
    public String publicVar;

    int getPrivateVar(){

        return privateVar;
    }
    double getDefaultVar(){
        return defaultVar;
    }
    protected boolean getProtectedVar(){
        return protectedVar;
    }
    public String getPublicVar(){
        return publicVar;
    }


}
