public class Elevador{
    private int capacidadeMaxima;
    private int numeroUsuarios = 0;
    private int andarAtual = 0;
    private int numeroAndares;

    public Elevador(int capacidadeMaxima, int numeroAndares){
        this.capacidadeMaxima = capacidadeMaxima;
        this.numeroAndares = numeroAndares;
    }

    public int getCapacidadeMaxima() {
        return capacidadeMaxima;
    }

    public void setCapacidadeMaxima(int capacidadeMaxima) {
        this.capacidadeMaxima = capacidadeMaxima;
    }

    public int getNumeroUsuarios() {
        return numeroUsuarios;
    }

    public void setNumeroUsuarios(int numeroUsuarios) {
        this.numeroUsuarios = numeroUsuarios;
    }

    public int getAndarAtual() {
        return andarAtual;
    }

    public void setAndarAtual(int andarAtual) {
        this.andarAtual = andarAtual;
    }

    public int getNumeroAndares() {
        return numeroAndares;
    }

    public void setNumeroAndares(int numeroAndares) {
        this.numeroAndares = numeroAndares;
    }

    public void entrarUsuario(){
        if(!(numeroUsuarios < capacidadeMaxima)){
            System.out.println("Elevador em capacidade máxima!");
            return;
        }
        numeroUsuarios++;
        System.out.println("Usuario entrou no elevador!");
    }

    public void sairUsuario(){
        if(!(numeroUsuarios > 0)){
            System.out.println("O elevador já está vazio!");
            return;
        }
        numeroUsuarios--;
        System.out.println("Usuario saiu do elevador!");
    }

    public void subirAndar(){
        if(!(andarAtual < numeroAndares && numeroUsuarios > 0)){
            System.out.println("O elevador já está no último andar ou está vazio. Não é possível subir de andar no momento!");
            return;
        }
        andarAtual++;
        System.out.println("Subindo...");
    }

    public void descerAndar(){
        if(!(andarAtual > 0  && numeroUsuarios > 0)){
            System.out.println("O elevador já está no térreo ou está vazio. Não é possível descer de andar no momento!");
            return;
        }
        andarAtual--;
        System.out.println("Descendo...");
    }
}