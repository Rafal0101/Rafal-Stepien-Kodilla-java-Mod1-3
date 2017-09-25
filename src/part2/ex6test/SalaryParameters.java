package part2.ex6test;

/**
 * Created by User on 2017-08-10.
 */
public class SalaryParameters {
    Double baseSalary;
    Double regulatedBonus;
    Double chefBonus;
    Double functionAddSalary;

    public SalaryParameters(Double baseSalary, Double regulatedBonus, Double chefBonus, Double functionAddSalary) {
        this.baseSalary = baseSalary;
        this.regulatedBonus = regulatedBonus;
        this.chefBonus = chefBonus;
        this.functionAddSalary = functionAddSalary;
    }

    @Override
    public String toString() {
        return "SalaryParameters{" +
                "baseSalary=" + baseSalary +
                ", regulatedBonus=" + regulatedBonus +
                ", chefBonus=" + chefBonus +
                ", functionAddSalary=" + functionAddSalary +
                '}';
    }
}
