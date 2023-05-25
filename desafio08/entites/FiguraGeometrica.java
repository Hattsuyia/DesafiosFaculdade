package Desafios.src.desafio.desafio08.entites;

public class FiguraGeometrica {

    public void triangulo (double a, double b, double c){
        if((a+b>c) || (a+c>b) || (c+b>a)){
            if(a==b && b ==c){
                System.out.println("Triangulo Equilatero");
            } else if (a==b || b==c || a==c) {
                System.out.println("Triangulo Isosceles");
            } else if(((a * a == b * b + c * c) || (b * b == a * a + c * c) || (c * c == a * a + b * b))) {
                System.out.println("Triangulo Retangulo");
            } else{
                System.out.println("Triangulo Escaleno");
            }
        }else {
            System.out.println("Não é um Triângulo");
        }
    }

    public void quadrado (double a, double b, double c, double d){
        if (a == b && a == c && a== d){
            System.out.println("Quadrado Equilatero");
        } else if( a==b && c==d || a==c && b==d || a==d && b==c){
            System.out.println("É um retângulo");
        } else{
            System.out.println("Não é um quadrado, nem um retângulo");
        }
    }
}
