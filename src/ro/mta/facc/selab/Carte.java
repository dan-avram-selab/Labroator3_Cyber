package ro.mta.facc.selab;


/**
 * Modeleaza un obiect de tip carte. Este utilizat in cadrul clasei {@link Biblioteca}
 * <b>Important:</b> A se utiliza doar in clasa Biblioteca.<br>
 *
 * <pre>    Carte carte2 = new Carte("Fratii Karamazov", "Feodor Dostoievski", 1880, 1200);</pre>
 *
 * @see Biblioteca
 * @author dan.avram
 */
public class Carte implements Comparable<Carte> {
    /**
     * Titlu cartii
     */
    private String titlu;
    private String autor;
    private int anPublicatie;
    private int nrPagini;

    /**
     * Se compara cu un alt obiect de tip carte
     *
     * @param o Cartea cu care ne compara
     * @return -1, daca <b>this &#60; o,</b>, 0, daca this == 0 ...
     */
    @Override
    public int compareTo(Carte o) {
        return Integer.compare(this.nrPagini, o.nrPagini);
    }

    public Carte(String titlu, String autor, int anPublicatie, int nrPagini) {
        this.titlu = titlu;
        this.autor = autor;
        this.anPublicatie = anPublicatie;
        this.nrPagini = nrPagini;
    }

    public String getTitlu() {
        return titlu;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnPublicatie() {
        return anPublicatie;
    }

    public int getNrPagini() {
        return nrPagini;
    }

    public void setTitlu(String titlu) {
        this.titlu = titlu;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setAnPublicatie(int anPublicatie) {
        this.anPublicatie = anPublicatie;
    }

    public void setNrPagini(int nrPagini) {
        this.nrPagini = nrPagini;
    }

    @Override
    public String toString() {
        return this.titlu + " " + this.autor + ", aparuta in anul " + this.anPublicatie;
    }
}
