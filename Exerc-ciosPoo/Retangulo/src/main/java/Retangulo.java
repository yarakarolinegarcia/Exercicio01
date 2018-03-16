public class Retangulo {
    private int altura;
    private int largura;

    public void atribuiAltura(int altura) {
        this.altura = altura;
    }

    public void atribuiLargura(int largura) {
        this.largura = largura;
    }



    public Retangulo() {
        atribuiLargura(4);
        atribuiAltura(3);
    }

    public Retangulo(int altura, int largura) {
        this.altura = altura;
        atribuiLargura(largura);
        if(altura == 1 || largura == 1){
           Retangulo r = new Retangulo();
           r.atribuiAltura(4);
           r.atribuiLargura(3);
        }
    }

    public void desenhaASCII() {

//        if(!ehRetangulo()) {
//            System.out.println("Não é um Retangulo Válido");
//            return;
//        }

        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < largura; j++) {
                if (j == 0 || j == largura - 1) {
                    if(i == 0||i == altura - 1) {
                        System.out.print("+");
                    } else {
                        System.out.print("|");
                    }
                } else {
                        if(i == 0 ||i == altura -1) {
                            System.out.print("-");
                        } else {
                            System.out.print(" ");
                        }
                }
            }
            System.out.println("");
        }
    }

    public void desenhaUTF8(){

//        if(!ehRetangulo()) {
//            System.out.println("Não é um Retangulo Válido");
//            return;
//        }

        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < largura; j++) {
                if (j == 0) {
                    if(i == 0){
                        System.out.print("\u250c"); //sup esq
                    } else {
                        if(i == altura -1) {
                            System.out.print("\u2514");//quina esquerda inferior
                        }else {
                            System.out.print("\u2502"); // vert
                        }
                    }
                } else if(j == largura - 1) {
                    if(i == 0){
                        System.out.print("\u2510"); // sup dir
                    } else {
                        if(i == altura -1) {
                            System.out.print("\u2518");//quina esquerda inferior
                        }else {
                            System.out.print("\u2502"); // vert
                        }
                    }
                }

                else {
                    if(i == 0 ||i == altura -1) {
                            System.out.print("\u2500"); // linha
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println("");
        }

    }

//    private boolean ehRetangulo(){
//        return !(altura ==1 || largura == 1);
//    }





}