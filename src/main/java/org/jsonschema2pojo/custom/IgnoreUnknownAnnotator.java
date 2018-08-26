package org.jsonschema2pojo.custom;

import org.jsonschema2pojo.AbstractAnnotator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.JsonNode;
import com.sun.codemodel.JDefinedClass;

/**
 * @author josesmithesh
 */
public class IgnoreUnknownAnnotator extends AbstractAnnotator {

    @Override
    public void propertyInclusion(JDefinedClass clazz, JsonNode schema) {
        clazz.annotate(JsonIgnoreProperties.class).param("ignoreUnknown", true);
    }

    @Override
    public boolean isAdditionalPropertiesSupported() {
        return false;
    }

}
