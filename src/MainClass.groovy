import groovy.time.TimeCategory

FirstClass fc = new FirstClass(intVar: 1, floatVar: 1.51, stringVar: "aaa")
println fc.getIntVar()
println fc.floatVar
println fc.stringVar

println()

fc = new FirstClass()
println fc.getIntVar()
println fc.floatVar
println fc.stringVar

println()

println fc.stringVar instanceof Integer

println()

fnsc = new FirstNonStrictClass(intVar: 1, floatVar: 1.51, stringVar: "aaa")
println fnsc.getIntVar()
println fnsc.floatVar
println fnsc.stringVar

println()

println fc.pulchritude

println()

println fc.returnsInteger(null)
//print fc.returnsInt(null)

BigDecimal dec1 = new BigDecimal(101)
BigDecimal dec2 = new BigDecimal(101)
println dec1 == dec2
println dec1.is(dec2)
println dec1.compareTo(dec2)
println dec1 + dec2
println dec1.add(dec2)

println()

def unknown = 10
println unknown.getClass().getName()
unknown = 'f'
println unknown.getClass().getName()
unknown = "First"
println unknown.getClass().getName()

println()

def unknown2 = 'f'
println unknown2.getClass().getName()
unknown2 = "First"
println unknown2.getClass().getName()
unknown2 = 10
println unknown2.getClass().getName()

println()

def unknown3 = "First"
println unknown3.getClass().getName()
unknown3 = 10
println unknown3.getClass().getName()
unknown3 = 'f'
println unknown3.getClass().getName()

println()

Date date1 = new Date(2015, 1, 28)
Date date2 = new Date(2015, 0, 31)
println date1 - date2
use(TimeCategory) {
    date1 -= 1.month
    date1 += (1.month + 1.day)
    println date1
}

println()

def division = {a, b -> a / b}
println division(9, 4)
def subtraction = {a, b -> a - b}
println subtraction(9, 4)
def complex = {a, b, c -> subtraction(division(a, b), c)}
println complex(9, 4, 1)