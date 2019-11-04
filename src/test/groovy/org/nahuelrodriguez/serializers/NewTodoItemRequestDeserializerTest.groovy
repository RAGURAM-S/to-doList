package org.nahuelrodriguez.serializers

import com.fasterxml.jackson.databind.ObjectMapper
import org.nahuelrodriguez.requests.dtos.NewTodoItemRequest
import spock.lang.Specification

class NewTodoItemRequestDeserializerTest extends Specification {
    private TodoItemRequestDeserializer todoItemRequestDeserializer

    void setup() {
        todoItemRequestDeserializer = new TodoItemRequestDeserializer()
    }

    def "When invocked Deserialize method -> returning value OK"() {
        given:
        def dto = new NewTodoItemRequest()
        dto.setId("a056fb54-317e-4982-bd83-ccb0b8b97d74")
        dto.setDescription("Valid DTO")
        and:
        def serializedDto = new ObjectMapper().writeValueAsString(dto).getBytes()

        when:
        def dtoDeserialized = todoItemRequestDeserializer.deserialize("TopicName", serializedDto)

        then:
        noExceptionThrown()
        dtoDeserialized == dto
    }
}