package repertoire.Reste;

import repertoire.IHM.Observer;

public abstract @interface Subject  {
    Observer observer();

    public void registerComposantG(final Observer cg) {
    }

    public void unregisterComposantG(final Observer cg) {
    }

    public void notifyComposantG() {
    }

}
