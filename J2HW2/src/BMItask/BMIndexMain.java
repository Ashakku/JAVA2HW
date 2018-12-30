package BMItask;


public class BMIndexMain {

    public static void main(String[] args) {

        double[][] list = new double[][]{
                {118, 2.05},
                {106, 1.77},
                {87, 1.83},
                {45, 1.12},
                {70, 1.87},
                {54, 1.57},
                {105, 1.76},
                { 50, 1.96},
                { 114, 1.76},
                { 72, 2.45},
                {53, 2.10},
                {66, 2.25},
                {54, 1.50},
                {95, 1.62},
                {86, 1.72},
                {62, 1.57},
                {65, 2.24},
                {72, 1.43},
                {93, 2.01},
                {109, 3.01},
                {106, 2.97},
                {77, 1.69},
                {114, 2.09},
                { 98, 1.72},
                {85, 2.46},
                { 113, 1.94},
                {53, 1.77},
                { 106, 2.30},};

        double bmi;
        String condition;

        for (int i = 0; i < list.length; i++) {


                bmi = list[i][0] / ((list[i][1])*(list[i][1]));
                bmi = Math.round(bmi * 100.0) / 100.0;
            if (bmi <= 18.5) {
                String underweight = "under";
                condition = underweight;
            }
            else if (bmi <=24.9) {
                String normal = "normal";
                condition = normal;
            }
            else if (bmi <=29.9) {
                String overweight = "over";
                condition = overweight;
            }
            else {
                String obese = "obese";
                condition = obese;
            }

                System.out.println("Индекс массы тела: " +  bmi + " " +"Состояние " + condition);
            }

        }
    }







