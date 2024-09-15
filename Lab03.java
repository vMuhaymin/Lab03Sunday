public class Main {

    public static void main(String[] args){
        String[] student = new String[5];
        student[0]= "Ahmed";
        student[1]= "Ali";
        student[2]="saleh";
        student[3]="Yasser";
        student[4]="Nolan";
        readStudents(student);
        


    }
      public static void readStudents(String[] a){
        int length = a.length;
        for(int i=0; i< length; i++){
            System.out.println(a[i]);
        }
    }

}