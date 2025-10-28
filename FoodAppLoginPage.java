package pk.org.cas.Hotel;

import java.util.Scanner;

public class FoodAppLoginPage {
    //declare variable
    private String gMail;
    private String password;
    private int code;
    private String name;
    private String secondName;
    private long cnic;
    private String  phoneNumber;
//    private String password_2;

    //for password
    public static final char LETTER_1 = 'a';
    public static final char LETTER_2 = 'z';
    public static final char LETTER_3 = 'A';
    public static final char LETTER_4 = 'Z';
    public static final char INTEGER = '0';
    public static final char INTEGER_2 = '9';

    //for code
    public static final int CODE = 1000;
    public static final int CODE_2 = 5000;

    public static final char AT_RATE = '@';
    public static final char SUB = '-';
    public static final char UNDER_SCORE = '_';
    public static final char NOT_EQUAL = '!';
    public static final char HASH_TAG = '#';


    //create getter and setter
    public void setName(String name) {
        this.name = name;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public void setgMail(String gMail) {
        this.gMail = gMail;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public void setCNIC(long cnic) {
        this.cnic = cnic;
    }

    public void setPhoneNumber(String  phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    public String getgMail() {
        return gMail;
    }

    public String getPassword() {
        return password;
    }

    public int getCode() {
        return code;
    }


    public String getName() {
        return name;
    }

    public String getSecondName() {
        return secondName;
    }

    public long getCnic() {
        return cnic;
    }

    public String  getPhoneNumber() {
        return phoneNumber;
    }

    public FoodAppLoginPage(String gMail) {
        this.gMail = gMail;
    }

    public FoodAppLoginPage() {
    }

    public FoodAppLoginPage(String password, int code, String name) {
        this.password = password;
        this.code = code;
        this.name = name;
    }


    public FoodAppLoginPage(String gMail, String password, int code, String name, String secondName, long cnic, String phoneNumber) {
        this.gMail = gMail;
        this.password = password;
        this.code = code;
        this.name = name;
        this.secondName = secondName;
        this.cnic = cnic;
        this.phoneNumber = phoneNumber;
    }

    public FoodAppLoginPage(String name, String secondName, long cnic) {
        this.name = name;
        this.secondName = secondName;
        this.cnic = cnic;
    }

    public FoodAppLoginPage(String  phoneNumber, long cnic) {
        this.phoneNumber = phoneNumber;
        this.cnic = cnic;
    }

    public FoodAppLoginPage(String phoneNumber, String password) {
        this.phoneNumber = phoneNumber;
        this.password = password;
    }

    public void login() throws InterruptedException {

        //Ask a choice from user
        Scanner scanner = new Scanner(System.in);
        System.out.print("SignIn  or  signup: ");
        String choice = scanner.nextLine();

        //switch statement
        switch (choice) {
            case "signin":
                //take input by the user
                System.out.print("Enter your Gmail address:  ");
                setgMail(scanner.nextLine());
                System.out.print("Enter your password: ");
                setPassword(scanner.nextLine());

                String pass = getPassword();
                if (pass.length() >= 8) {
                    boolean smallAlphabet = false;
                    boolean capitalAlphabet = false;
                    boolean specialCharacter = false;
                    boolean integer = false;

                    for (int i = 0; i < pass.length(); i++) {
                        char ch = pass.charAt(i);

                        if (ch >= LETTER_1 && ch <= LETTER_2) {
                            smallAlphabet = true;
                        } else if (ch >= LETTER_3 && ch <= LETTER_4) {
                            capitalAlphabet = true;
                        } else if (ch >= INTEGER && ch <= INTEGER_2) {
                            integer = true;
                        } else if (ch == AT_RATE || ch == SUB || ch == UNDER_SCORE || ch == HASH_TAG || ch == NOT_EQUAL) {
                            specialCharacter = true;
                        }
                    }
                    if (smallAlphabet && capitalAlphabet && integer && specialCharacter) {
                        System.out.println("Welcome to our App");
                    } else {
                        System.out.println("password or gmail incorrect");

                        System.out.print("You want to forget Password: ");
                        String option = scanner.nextLine();

                        switch (option) {
                            case "yes":
                                System.out.print("Enter a gmail on which you receive a code: ");
                                setgMail(scanner.nextLine());
                                System.out.print("Enter a code which you receive between 1000 to 5000: ");
                                setCode(scanner.nextInt());
                                scanner.nextLine();
                                if (getCode() >= CODE && getCode() <= CODE_2) {
                                    System.out.print("Enter a new password: ");
                                    setPassword(scanner.nextLine());
                                    String pass_2 = getPassword();
                                    if (pass_2.length() >= 8) {
                                        boolean smallAlphabet_2 = false;
                                        boolean capitalAlphabet_2 = false;
                                        boolean specialCharacter_2 = false;
                                        boolean integer_2 = false;

                                        for (int i = 0; i < pass_2.length(); i++) {
                                            char ch = pass_2.charAt(i);

                                            if (ch >= LETTER_1 && ch <= LETTER_2) {
                                                smallAlphabet_2 = true;
                                            } else if (ch >= LETTER_3 && ch <= LETTER_4) {
                                                capitalAlphabet_2 = true;
                                            } else if (ch >= INTEGER && ch <= INTEGER_2) {
                                                integer_2 = true;
                                            } else if (ch == AT_RATE || ch == SUB || ch == UNDER_SCORE || ch == HASH_TAG || ch == NOT_EQUAL) {
                                                specialCharacter_2 = true;
                                            }
                                        }
                                        if (smallAlphabet_2 && capitalAlphabet_2 && integer_2 && specialCharacter_2) {
                                            System.out.println("Welcome to our App");
                                        } else {
                                            System.out.println("password or gmail incorrect");

                                        }
                                    }
                                } else {
                                    System.out.println("Code is incorrect try Again");
                                }
                                break;
                            case "no":
                                System.out.println("Try Again Letter");
                                break;
                        }
                    }
                } else {
                    System.out.println("Give password of length 8 or above");
                }
                break;

            case "signup":
                System.out.print("Enter your firstName: ");
                setName(scanner.nextLine());
                System.out.print("Enter your lastName: ");
                setSecondName(scanner.nextLine());
                System.out.print("Enter your GmailAddress: ");
                setgMail(scanner.nextLine());

                boolean valid = false;
                while (!valid) {
                    System.out.print("Enter your password: ");
                    setPassword(scanner.nextLine());
                    String pass_3 = getPassword();

                    if (pass_3.length() >= 8) {
                        boolean smallAlphabet_3 = false;
                        boolean capitalAlphabet_3 = false;
                        boolean specialCharacter_3 = false;
                        boolean integer_3 = false;

                        for (int i = 0; i < pass_3.length(); i++) {
                            char ch = pass_3.charAt(i);
                            if (ch >= LETTER_1 && ch <= LETTER_2) {
                                smallAlphabet_3 = true;
                            } else if (ch >= LETTER_3 && ch <= LETTER_4) {
                                capitalAlphabet_3 = true;
                            } else if (ch >= INTEGER && ch <= INTEGER_2) {
                                integer_3 = true;
                            } else if (ch == AT_RATE || ch == SUB || ch == UNDER_SCORE || ch == HASH_TAG || ch == NOT_EQUAL) {
                                specialCharacter_3 = true;
                            }
                        }
                        if (smallAlphabet_3 && capitalAlphabet_3 && integer_3 && specialCharacter_3) {
                            valid = true;
                        } else {
                            System.out.println("Write a password in upper,lower and special case");
                        }
                    } else {
                        System.out.println("Enter password of length 8");
                    }
                }

                System.out.print("Enter your phone No: ");
                setPhoneNumber(scanner.nextLine());
                System.out.print("Enter your cnic: ");
                setCNIC(scanner.nextLong());

                System.out.println("welcome to our App! Registered");
                break;
            default:
                System.out.println("invalid Choice");
        }


    }
}


