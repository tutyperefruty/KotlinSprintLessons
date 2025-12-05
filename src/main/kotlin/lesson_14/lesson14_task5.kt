package org.example.lesson_14

class Chat {
    val messageList: MutableList<Message> = mutableListOf()
    var nextId = 1

    fun addMessage(author: String, messageText: String) {
        val message = Message(nextId++, author, messageText)
        messageList.add(message)
    }

    fun addThreadMessage(author: String, messageText: String, parentMessageId: Int) {
        val message = ChildMessage(nextId++, author, messageText, parentMessageId)
        messageList.add(message)
    }

    fun printChat() {

        val groupedMsgs: Map<Int, List<Message>> = messageList.groupBy {
            if (it is ChildMessage) it.parentMessageId else it.id
        }

        groupedMsgs.forEach { (parentIdAndId: Int, allMessages: List<Message>) ->
            allMessages.forEach { message ->
                if (message is Message && message !is ChildMessage) {
                    println("${"\u001B[3m"}   msg ID: ${message.id} -> ${"\u001B[0m"}" +
                            "${message.author}: ${message.text}")
                    val childMessages = groupedMsgs[parentIdAndId]?.filterIsInstance<ChildMessage>()
                    childMessages?.forEach {
                        println("${"\u001B[3m"}parent ID: ${message.id} -> ${"\u001B[0m"}" +
                                "\t${it.author}: ${it.text}")
                    }
                }
            }
        }
    }
}

open class Message(val id: Int, val author: String, val text: String)

class ChildMessage(id: Int, author: String, text: String, val parentMessageId: Int) : Message(id, author, text)

fun main() {
    val chat = Chat().run {
        addMessage("Alya", "Hi, Everybody!")
        addMessage("Balya", "Nice weather")
        addThreadMessage("Calya", "How about fishing?", 2)
        addThreadMessage("Dalya", "Yeaaaah!", 1)
        addThreadMessage("Galya", "Hi!", 1)
        printChat()
    }
}