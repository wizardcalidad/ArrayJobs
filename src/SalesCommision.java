/*(Sales Commissions) Use a one-dimensional array to solve the following problem: A com-
pany pays its salespeople on a commission basis. The salespeople receive $200 per week plus 9% of
their gross sales for that week. For example, a salesperson who grosses $5,000 in sales in a week re-
ceives $200 plus 9% of $5,000, or a total of $650. Write an application (using an array of counters)
that determines how many of the salespeople earned salaries in each of the following ranges (assume
that each salesperson’s salary is truncated to an integer amount):
a) $200–299
b) $300–399
c) $400–499
d) $500–599
e) $600–699
f) $700–799
g) $800–899
h) $900–999
i) $1,000 and over
Summarize the results in tabular format.*/

public class SalesCommision {
    private final int weeklyPayment = 200;
    private final double standardCommision = 0.09;
    private int[] grossSales = {2050, 3600, 4000, 500, 2000, 3000};
    private int[] arrayOfCounters = new int[9];


    public int getGrossSales(int index) {
      return grossSales[index];
    }

    public int getSalary(int index) {
        int salary = (int) (grossSales[index] * standardCommision + weeklyPayment);
        return salary;
    }
}

