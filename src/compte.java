public class compte {
    private int dollar;
    private int euro;
    private int code;
    private int numcompte;
    private String lastname;
    private String firstname;


    public compte(int dollar, int euro, int code, int numcompte, String lastname, String firstname) {
        this.dollar = dollar;
        this.euro = euro;
        this.code = code;
        this.numcompte = numcompte;
        this.lastname = lastname;
        this.firstname = firstname;
    }
    public compte( int euro, int code, int numcompte, String lastname, String firstname) {
        this.euro = euro;
        this.code = code;
        this.numcompte = numcompte;
        this.lastname = lastname;
        this.firstname = firstname;
    }


    public int getDollar() {
        return dollar;
    }

    public void setDollar(int dollar) {
        this.dollar = dollar;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public int getEuro() {
        return euro;

    }

    public void setEuro(int euro) {
        this.euro = euro;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public int getNumcompte() {
        return numcompte;
    }

    public void setNumcompte(int numcompte) {
        this.numcompte = numcompte;
    }

}
