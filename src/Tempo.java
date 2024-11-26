import exception.AritmeticaException;

public class Tempo implements Aritmetica<Tempo>  {

    private boolean scalare;

    public Tempo(int ore, int minuti)  {
        // ??
        // ??
        normalizzaCm();  // gestisci qui i cm che sono maggiori di 99 
    }

    // serve per creare un oggetto Tempo "scalare" da utilizzare per moltiplicazione e divisione
    public Tempo(int ore)  {
        //this.ore = ore;
        this.scalare = true;
    }

    // se i minuti sforano 60 allora devo riconvertirli in ore e il resto rimane in minuti
    private void normalizzaCm()  {

    }

    public boolean isScalare() {
        return scalare;
    }

    // posso solo moltiplicare un Tempo per un Tempo scalare (isScalare == true), 
    // solleva l'eccezione se necessario
    @Override
    public Tempo multiply(Tempo t) throws AritmeticaException {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'multiply'");
    }

    // posso solo dividere un Tempo per un Tempo scalare (isScalare == true), solleva l'eccezione
    // se necessario
    @Override
    public Tempo subtract(Tempo t) throws AritmeticaException {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'subtract'");
    }

    @Override
    public boolean equals(Object obj) {
        // TODO Auto-generated method stub
        return super.equals(obj);
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString();
    }
}
