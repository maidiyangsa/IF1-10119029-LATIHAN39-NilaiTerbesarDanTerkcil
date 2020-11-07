/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.AdrianMaidiyangsa;
import java.util.*;
/**
 *
 * @author Beta Three
 * NAMA         : Adrian Maidiyangsa
 * KELAS        : IF-1
 * NIM          : 10119029
 * Deskripsi Program : Program ini berisi program menentukan nilai terbesar dan terkecil, program ini dibuat sendiri
 * dan dibantu oleh sumber-sumber yang ada diinternet
 */
public class NilaiTerbesarDanTerkecil {

    int nilai[];
    String petugas;
    
    public void masukkanData(){    
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan Nama Petugas : ");
        petugas = scan.next();
        System.out.print("Masukkan Banyaknya Nilai Mahasiswa : ");        
        int jumlah = scan.nextInt();
        nilai = new int[jumlah];
        for(int i = 0; i < jumlah; i++){
            System.out.print("Masukkan Nilai Mahasiswa ke-"+(i+1)+" = ");
            nilai[i] = scan.nextInt();
        } 
    }
    
    public int nilaiTerkecil(){
        int nilaiTerkecil = nilai[0];
        for(int x : nilai){
            if(nilaiTerkecil > x){
                nilaiTerkecil = x;
            }            
        }
        return nilaiTerkecil;
    }
    
    public int nilaiTerbesar(){
        int nilaiTerbesar = nilai[0]; 
        for(int x : nilai){           
           if(nilaiTerbesar < x){
                nilaiTerbesar = x;
           }            
        }
        return nilaiTerbesar;
    }
    
    public void tampilNilai(){
        System.out.println();
        System.out.println("=====Hasil Nilai Mahasiswa=====");
        int num = 1;
        for(int x : nilai){
            System.out.println("Nilai Mahasiswa ke-"+num+" = "+x);
            num++;
        }
        System.out.println();
        System.out.println("Nilai Terbesar adalah "+nilaiTerbesar());
        System.out.println("Nilai Terkecil adalah "+nilaiTerkecil());
        System.out.println();
        System.out.println("Petugas : "+petugas);
    }
    
}
