package siniflar.ogrenciBilgiSistemi;

public class Course {
    Teacher teacher; //Teacher sınıfından yeni bir nesne ürettik. niteliklerde sınıf varsa en üste genelde jargon
    String name;
    String code;
    String prefix;
    int note;
    int verbal;
    double noteEffect;
    double verbalEffect;

    Course(String name, String code, String prefix,double verbalEffect){
        this.name = name;
        this.code= code;
        this.prefix= prefix;
        int note = 0;//varsayılan değer
        int verbal = 0;
        this.verbalEffect= verbalEffect;
        noteEffect();
    }
    void noteEffect(){
        this.noteEffect = (1.0- this.verbalEffect);
    }
    void addTeacher(Teacher teacher){
        if(teacher.branch.equals(this.prefix)){
            this.teacher = teacher;
            //printTeacher();
        }else{
            System.out.println("öğretmen ve ders bölümleri uyuşmuyor");
        }
    }
    void printTeacher(){
        this.teacher.print();
    }
}
