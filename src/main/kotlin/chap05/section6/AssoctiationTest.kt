package chap05.section6

class Patient(val name: String) {

    fun doctorList(d: Doctor) { // 인자로 참조
        println("Patient: $name. Doctor: ${d.name}")
    }
}

class Doctor(val name: String) {

    fun patentList(p: Patient) { // 인자로 참조
        println("Doctor: $name. Patient: ${p.name}")
    }
}

fun main() {
    val doc1 = Doctor("KimSaBu") // 객체가 따로 생성된다
    val patient1 = Patient("Kildong")
    doc1.patentList(patient1)
    patient1.doctorList(doc1)
}