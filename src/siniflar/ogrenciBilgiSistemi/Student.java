package siniflar.ogrenciBilgiSistemi;

public class Student {
    Course c1;
    Course c2;
    Course c3;

    String name;
    String stuNo;
    String classes;

    double average;
    boolean isPass;

    Student(String name, String stuNo, String classes, Course c1, Course c2, Course c3){
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.average = 0.0;
        this.isPass = false;
    }

    void addBulkExamNote(int note1, int note2, int note3){
        if(note1>=0 && note1<=100){
            this.c1.note = note1;
        }
        if(note2>=0 && note2<=100){
            this.c2.note = note2;
        }
        if(note3>=0 && note3<=100){
            this.c3.note = note3;
        }
    }
    void addBulkVerbalNote(int verbal1, int verbal2, int verbal3){
        if(verbal1>=0 && verbal1<=100){
            this.c1.verbal = verbal1;
        }
        if(verbal2>=0 && verbal2<=100){
            this.c2.verbal = verbal2;
        }
        if(verbal3>=0 && verbal3<=100){
            this.c3.verbal = verbal3;
        }
    }
    void isPass(){
        double c1 = (this.c1.note* this.c1.noteEffect + this.c1.verbal*this.c1.verbalEffect);
        double c2 = (this.c2.note* this.c2.noteEffect + this.c2.verbal*this.c2.verbalEffect);
        double c3 = (this.c3.note* this.c3.noteEffect + this.c3.verbal*this.c3.verbalEffect);

        this.average = (c1+c2+c3)/3.0;

        if(this.average>55){
            System.out.println("geçtiniz");
            isPass=true;
        }else {
            System.out.println("kaldınız");
            isPass =false;
        }
        printNote();
    }
    void printNote(){
        System.out.println(this.c1.name + " " +this.c1.note +" "+this.c1.verbal);
        System.out.println(this.c2.name + " " +this.c2.note+" "+this.c2.verbal);
        System.out.println(this.c3.name + " " +this.c3.note+" "+this.c3.verbal);
        System.out.println("ortalama " + this.average);
    }
}
