package ru.mirea.pr2;

public class Main {
    public static void main(String[] args){
            Author a1=new Author("Vitalik","vitalik@email.com",'M');
            System.out.println(a1);
        a1.setEmail("vitalikrogalik@email.com");
        System.out.printf(a1.getEmail());
    }
}
