public class Relogio {
    private int s;

    public Relogio(int hora, int minuto, int segundo) {
	setHora(hora);
	setMinuto(minuto);
	setSegundo(segundo);
    }

    // continua no próximo slide
    public void setHora(int hora) {
	int h = (hora >= 0 && hora <= 23 ? hora : 0);

    this.s += (h - getHora()) * 3600;

    }

    public int getHora() {
	return this.s / 3600;
    }

    public void setMinuto(int minuto) {
	int m = (minuto >= 0 && minuto <= 59 ? minuto : 0);

    this.s += (m - getMinuto()) * 60;
    }

    public int getMinuto() {
	return this.s % 3600 / 60;
    }

    // continua no próximo slide
    public void setSegundo(int segundo) {
	int seg = (segundo >= 0 && segundo <= 59 ? segundo : 0);

    this.s += (seg - getSegundo());
    }

    public int getSegundo() {
	return this.s  % 3600 % 60 ;
    }

    public String toString() {
	return String.format("%02d:%02d:%02d",
			     getHora(),
			     getMinuto(),
			     getSegundo());
    }
} // fim da classe Relogio