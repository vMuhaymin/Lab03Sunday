public class Main {

    public static void main(String[] args){
        String[] student = new String[5];
        student[0]= "Mossa";
        student[1]= "Ali";
        student[2]="saleh";
        student[3]="Yasser";
        student[4]="Nolan";
        readStudents(student);
         randomgroups(student);
        


    }
      public static void readStudents(String[] a){
        int length = a.length;
        for(int i=0; i< length; i++){
            System.out.println(a[i]);
        }
    }

       public static void randomgroups(String[] a){
        Random rand = new Random();
        int length = a.length;
        Boolean done=true;
        int i=0;
        while(done){
            int r = rand.nextInt(length);
            if(r<0){
                r=0;
            }
            if(length== i){
                break;
            }
            i++;
            System.out.println(a[r]+"  With  "+a[r-1]);

        }

    }

}
