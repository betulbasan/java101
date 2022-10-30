package siniflar.ogrenciBilgiSistemi;

public class Main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Mahmut", "TRH", "455");
        Teacher t2 = new Teacher("ali", "FZK","234");
        Teacher t3 = new Teacher("veli", "BIO","154");
        //t1.print();
        Course tarih = new Course("Tarih", "101","TRH",0.6);
        tarih.addTeacher(t1);
        Course fizik = new Course("Fizik", "102","FZK",0.6);
        fizik.addTeacher(t2);
        Course biyo = new Course("Biyoloji", "103","BIO",0.6);
        biyo.addTeacher(t3);

        Student s1 = new Student("ayse","123","4",tarih,fizik,biyo);
        s1.addBulkExamNote(100,100,100);
        s1.addBulkVerbalNote(50,50,50);
        s1.isPass();
    }
}
