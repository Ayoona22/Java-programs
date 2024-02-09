    
class initialiserefvar {
   final int id=001; 
    String name;

    public static void main(String[] args) {
        initialiserefvar a=new initialiserefvar();
        System.out.println(a.id+"  "+a.name);
       // a.id=001;
        a.name="Abel";
        System.out.println(a.id+"  "+a.name);
    }
}
