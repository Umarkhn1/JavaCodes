package JavaCore;

import java.util.Scanner;

public class IFexample2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите балл требыемый в грант");
        int balldlyagranta = scanner.nextInt();
        System.out.println("Введите балл для контракта");
        int balldlyakontrakta = scanner.nextInt();
        System.out.println("Введите свой балл");
        int ball = scanner.nextInt();;


        if(ball>=balldlyagranta) {
            System.out.println("Поздравляем вы получили грант");
        }
        else if(ball>=balldlyakontrakta && ball<balldlyagranta){
            System.out.println("Поздравляем вы поступили в контракт основе");
            }
        else {
            System.out.println("Поздравляю вы не поступили");
        }


    }
}
