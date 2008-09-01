package data.sim;

import data.var.AVariable;

public interface IAComponentCon {
    public AVariable getScopedVariable(String scope, String identifier);

    public boolean hasScopedVariable(String scope, String identifier);

    public void interrupt();

    public void sleep(int steps);
}