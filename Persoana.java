public class Persoana {
    private String nume ;
    private int age;
    private String prenume;
    private long nridentif;
    private enum gen{F, M}
    private gen Gen;

    //Constructor care initializeaza toate campurile
    public Persoana(String nume, String prenume, int age, long nridentif)//gen Gen)
    {
        this.nume = nume;
        this.prenume = prenume;
        this.age = age;
        this.nridentif = nridentif;
        this.Gen = Gen;
    }
    //Constructor fara parametri care apeleaza constructorul anterior
   public Persoana (){
       // System.out.println("apel constructor");
    }
    //Getter, Setter
    public String getNume()
    { return nume; }
    public void setNume(String n)
    { this.nume = n; }

    public String getPrenume()
    {return prenume;}
    public void setPrenume( String p)
    { this.prenume = p;}

    public int getAge()
    {return age;}
    public void setAge(int a)
    { this.age = a;}

    public long getNridentif()
    {return nridentif;}
    public void setNridentif(long nr)
    { this.nridentif = nr; }

//    public gen getGen()
//    {return Gen;}
//    public void setGen(gen g)
//    { this.Gen = g; }

    //Override toString, equals
    public String toString()
    {return  nume + " " + prenume + ", " + age + ", " + nridentif + ", " + Gen;}

    public boolean equals(Persoana p)
    {
        Persoana that = (Persoana) p;
        if (this.age != that.age) return false;
        if (this.nume != (that.nume)) return false;
        if (this.prenume != (that.prenume)) return false;
        if (this.Gen != (that.Gen)) return false;
        if (this.nridentif != that.nridentif) return false;
        return true;}

        public int hashCode(){
        char[] name = (nume + prenume).toCharArray();
        int sum = 0;
        for (char x : name) {
            sum = sum + x;
        }
        return sum;

    }

    public static void main(String[] args)
    {
        Persoana p1;
        Persoana p2;

        p1.nume="Popescu";
        p1.prenume="Ion";
        p1.age=19;
        p1.nridentif=1;

        p2.nume="Popescu";
        p2.prenume="Ion";
        p2.age=19;
        p2.nridentif=1;

        if (p1.equals(p2))
        { System.out.println("egale");}
        else System.out.println("inegale");


    }
    }

