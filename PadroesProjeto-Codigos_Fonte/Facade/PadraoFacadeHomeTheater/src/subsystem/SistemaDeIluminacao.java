package subsystem;

public class SistemaDeIluminacao {
    public void diminuirBrilho(int p) { 
        System.out.println("[Luz] Brilho: " + p + "%"); 
    }
    
    public void restaurarBrilho() { 
        System.out.println("[Luz] Brilho restaurado."); 
    }
}