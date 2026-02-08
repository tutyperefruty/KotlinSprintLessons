package org.example.lesson_11

const val FIRST_ID = 1

class Member(
    val userId: Int,
    val userName: String,
) {
    class Builder {
        var userId: Int = 0
        var userName: String = ""

        fun setUserId(idForNewMember: Int) = apply { this.userId = idForNewMember }
        fun setUserName(nameForNewMember: String) = apply { this.userName = nameForNewMember }


        fun build(): Member {
            return Member(userId, userName)
        }
    }
}

class Message(
    val authorId: Int,
    val message: String,
) {
    class Builder {
        private var authorId: Int = 0
        private var message: String = ""

        fun setAuthorId(idForNewAuthor: Int) = apply { this.authorId = idForNewAuthor }
        fun setMessage(newMessage: String) = apply { this.message = newMessage }

        fun build(): Message {
            return Message(authorId, message)
        }
    }
}

class Forum {

    val membersList = mutableListOf<Member>()
    val messagesList = mutableListOf<Message>()
    var nextUserId = FIRST_ID

    fun createNewUser(userName: String): Member {
        val member = Member.Builder()
            .setUserId(nextUserId++)
            .setUserName(userName)
            .build()

        membersList.add(member)
        return member
    }

    fun createNewMessage(authorId: Int, message: String): Message? {
        val memberExists = membersList.any { it.userId == authorId }
        if (!memberExists) return null

        val message = Message.Builder()
            .setAuthorId(authorId)
            .setMessage(message)
            .build()

        messagesList.add(message)
        return message
    }

    fun printThread() {
        val userIdToUserNameMapAssociationForUsingAuthorId = membersList.associateBy({ it.userId }, { it.userName })
        for (i in messagesList) {
            Thread.sleep(1200)
            println("${userIdToUserNameMapAssociationForUsingAuthorId[i.authorId]}: ${i.message}")
        }
    }
}

fun main() {
    val forum = Forum()

    val member1 = forum.createNewUser("Alya")
    val member2 = forum.createNewUser("Balya")

    forum.createNewMessage(member1.userId, "Hi, everybody!")
    forum.createNewMessage(member2.userId, "Hello!")
    forum.createNewMessage(member1.userId, "How are U, ${member2.userName}!")
    forum.createNewMessage(member2.userId, "All's right, ${member1.userName}.")

    forum.printThread()
}