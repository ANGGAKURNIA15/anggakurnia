package com.company;

public class Main {
    String name;
    int speed, healtpoint;

    public void run(){
        System.out.println (this.name+" perlahan mulai berlari...");
    }
    public void kecepatan(){
        if (this.speed==100){
            System.out.println("dengan kecepatan "+this.speed+" pemain semakin cepat berlari... ");
        }else if(this.speed==50 ){
            System.out.println("terkena halangan kecepatan lari berkurang menjadi "+this.speed);
        }else if(this.speed==0){
            System.out.println("terkena jebakan kecepatan menjadi "+this.speed+" dan tidak bisa berlari...");
        }
    }
    public void dead(){
            if(this.healtpoint ==0){
                System.out.println("dengan healtpoint "+this.healtpoint+" kemudian mati dan kembali awal permainan...");
            }else{
                System.out.println("masih tetap berlari dengan healtpoint "+this.healtpoint);
        }
    }

    public static void main(String[] args) {
        Main pemain=new Main();
        pemain.name="budiman";
        pemain.speed=100;
        pemain.healtpoint=100;

        Main pemain1=new Main();
        pemain1.speed=50;
        pemain1.healtpoint=50;

        Main pemain2=new Main();
        pemain2.speed=0;
        pemain2.healtpoint=0;

        pemain.run();
        pemain.kecepatan();
        pemain.dead();
        pemain1.kecepatan();
        pemain1.dead();
        pemain2.kecepatan();
        pemain2.dead();
    }
}
