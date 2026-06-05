package Pertemuan15;

public class RefactoringKeEnhancedFor {
    public static void main(String[] args) {
        String[] buah = {"Apel", "Jeruk", "Mangga", "Anggur"};
        for(String buahan : buah){
            System.out.println("Buah: " + buahan);
        }
    }
}