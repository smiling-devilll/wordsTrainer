package ru.atc.wordsTrainer.translation;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;
import org.springframework.http.HttpStatus;

import java.io.IOException;

/**
 * Created by VTestova on 07.12.2015.
 */
public class HttpStatusDeserializer extends JsonDeserializer<HttpStatus> {
    @Override
    public HttpStatus deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        ObjectCodec oc = jsonParser.getCodec();
        JsonNode node = oc.readTree(jsonParser);
        return HttpStatus.valueOf(Integer.parseInt(node.asText()));
    }
}
