package LAB_PRUEBA;

import LAB_PRUEBA.JuegoAhorcado;

public abstract class JuegoAhorcadoBase implements JuegoAhorcado {
    protected String palabraSecreta;
    protected String palabraActual;
    protected int intentos;

    public abstract String actualizarPalabraActual(char letra);
    public abstract boolean verificarLetra(char letra);
    public abstract boolean hasGanado();
}