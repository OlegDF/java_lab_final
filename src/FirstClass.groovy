class FirstClass {

    int intVar
    float floatVar
    String stringVar

    FirstClass() {
        Binding b = new Binding()
        b.setVariable("intVar", 0)
        b.setVariable("floatVar", 0)
        b.setVariable("stringVar", "")
    }

    FirstClass(int intVar, float floatVar, String stringVar) {
        Binding b = new Binding()
        b.setVariable("intVar", intVar)
        b.setVariable("floatVar", floatVar)
        b.setVariable("stringVar", stringVar)
    }

    Integer getPulchritude() {
        123
    }

    int getIntVar() {
        return intVar
    }

    void setIntVar(int intVar) {
        this.intVar = intVar
    }

    float getFloatVar() {
        return floatVar
    }

    void setFloatVar(float floatVar) {
        this.floatVar = floatVar
    }

    String getStringVar() {
        return stringVar
    }

    void setStringVar(String stringVar) {
        this.stringVar = stringVar
    }

    Integer returnsInteger(Integer i) {
        i
    }

    int returnsInt(Integer i) {
        i
    }

}
