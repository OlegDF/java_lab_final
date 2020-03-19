class FirstNonStrictClass {

    def intVar
    def floatVar
    def stringVar

    FirstNonStrictClass() {
        Binding b = new Binding()
        b.setVariable("intVar", 0)
        b.setVariable("floatVar", 0)
        b.setVariable("stringVar", "")
    }

    FirstNonStrictClass(int intVar, float floatVar, String stringVar) {
        Binding b = new Binding()
        b.setVariable("intVar", intVar)
        b.setVariable("floatVar", floatVar)
        b.setVariable("stringVar", stringVar)
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
}
