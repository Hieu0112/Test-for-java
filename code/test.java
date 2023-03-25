/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package code;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author trinh
 */
class laptrinh{
    private String name;
    private int ac,wa;

    public laptrinh(String name, int ac, int wa) {
        this.name = name;
        this.ac = ac;
        this.wa = wa;
    }

    public int getAc() {
        return ac;
    }

    public int getWa() {
        return wa;
    }

    public String getName() {
        return name;
    }
    
    @Override
    public String toString() {
        return name+"  "+ac+" "+wa;
    }
    
}
public class test {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc=new Scanner(new File("LUYENTAP.in"));
        int t=Integer.parseInt(sc.nextLine());
        List<laptrinh>l=new ArrayList<>();
        while(t-->0){
            String name=sc.nextLine();
            String[]x=sc.nextLine().split("\\s+");
            l.add(new laptrinh(name, Integer.parseInt(x[0]), Integer.parseInt(x[1])));
        }
        Collections.sort(l, Comparator.comparing(laptrinh::getAc).reversed().thenComparing(laptrinh::getWa).thenComparing(laptrinh::getName));
        for (laptrinh object : l) {
            System.out.println(object);
        }
    }
}
