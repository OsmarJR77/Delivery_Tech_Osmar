class ModificadorPublic {

    private String habilidades;   // Só a classe ModificadorPublic pode mudar.

    public String getHab() {  // getHab - esta é a porta de acesso controlado
       return habilidades;
    } 

    public void setHab(String habilidades) { // setHab - 

    this.habilidades = habilidades; 
    }    
   
} // fim do public class ModificadoresPublic

 public class Naruto extends ModificadorPublic {

        public void mostrarPoder() {

            System.out.println(" Habilidade:  "  + getHab());
            }
        
        public static void main(String[] args) {
            Naruto ninja = new Naruto();
            ninja.setHab("Modo sabio dos seis caminhos.");
            ninja.mostrarPoder();                
            }
    
    } // fim do class Naruto