package imutability;

public final class ImmutableObject {
    private final int i;

    private final InnerObject innerObject;

    public ImmutableObject(int i, InnerObject innerObject) {
        this.i = i;
        this.innerObject = new InnerObject(innerObject.getSomeField());
    }

    public int getI() {
        return i;
    }

    public InnerObject getInnerObject() {
        return new InnerObject(innerObject.getSomeField());
    }
}

class InnerObject {
    private int someField;

    public InnerObject(int someField) {
        this.someField = someField;
    }

    public int getSomeField() {
        return someField;
    }

    public void setSomeField(int someField) {
        this.someField = someField;
    }
}
