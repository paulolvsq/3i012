package repertoire.Reste;

import java.util.ArrayList;
import java.util.List;

import repertoire.IHM.Observer;

public abstract interface Subject  {
	List<Observer> listObservers = new ArrayList<Observer>();
	
    public List<Observer> observers();
    public void registerComposantG(final Observer cg);
    public void unregisterComposantG(final Observer cg);
    public void notifyComposantG();
}
