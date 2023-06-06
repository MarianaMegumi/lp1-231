package semana14.Formas;

public class Quadrado {
        private double lado;

        //Construtor
        public Quadrado (double lado){
            this.setLado(lado);
        }
    
        public double calcularArea(){
            return lado*lado;
        }
    
        public double calcularPerimetro(){
            return 4*lado;
        }

        public double getLado(){
            return lado;
        }

        public void setLado(double lado){
            if (lado <= 0.0){
                throw new RuntimeException("Lado inválido");
            }
            this.lado = lado;
        }
    }
