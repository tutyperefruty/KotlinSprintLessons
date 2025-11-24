package org.example.lesson_11

class Member(
    var name: String = "...empty Nik...",
    var status: String = mutableListOf("SPEAKING", "MIC_OFF", "MUTED").random(),
    var avatar: String = "deafult_IMG.png",
) {
    fun updateStatus(newStatus: String) {
        status = newStatus
    }
}

class Room(
    var title: String = "...no Title...",
    var coverImage: String = "...no Cover...",
    var membersList: MutableList<Member> = mutableListOf(),
) {
    fun updateMemberStatusFindByName(name: String, newStatus: String) {
        val findMember: Member? = membersList.find { it.name == name }
        findMember?.updateStatus(newStatus)
    }

    fun printMemberList() {
        membersList.forEach {
            println("(Avatar: ${it.avatar}) --- on long click---> Shows nik: ${it.name} --and shows--> Status: ${it.status}")
        }
    }
    fun addMember(himOrHer: Member) {
        val exists = membersList.any { it.name == himOrHer.name }
        if (!exists) {
            membersList.add(himOrHer)
        } else {
            println("Member with name \"${himOrHer.name}\" already exists.")
        }
    }
}

fun main() {
    val member_1: Member = Member(name = "Alya", avatar = "avatar1.png")
    val member_2: Member = Member(name = "Balya", avatar = "avatar2.png")
    val member_3: Member = Member("Alya")

    val roomForSpeaking: Room = Room("For Speaking", "room_cover.png")

    roomForSpeaking.addMember(member_1)
    roomForSpeaking.addMember(member_2)
    roomForSpeaking.addMember(member_3)

    roomForSpeaking.updateMemberStatusFindByName("Alya", "SPEAKING")

    println("(Cover: ${roomForSpeaking.coverImage}) - Room: ${roomForSpeaking.title}")
    roomForSpeaking.printMemberList()
}                                                                                                                                            