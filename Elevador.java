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
        if(capacidadeMaxima > 0){
            this.capacidadeMaxima = capacidadeMaxima;
        }
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
        if(this.numeroUsuarios < this.capacidadeMaxima){
            this.numeroUsuarios++;
            System.out.println("Usuario entrou no elevador!");
        }else{
            System.out.println("Elevador em capacidade máxima!");
        }
    }

    public void sairUsuario(){
        if(this.numeroUsuarios > 0){
            this.numeroUsuarios--;
            System.out.println("Usuario saiu do elevador!");
        }else{
            System.out.println("O elevador já está vazio!");
        }
    }

    public void subirAndar(){
        if(this.andarAtual < this.numeroAndares && this.numeroUsuarios > 0){
            this.andarAtual++;
            System.out.println("Subindo...");
        }else{
            System.out.println("O elevador já está no último andar ou está vazio. Não é possível subir de andar no momento!");
        }
    }

    public void descerAndar(){
        if(this.andarAtual > 0  && this.numeroUsuarios > 0){
            this.andarAtual--;
            System.out.println("Descendo...");
        }else{
            System.out.println("O elevador já está no térreo ou está vazio. Não é possível descer de andar no momento!");
        }
    }
}