package CTS.Seminar5.composite;

public abstract class NodAbstractStructura implements InterfataCaractereNPC{

    public abstract void adaugaNod(NodAbstractStructura nod);

    public abstract void StergeNod(NodAbstractStructura nod);

    public abstract NodAbstractStructura getNod(int index);
}
