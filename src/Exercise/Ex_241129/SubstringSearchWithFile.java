/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercise.Ex_241129;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author DUADEPTRAI
 */
public class SubstringSearchWithFile {
    public static void main(String[] args) {
        String inputFile = "input.txt";
        String outputFile = "output.txt";
        
        //Tao file input.txt
        createInputFile(inputFile);
        
        //Doc noi dung tu file input.txt
        String s1 = readFile(inputFile);
        
        if (s1 == null) {
            System.out.println("Khong the doc file");
            return;
        }
        
        //Nhap chuoi s2 tu nguoi dung
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap chuoi can tim kiem (s2): ");
        String s2 = scanner.nextLine();
        
        //Tim vi tri s2 trong s1
        List<Integer> positions = findSubstringPositions(s1, s2);
        
        //Ghi ket qua vao file output.txt
        writeFile(outputFile, s1, s2, positions);
    }
    
    //Tao file input.txt voi noi dung nhap tu nguoi dung:
    public static void createInputFile(String filePath) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap noi dung chuoi (s1) de luu vao file input.txt: ");
        String s1 = scanner.nextLine();

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            writer.write(s1);;
            System.out.println("File input.txt da duoc tao voi noi dung: ");
            System.out.println(s1);
        } catch (IOException e) {
            System.out.println("Loi khi tao file: " + e.getMessage());
        }
    }

    //Doc noi dung tu file
    public static String readFile(String filePath) {
        StringBuilder content = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");
            }
        } catch (IOException e) {
            System.out.println("Loi khi doc file: " + e.getMessage());
            return null;
        }
        return content.toString();
    }

    //Ghi ket qua vao file
    public static void writeFile(String filePath, String s1, String s2, List<Integer> positions) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            writer.write("Noi dung file (s1): \n");
            writer.write(s1 + "\n");
            writer.write("Chuoi can tim (s2): " + s2 + "\n");

            if (positions.isEmpty()) {
                writer.write("Ket qua: Chuoi '" + s2 + "' khong xuat hien trong s1.\n");
                System.out.println("Ket qua: Chuoi '" + s2 + "' khong xuat hien trong s1.");
            } else {
                writer.write("Ket qua: Chuoi '" + s2 + "' xuat hien tai cac vi tri: " + positions + "\n");
                System.out.println("Ket qua: Chuoi '" + s2 + "' xuat hien tai cac vi tri: " + positions);
            }

            System.out.println("Ket qua da duoc ghi vao file: " + filePath);
        } catch (IOException e) {
            System.out.println("Loi khi ghi file: " + e.getMessage());
        }
    }

    public static List<Integer> findSubstringPositions(String s1, String s2) {
        List<Integer> positions = new ArrayList<>();
        
        String lowerS1 = s1.toLowerCase();
        String lowerS2 = s2.toLowerCase();
        int index = lowerS1.indexOf(lowerS2);

        while (index != -1) {
            positions.add(index);
            index = lowerS1.indexOf(lowerS2, index + 1);
        }
        return positions;
        
    }
}
