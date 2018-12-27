package Marathon.Conditions;

import Marathon.Interface.Competitor;

public class Team {
    private String name;
    private Competitor[] competitors;
    private StringBuilder results;

    public Team(String name, Competitor... competitors) {
        this.name = name;
        this.competitors = competitors;
        this.results = new StringBuilder();
    }

    public void setResult(String result) {
        results.append(result).append("\n");
    }


    public Competitor[] getCompetitors() {
        return competitors;
    }

    public void showResults() {
        System.out.println("*Результаты*");
        System.out.println("Команда " + name + ":");
        System.out.print(results);
    }
}