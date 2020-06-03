package record

open class Details(
        open var name: String? = "student",
        open var Class: Int = 0,
        open var rollno: Int = 0,
        open var section: String? = "A"
) {
    init {
        println("\nENTER THE NAME OF STUDENT")
        name = readLine()
        println("\nENTER THE CLASS OF STUDENT IN NUMERICALS")
        Class = Integer.valueOf(readLine())
        println("\nENTER THE SECTION OF STUDENT")
        section = readLine()
        println("\nENTER THE ROLL NUMBER OF STUDENT")
        rollno = Integer.valueOf(readLine())
    }

    open fun printdetails() {
        println("\nNAME OF THE STUDENT IS: $name")
        println("\nCLASS & SECTION OF THE STUDENT IS :$Class-$section")
        println("\nROLL NUMBER OF THE STUDENT IS :$rollno")
    }
}

data class subja(var mo: Int, var mm: Int)
class Marks(var P: subja, var C: subja, var M: subja) : Details() {
    val per: (subja) -> Double = { sub -> (((sub.mo * 1.0) / sub.mm) * 100.0) }
    fun total(a: subja, b: subja, c: subja): subja {
        var mot = a.mo + b.mo + c.mo
        var mmt = a.mm + b.mm + c.mm
        var r = subja(mot, mmt)
        return r
    }

    fun printinformation() {
        printdetails()
        println("\nPERCENTAGE MARKS IN PHYSICS :${per(P)}")
        println("\nPERCENTAGE MARKS IN CHEMISTRY :${per(C)}")
        println("\nPERCENTAGE MARKS IN MATHS :${per(M)}")
        var t: subja = total(P, C, M)
        println("\nTOTAL MARKS OBTAINED :${t.mo}")
        println("\nPERCENTAGE MARKS OBTAINED :${per(t)}")

    }
}

fun main() {
    println("\nHELLO! WELCOME TO STUDENT RECORD DIARY.")
    println("\nENTER THE MARKS OF STUDENT IN SUBJECTS TO FOLLOW")
    println("\nENTER MARKS OBTAINED IN PHYSICS")
    var mop = Integer.valueOf(readLine())
    println("\nENTER MAXIMUM MARKS IN PHYSICS")
    var mmp = Integer.valueOf(readLine())
    println("\nENTER MARKS OBTAINED IN CHEMISTRY")
    var moc = Integer.valueOf(readLine())
    println("\nENTER MAXIMUM MARKS IN CHEMISTRY")
    var mmc = Integer.valueOf(readLine())
    println("\nENTER MARKS OBTAINED IN MATHS")
    var mom = Integer.valueOf(readLine())
    println("\nENTER MAXIMUM MARKS IN MATHS")
    var mmm = Integer.valueOf(readLine())
    println("\nNOW ENTER BIODATA OF STUDENT UNDER FOLLOWING HEADINGS.")
    var P = subja(mop, mmp)
    var C = subja(moc, mmc)
    var M = subja(mom, mmm)
    val obj = Marks(P, C, M)
    obj.printinformation()


}




