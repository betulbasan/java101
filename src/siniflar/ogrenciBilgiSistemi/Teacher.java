package siniflar.ogrenciBilgiSistemi;

public class Teacher {
    String name;
    String phone;
    String branch;

    Teacher(String name, String branch, String phone){
        this.name = name;
        this.phone = phone;
        this.branch= branch;
    }
    void print(){
        System.out.println(this.name);
        System.out.println(this.phone);
        System.out.println(this.branch);
    }

}
