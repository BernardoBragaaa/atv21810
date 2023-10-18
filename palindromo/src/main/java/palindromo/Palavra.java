package palindromo;

public class Palavra {
	 private String palavra;
	    private boolean palindromo;

	    public Palavra(String palavra) {
	        this.palavra = palavra;
	        this.palindromo = false;
	    }

	    public String getPalavra() {
	        return palavra;
	    }

	    public void setPalavra(String palavra) {
	        this.palavra = palavra;
	    }

	    public boolean isPalindromo() {
	        return palindromo;
	    }

	    public void setPalindromo(boolean palindromo) {
	        this.palindromo = palindromo;
	    }

	    public void verificarPalindromo() {
	        this.palindromo = true;
	        for (int i = 0; i < this.palavra.length() / 2; i++) {
	            if (this.palavra.charAt(i) != this.palavra.charAt(this.palavra.length() - 1 - i)) {
	                this.palindromo = false;
	                break;
	            }
	        }
	    }
}
