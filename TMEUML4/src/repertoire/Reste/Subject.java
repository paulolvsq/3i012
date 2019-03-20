package repertoire.Reste;

import repertoire.IHM.Observer;

public abstract @interface Subject  {
    Observer observer();

    public void registerComposantG(Observer cg) {
    }

    public void unregisterComposantG(Observer cg) {
    }

    public void notifyComposantG() {
    }

}
