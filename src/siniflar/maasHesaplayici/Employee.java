package siniflar.maasHesaplayici;

public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;

    Employee(String name, double salary, int workHours, int hireYear){
        this.name = name;
        this.salary =salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    double tax(){
        double taxRate = 0.03;
        double tax;
        if(this.salary>1000.0){
            tax = this.salary*taxRate;
            return tax;
        }
        return 0;
    }
    int bonus(){
        if(this.workHours>40){
            return (this.workHours-40) *30;
        }
        return 0;
    }
    double raiseSalary(){
        double newSalary;
        int currentYear = 2021;
        if(currentYear-hireYear<10){
            newSalary = (salary*0.05);
            return newSalary;
        }
        if ((currentYear - hireYear) > 9.0 && (currentYear - hireYear) < 20) {
        newSalary = (salary * 0.10); //20 yıldan az ve 9 yıldan fazla ise %10 zam eklenir.
        return newSalary ;
        }if ((currentYear- hireYear) > 19) {
        newSalary = (salary *0.15); //19 yıldan fazla ise %15 zam eklenir.
        return newSalary ;
        } else {
            return 0.0;
    }
    }

    public String toString() //Kullanıcıya ait bilgiler toString override edilir.
    {

        return "Adı: " + this.name + "\nMaaşı: " + this.salary + "\nÇalışma Saati: " + this.workHours
                + "\nBaşlangıç Yılı: " + this.hireYear + "\nVergi: " + tax() + "\nBonus: " + bonus()
                + " \nMaaş Artışı: " + raiseSalary() + "\nVergi ve Bonuslarla beraber maaş: "
                + (this.salary + bonus() -tax() + "\nToplam Maaş: " + (this.salary + raiseSalary()));
    }
}
