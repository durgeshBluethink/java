class test{


public static String concatWithString(){
    String t ="durgesh";
    for (int i = 0; i < 10000; i++) {
        t = t+"Kumar";
    }
    return t;
}

public static String concatWithStringBuffer(){
    String t1 = new StringBuffer("durgesh");
    for (int i = 0; i < 10000; i++) {
        t1.append("Kumar");
    }
    return t1.toString();
}


    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();  
        concatWithString();  
        System.out.println("Time taken by Concating with String: "+(System.currentTimeMillis()-startTime)+"ms");  
        startTime = System.currentTimeMillis();  
        concatWithStringBuffer();  
        System.out.println("Time taken by Concating with  StringBuffer: "+(System.currentTimeMillis()-startTime)+"ms");  
    }
}