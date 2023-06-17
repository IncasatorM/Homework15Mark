public class Burger {
    String bun;


    String cheese;

    String greens;


    String mayonnaise;

    String meet;
    boolean doubleMeet;



    public Burger(String bun, String cheese, String greens, String mayonnaise, String meet, boolean doubleMeet) {
        this.bun = bun;
        this.cheese = cheese;
        this.greens = greens;
        this.mayonnaise = mayonnaise;
        this.meet = meet;
        this.doubleMeet = doubleMeet;
    }

    public Burger(String bun, String cheese, String greens, String mayonnaise, String meet) {
        this.bun = bun;
        this.cheese = cheese;
        this.greens = greens;
        this.mayonnaise = mayonnaise;
        this.meet = meet;
    }

    public Burger(String bun, String cheese, String greens, String meet) {
        this.bun = bun;
        this.cheese = cheese;
        this.greens = greens;
        this.meet = meet;
    }

    @Override
    public String toString() {
        return "Burger{" +
                "bun='" + bun + '\'' +
                ", cheese='" + cheese + '\'' +
                ", greens='" + greens + '\'' +
                ", mayonnaise='" + mayonnaise + '\'' +
                ", meet='" + meet + '\'' +
                ", doubleMeet=" + doubleMeet +
                '}';
    }
}
