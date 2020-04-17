public class Nums {
    public static void zero(int no) {
        for (int i = no; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                if (i == 1 || i == 5) {
                    System.out.print("*");
                } else {
                    if (j == 1 || j == 5) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            break;
        }
    }

    public static void one(int no) {
        for (int i = no; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                if (j == 5) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }
            break;
        }

    }

    public static void two(int no) {
        for (int i = no; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                if (i == 1 || i == 3 || i == 5) {
                    System.out.print("*");
                } else if (i == 2) {
                    if (j == 5) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }

                } else {
                    if (j == 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            break;
        }
    }

    public static void three(int no) {
        for (int i = no; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                if (i == 1 || i == 3 || i == 5) {
                    System.out.print("*");
                } else {
                    if (j == 5) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }

            }
            break;
        }
    }

    public static void four(int no) {
        for (int i = no; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                if (i <3) {
                    if (j == 1 || j == 5) {
                        System.out.print("*");

                    } else {
                        System.out.print(" ");

                    }
                } else if(i>3){
                    if(j==5){
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                } else {
                    System.out.print("*");
                }

            }
            break;
        }
    }

    public static void five(int no) {
        for (int i = no; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                if(i==1 || i==3 || i==5){
                    System.out.print("*");
                } else if(i==2){
                    if(j==1){
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                } else {
                    if(j==5){
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }

            }
            break;
        }
    }

    public static void six(int no) {
        for (int i = no; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                if(i==1 || i==3 || i==5){
                    System.out.print("*");
                } else if(i==2){
                    if(j==1){
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                } else {
                    if(j==1 ||j==5){
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }

            }
            break;
        }
    }

    public static void seven(int no) {
        for (int i = no; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                if(i==1){
                    System.out.print("*");
                } else {
                    if(j==5){
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }

            }
            break;
        }
    }

    public static void eight(int no) {
        for (int i = no; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                if(i==1 || i==3 || i==5){
                    System.out.print("*");
                } else {
                    if(j==1 || j==5){
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }

            }
            break;
        }
    }

    public static void nine(int no) {
        for (int i = no; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                if(i==1 || i==3){
                    System.out.print("*");
                } else if(i==4 ||i==5){
                    if(j==5){
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }

                } else {
                    if(j==1 || j==5){
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }

            }
            break;
        }
    }
}
