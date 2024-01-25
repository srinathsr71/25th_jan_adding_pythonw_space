package javapr.interviewprograms;

public  class pro33 {
    public static void main(String[] args) {
        String lk="NaveenKumarLabsCoding";
        int count=0;
        for(int i=0;i<lk.length();i++){
            if(lk.charAt(i)>='A'&& lk.charAt(i)<='Z'){
                count++;
            }
        }
        System.out.println(count);
    }
    
}