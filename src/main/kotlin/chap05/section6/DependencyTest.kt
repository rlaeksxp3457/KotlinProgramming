package chap05.section6.dependency

class Patient(val name: String, var id: Int) {

    fun doctorList(d: Doctor) { // 인자로 참조
        println("Patient: $name. Doctor: ${d.name}")
    }
}

class Doctor(val name: String, val p: Patient) {
    val customerId: Int = p.id

    fun patentList(p: Patient) { // 인자로 참조
        println("Doctor: $name. Patient: ${p.name}")
        println("Patient Id: $customerId")
    }
}

fun main() {
    val patient1 = Patient("Kildong", 1234)
    val doc1 = Doctor("KimSaBu", patient1) // 객체가 따로 생성된다

    doc1.patentList(patient1)
    patient1.doctorList(doc1)
}