public class Alphs {
    public static void A(int no) {
        for (int i = no; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                if (i == 3) {
                    System.out.print("*");
                } else if (i != 1) {
                    if (j == 1 || j == 5) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                } else {
                    if (j == 1 || j == 5) {
                        System.out.print(" ");
                    } else {
                        System.out.print("*");
                    }
                }


            }
            break;
        }
    }

    public static void B(int no) {
        for (int i = no; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                if (i == 1 || i == 3 || i == 5) {
                    if (j == 5) {
                        System.out.print(" ");
                    } else {
                        System.out.print("*");
                    }
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

    public static void C(int no) {
        for (int i = no; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                if (i == 1 || i == 5) {
                    if (j == 1 || j == 2) {
                        System.out.print(" ");
                    } else {
                        System.out.print("*");
                    }
                } else if (i == 3) {
                    if (j == 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                } else {
                    if (j == 2) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            break;
        }
    }

    public static void D(int no) {
        for (int i = no; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                if (i == 1 || i == 5) {
                    if (j == 4 || j == 5) {
                        System.out.print(" ");
                    } else {
                        System.out.print("*");
                    }
                } else if (i == 2 || i == 4) {
                    if (j == 1 || j == 4) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
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

    public static void E(int no) {
        for (int i = no; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                if (i == 1 || i == 5) {
                    System.out.print("*");
                } else if (i == 3) {
                    if (j == 4 || j == 5) {
                        System.out.print(" ");
                    } else {
                        System.out.print("*");
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

    public static void F(int no) {
        for (int i = no; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                if (i == 1) {
                    System.out.print("*");
                } else if (i == 3) {
                    if (j == 4 || j == 5) {
                        System.out.print(" ");
                    } else {
                        System.out.print("*");
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

    public static void G(int no) {
        for (int i = no; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                switch (i) {
                    case 1:
                    case 5:
                        if (j == 1 || j == 5) {
                            System.out.print(" ");
                        } else {
                            System.out.print("*");
                        }
                        break;
                    case 2:
                        if (j == 1) {
                            System.out.print("*");
                        } else {
                            System.out.print(" ");
                        }
                        break;
                    case 3:
                        if (j == 2 || j == 3) {
                            System.out.print(" ");
                        } else {
                            System.out.print("*");
                        }
                        break;
                    case 4:
                        if (j == 1 || j == 5) {
                            System.out.print("*");
                        } else {
                            System.out.print(" ");
                        }
                        break;

                }

            }
            break;
        }

    }

    public static void H(int no) {
        for (int i = no; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                switch (i) {
                    case 3:
                        System.out.print("*");
                        break;
                    default:
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

    public static void I(int no) {
        for (int i = no; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                switch (j) {
                    case 1:
                    case 5:
                        System.out.print(" ");
                        break;
                    case 3:
                        System.out.print("*");
                        break;
                    case 2:
                    case 4:
                        if (i == 1 || i == 5) {
                            System.out.print("*");
                        } else {
                            System.out.print(" ");
                        }


                }

            }
            break;
        }

    }

    public static void J(int no) {
        for (int i = no; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                switch (i) {
                    case 2:
                    case 3:
                        if (j == 5) {
                            System.out.print("*");
                        } else {
                            System.out.print(" ");
                        }
                        break;
                    case 5:
                        if (j == 1 || j == 5) {
                            System.out.print(" ");
                        } else {
                            System.out.print("*");
                        }
                        break;
                    case 1:
                        if (j > 3) {
                            System.out.print("*");
                        } else {
                            System.out.print(" ");
                        }
                        break;
                    case 4:
                        if (j == 1 || j == 5) {
                            System.out.print("*");
                        } else {
                            System.out.print(" ");
                        }
                        break;

                }

            }
            break;
        }

    }

    public static void K(int no) {
        for (int i = no; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                if (j == 1) {
                    System.out.print(" ");
                }
                switch (i) {
                    case 1:
                    case 5:
                        if (j == 2 || j == 5) {
                            System.out.print("*");
                        } else {
                            System.out.print(" ");
                        }
                        break;
                    case 2:
                    case 4:
                        if (j == 2 || j == 4) {
                            System.out.print("*");
                        } else {
                            System.out.print(" ");
                        }
                        break;
                    case 3:
                        if (j == 2 || j == 3) {
                            System.out.print("*");
                        } else {
                            System.out.print(" ");
                        }
                        break;

                }

            }
            break;
        }

    }

    public static void L(int no) {
        for (int i = no; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                switch (i) {
                    case 5:
                        System.out.print("*");
                        break;
                    default :
                        if(j==1){
                            System.out.print("*");
                        }else {
                            System.out.print(" ");
                        }

                }

            }
            break;
        }

    }

    public static void M(int no) {
        for (int i = no; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                switch (i) {
                    case 1: case 4: case 5:
                        if(j==1 ||j==5){
                            System.out.print("*");

                        }else {
                            System.out.print(" ");
                        }
                        break;
                    case 2:
                        if(j==3){
                            System.out.print(" ");
                        } else {
                            System.out.print("*");
                        }
                        break;
                    case 3:
                        if(j==2 || j==4){
                            System.out.print(" ");
                        } else {
                            System.out.print("*");

                        }
                        break;

                }

            }
            break;
        }

    }

    public static void N(int no) {
        for (int i = no; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                switch (j) {
                    case 1:
                    case 5:
                        System.out.print("*");
                        break;
                    case 2:
                        if (i == 2) {
                            System.out.print("*");
                        } else {
                            System.out.print(" ");
                        }
                        break;
                    case 3:
                        System.out.print(i != 3 ? " " : "*");
                        break;
                    case 4:
                        System.out.print(i != 4 ? " " : "*");
                        break;

                }

            }
            break;
        }


    }

    public static void O(int no) {
        for (int i = no; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                switch (i) {
                    case 1: case 5:
                        System.out.print(j==1||j==5?" ":"*");
                        break;
                    default:
                        System.out.print(j==1||j==5?"*":" ");
                        break;

                }

            }
            break;
        }

    }

    public static void P(int no) {
        for (int i = no; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                switch (i) {
                    case 3:
                        System.out.print(j==5?" ":"*");
                        break;
                    case 2:
                        System.out.print(j==1||j==5?"*":" ");
                        break;
                    case 1:
                        System.out.print(j==1||j==5?" ":"*");
                        break;
                    default:
                        System.out.print(j==1?"*":" ");
                        break;

                }

            }
            break;
        }

    }

    public static void Q(int no) {
        for (int i = no; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                switch (i) {
                    case 1: case 5:
                        System.out.print(j==1||j==5?" ":"*");
                        break;
                    case 3:
                        System.out.print(j==2||j==4?" ":"*");
                        break;
                    case 4:
                        System.out.print(j==2||j==3?" ":"*");
                        break;
                    default:
                        System.out.print(j==1||j==5?"*":" ");
                        break;

                }

            }
            break;
        }

    }

    public static void R(int no) {
        for (int i = no; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                switch (i) {
                    case 3:
                        System.out.print(j==5?" ":"*");
                        break;
                    case 2:
                        System.out.print(j==1||j==5?"*":" ");
                        break;
                    case 1:
                        System.out.print(j==1||j==5?" ":"*");
                        break;
                    case 4:
                        System.out.print(j==1||j==3?"*":" ");
                        break;
                    case 5:
                        System.out.print(j==2||j==3?" ":"*");
                        break;


                }

            }
            break;
        }

    }

    public static void S(int no) {
        for (int i = no; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                switch (i) {
                    case 1: case 3: case 5:
                        System.out.print(j==1||j==5?" ":"*");
                        break;
                    case 2:
                        System.out.print(j==1?"*":" ");
                        break;
                    default:
                        System.out.print(j==5?"*":" ");
                        break;

                }

            }
            break;
        }

    }

    public static void T(int no) {
        for (int i = no; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                switch (i) {
                    case 1:
                        System.out.print("*");
                        break;
                    default:
                        System.out.print(j==3?"*":" ");
                        break;

                }

            }
            break;
        }

    }

    public static void U(int no) {
        for (int i = no; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                switch (i) {
                    case 5:
                        System.out.print(j==1||j==5?" ":"*");
                        break;
                    default:
                        System.out.print(j==1||j==5?"*":" ");
                        break;

                }

            }
            break;
        }

    }

    public static void V(int no) {
        for (int i = no; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                switch (i) {
                    case 1: case 2:
                        System.out.print(j==1||j==5?"*":" ");
                        break;
                    case 3:
                        System.out.print(j==2||j==4?"*":" ");
                        break;
                    default:
                        System.out.print(j==3?"*":" ");
                        break;

                }

            }
            break;
        }

    }

    public static void W(int no) {
        for (int i = no; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                switch (i) {
                    case 1: case 2: case 3:
                        System.out.print(j==1||j==5?"*":" ");
                        break;
                    case 4:
                        System.out.print(j==2||j==4?" ":"*");
                        break;
                    default:
                        System.out.print(j==2||j==4?"*":" ");
                        break;

                }

            }
            break;
        }

    }

    public static void X(int no) {
        for (int i = no; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                switch (i) {
                    case 1: case 5:
                        System.out.print(j==1||j==5?"*":" ");
                        break;
                    case 2: case 4:
                        System.out.print(j==2||j==4?"*":" ");
                        break;
                    default:
                        System.out.print(j==3?"*":" ");
                        break;


                }

            }
            break;
        }

    }

    public static void Y(int no) {
        for (int i = no; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                switch (j) {
                    case 3:
                        System.out.print(i==1||i==2?" ":"*");
                        break;
                    case 1: case 5:
                        System.out.print(i==1?"*":" ");
                        break;
                    default:
                        System.out.print(i==2?"*":" ");
                        break;

                }

            }
            break;
        }

    }

    public static void Z(int no) {
        for (int i = no; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                switch (i) {
                    case 1: case 5:
                        System.out.print("*");
                        break;
                    case 2:
                        System.out.print(j==4?"*":" ");
                        break;
                    case 3:
                        System.out.print(j==3?"*":" ");
                        break;
                    default:
                        System.out.print(j==2?"*":" ");
                        break;


                }

            }
            break;
        }

    }
}
