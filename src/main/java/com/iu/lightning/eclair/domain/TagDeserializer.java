package com.iu.lightning.eclair.domain;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;

import java.io.IOException;
import java.util.ArrayList;

public class TagDeserializer extends StdDeserializer<Tag[]>
{

    public TagDeserializer()
    {
        this(null);
    }

    public TagDeserializer(Class<?> vc)
    {
        super(vc);
    }

    @Override
    public Tag[] deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JsonProcessingException
    {
        ArrayList<Tag> tags = new ArrayList<>();
        JsonNode node = jsonParser.getCodec().readTree(jsonParser);

        for (JsonNode tagNode : node)
        {
            String tagName = tagNode.fields().next().getKey();
            String tagValue = tagNode.fields().next().getValue().asText();
            tags.add(new Tag(tagName, tagValue));
        }

        return tags.toArray(new Tag[tags.size()]);
    }
}
