package siniflar.boksMaci;

public class Match {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;

    Match(Fighter f1, Fighter f2, int minWeight, int maxWeight) {
        int change= (int) Math.round(Math.random());
        if(change ==0){
            this.f1=f1;
            this.f2=f2;
        }
        if(change==1){
            this.f1=f2;
            this.f2=f1;
        }
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }

    boolean isCheck() {
        return ((this.f1.weight>=minWeight && this.f1.weight<=maxWeight) &&
                (this.f2.weight>=minWeight && this.f2.weight <=maxWeight));
    }
    boolean isWin(){
        if(this.f1.health==0){
            System.out.print("Kazanan : "+this.f2.name);
            return true;
        }
        if(this.f2.health==0){
            System.out.print("Kazanan : "+this.f1.name);
            return true;
        }
        return false;
    }
    void run(){
        if(isCheck()) {
            while (this.f1.health > 0 && this.f2.health > 0) {
                System.out.println("====Yeni Round========");
                System.out.println(this.f1.name +" health is"+this.f1.health);
                System.out.println(this.f2.name +" health is"+this.f2.health);
                this.f2.health = this.f1.hit(this.f2);
                if(isWin()){
                    break;
                }
                this.f1.health = this.f2.hit(this.f1);
                if(isWin()){
                    break;
                }
            }
        }
        else {
            System.out.println("Sporcuların sikletleri uygun değil");
        }
    }
}
