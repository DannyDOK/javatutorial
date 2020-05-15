package cn.edu360.javase24.day07.interfacedemo2;

import java.util.Scanner;

public class UserMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1.Login\n2.Register\n");

        UserManage userManage = null;

        String nl = sc.nextLine();
        switch (nl) {
            case "1":
                System.out.println("Enter account name:");
                String username = sc.nextLine();
                System.out.println("Enter password");
                String pwd = sc.nextLine();

                boolean login = userManage.login(username, pwd);
                if (login) {
                    System.out.println("Logged in successfully");
                } else {
                    System.out.println("Account or password is wrong");
                }
                break;
            case "2":
                System.out.println("Enter account name:");
                String name = sc.nextLine();
                System.out.println("Enter password");
                String pwd1 = sc.nextLine();
                System.out.println("Confirm password");
                String pwd2 = sc.nextLine();

                String register = userManage.register(name, pwd1, pwd2);
                switch(register) {
                    case "1":
                        System.out.println("Passwords don't match");
                    case "2":
                        System.out.println("Name exists");
                    case "3":
                        System.out.println("Successfully registered");
                }
        }
    }
}
